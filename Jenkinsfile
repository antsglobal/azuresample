pipeline {
    // any of the servers
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                // git 'https://github.com/antsglobal/azuresample.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
        }
        stage('Deploy') {
            steps {
                sh "mv target/api-*.war target/api.war"
                ansiblePlaybook credentialsId: 'ants', installation: 'ansible-playbook', inventory: 'ansible/hosts', playbook: 'ansible/deploy.yaml'
            }
        }
    }
}
