pipeline {
    agent any
    
    stages {
        
        stage ('Build') {
            steps {
                sh 'mvn -f javawithspringboot/pom.xml install' 
            }
            
        }
        stage('Setting the variables values') {
            steps {
                 bash '''#!/bin/bash
                         echo "hello world" 
                 '''
            }
        }
    }
}
