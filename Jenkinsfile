pipeline {

    agent any

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out code...'

                git branch: 'main',
                    url: 'https://github.com/bhavagna2005/devops_week5'
            }
        }

        stage('Build') {
            steps {
                echo 'Building...'

                bat 'javac factorial.java Testfactorial.java'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'

                bat 'java Testfactorial'
            }
        }

    }
}
        