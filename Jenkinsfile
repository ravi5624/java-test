pipeline {
    agent any
    
    stages {
        
        stage ('Build') {
            steps {
                sh 'mvn -f pom.xml install' 
            }
            
        }
    }
}
