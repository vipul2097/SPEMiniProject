pipeline {
    // The “agent” section configures on which nodes the pipeline can be run.
    // Specifying “agent any” means that Jenkins will run the job on any of the
    // available nodes.

	agent any

    stages {
        stage('Git Pull') {
            steps {
                // Get code from a GitHub repository
                // Make sure to add your own git url and credentialsId
				git branch: 'master', url: 'https://github.com/vipul2097/SPEMiniProject.git',
                credentialsId: 'gitid'
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
               docker.build "vipul2097/SPEMiniProject:latest"
            }
        }

    }
}