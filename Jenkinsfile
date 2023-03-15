pipeline {
    // The “agent” section configures on which nodes the pipeline can be run.
    // Specifying “agent any” means that Jenkins will run the job on any of the
    // available nodes.

	agent any

    environment{
      registryCredentials='dockerhub'
    }

    stages {
        stage('Git Pull') {
            steps {
                // Get code from a GitHub repository
                // Make sure to add your own git url and credentialsId
				git branch: 'master', url: 'https://github.com/vipul2097/SPEMiniProject.git',
                credentialsId: 'githubid'
            }
        }
        stage('Maven Build') {
            steps {
                // Maven build, 'sh' specifies it is a shell command
                sh 'mvn clean install'
            }
        }

        stage('Build Docker Images') {
            steps {
               sh 'docker build -t vipul2097/mini_dockerimage:latest .'
            }
        }

        stage('Publish Docker Images') {
            steps {
               withDockerRegistry([ credentialsId: "dockerhub", url: "" ]) {
               sh 'docker push vipul2097/mini_dockerimage:latest'
              }
            }
         }

         stage('Ansible Deploy'){
            steps{
              ansiblePlaybook colorized:true, disableHostKeyChecking:true, installation:'Ansible', inventory:'inventory', playbook:'playbook.yml'
            }
         }
    }
}