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
                sh 'scp /home/ravi/Documents/apache-tomcat-8.5.31/webapps/javatest.war /home/ravi/Documents/warbackup/javatest.war_$BUILD_TIMESTAMP'
            }
        }
        stage('deploy') {
            steps {
                sh 'scp /home/ravi/Documents/javabuildstest/java-test/javawithspringboot/target/java-with-spring-boot-1.0-SNAPSHOT.jar /home/ravi/Documents/apache-tomcat-8.5.31/webapps/javatest.war'
              }
        }
    }
}
