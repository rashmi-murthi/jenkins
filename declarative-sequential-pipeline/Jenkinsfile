pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'java-17'
    }
    stages {
        stage('Git-Checkout') {
            steps {
                git branch: 'main', credentialsId: 'github', url: 'https://github.com/rashmi-murthi/student-crud-minimal.git'
            }
        }
        stage('complile'){
            steps {
                sh 'mvn compile'
            }
        }
        stage('Build'){
            steps {
                sh 'mvn package -DskipTests'
            }
        }
        stage('Docker-Build'){
            steps {
                sh 'docker build -t rashmimurthi/student-app:${BUILD_NUMBER} .'
            }
        }
        stage('Docker-Login-Push'){
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub', passwordVariable: 'DOCKER_PASS', usernameVariable: 'DOCKER_USER')]){
                    sh '''
                    echo "$DOCKER_PASS" | docker login -u "$DOCKER_USER" --password-stdin 
                    docker push rashmimurthi/student-app:${BUILD_NUMBER}
                   '''
                }
            }
        }
         stage('Docker-Deployment'){
            steps {

                sh '''
                docker stop student-app || true
                docker rm student-app || true
                docker run -d -p 8081:8080 --name student-app rashmimurthi/student-app:${BUILD_NUMBER}
                '''
            }                
        }
       
    }
}
