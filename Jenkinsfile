
peline {
    agent any
    tools {
        maven 'maven'
        jdk 'jdk17'
    }
    stages {
        stage('Git-Checkout') {
            steps {
                git branch: 'main', credentialsId: 'gitHub', url: 'https://github.com/rashmi-murthi/student-crud-minimal.git'
            }
        }
        stage('complile'){
            steps {
                sh 'mvn compile'
            }
        }
        stage('Build'){
            steps {
                sh 'mvn package'
            }
        }
    }
}
