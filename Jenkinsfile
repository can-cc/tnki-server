pipeline {
    agent {
        docker {
            image 'gradle:6.0.1-jdk8'
        }
    }
    triggers {
        pollSCM('*/1 * * * *')
    }
    stages {
        stage('test') {
            steps {
                sh './gradlew test'
            }
        }
    }
    post {
        always {
            rocketSend currentBuild.currentResult
        }
    }
}