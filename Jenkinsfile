pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git branch: 'master', url: 'https://github.com/ZachK03/AirportWeatherTracker.git'
                bat './mvnw clean compile'
            }
        }
        stage('Publish') {
            steps {
                bat './mvnw package'
            }

            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('Run') {
            steps {
                bat 'java .\target\*.jar test KLEE'
                bat 'java .\target\*.jar test KMCO'
                bat 'java .\target\*.jar test KORL'
            }
        }
    }
}
