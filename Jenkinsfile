
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out project'
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}
