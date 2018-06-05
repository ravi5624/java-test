pipeline {
    agent any
    
    stages {
        
        stage ('Build') {
            steps {
                sh 'mvn -f javawithspringboot/pom.xml install' 
            }
            
        }
        stage('deploy') {
              steps {
                sh 'build.sh'
              }
        }
    }
}
