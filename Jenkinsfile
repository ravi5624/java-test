pipeline {
    agent any
    
    stages {
        
        stage ('Build') {
            steps {
                sh 'mvn -f javawithspringboot/pom.xml install' 
            }
        }
        stage('backuping') {
            steps {
                sh 'sudo cp /home/ravi/Documents/apache-tomcat-8.5.31/webapps/java-with-spring-boot-1.0-SNAPSHOT.jar /home/ravi/Documents/warbackup/warback.war'
            }
        }
        stage('deploy') {
            steps {
                sh 'scp /home/ravi/Documents/javabuildstest/java-test/javawithspringboot/target/java-with-spring-boot-1.0-SNAPSHOT.jar /home/ravi/Documents/apache-tomcat-8.5.31/webapps'
              }
        }
    }
}
