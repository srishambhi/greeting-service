pipeline {
  environment {
    registry = "srishambhi/kv_learning"
    registryCredential = 'shubham_docker'
    dockerImage = ''
  }
    agent any
    stages {
        stage('Build the project') { 
            steps {
                sh 'mvn -B -DskipTests clean package' 
            }
        }
        stage('Unit test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage("Run on local") {
        steps {
         sh './deploy.sh'
        }
    }
    stage('Deploy Image to docker hub') {
  steps{    script {
        dockerImage = docker.build registry + ":$BUILD_NUMBER"
        docker.withRegistry( '', registryCredential ) {
        dockerImage.push()
      }
    }
  }
}
    
    }
}