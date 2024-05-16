pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                catchError {
                    bat '"C:\\Program Files\\apache-maven-3.9.6-bin\\apache-maven-3.9.6\\bin\\mvn" clean package -DskipTests=true'
                }
            }
        }
        stage('Test') {
            steps {
                catchError {
                   bat '"C:\\Program Files\\apache-maven-3.9.6-bin\\apache-maven-3.9.6\\bin\\mvn" clean test -Dmaven.test.failure.ignore=true'
                }
            }
            post {
                success {
                    publishHTML([ // Archive HTML report
                        allowMissing: true,
                        alwaysLinkToLastBuild: false,
                        keepAll: false,
                        reportDir: 'target/surefire-reports/',
                        reportFiles: 'emailable-report.html',
                        reportName: 'HTML Report',
                        reportTitles: '',
                        useWrapperFileDirectly: true
                    ])
                }
                failure {
                    echo 'Ignoring failed test cases.'
                }
            }
        }
        stage('Deployment') {
            steps {
                echo 'Deployed'
            }
        }
        stage('Clean Up') {
            steps {
                catchError {
                    echo 'Clean up completed'
                }
            }
        }
    }
}


