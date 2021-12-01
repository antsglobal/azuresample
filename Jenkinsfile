pipeline {
    // any of the servers
    agent any
    def VERSION = "0.0.1"
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
                sh "mv target/azuresample-*.war target/azuresample.war"
                script {
                    VERSION = readMavenPom().getVersion()
                }
                echo("Build version: ${VERSION}") 
                sh "docker build -t azuresample:${VERSION} ."
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.war'
                }
            }
        }
        /*stage('Deploy') {
            steps {
                ansiblePlaybook credentialsId: 'ants', installation: 'ansible-playbook', inventory: 'ansible/hosts', playbook: 'ansible/deploy.yaml'
            }
        }*/
    }
}
