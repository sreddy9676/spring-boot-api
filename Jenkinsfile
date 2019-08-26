node{
    env.PATH = "/opt/maven3/bin/:$PATH"
    def nexushost="http://172.31.46.186:8084"
    def dockerRepo="172.31.46.186:8084/spring:"+env.BUILD_ID
    stage('SCM checkout'){
        git credentialsId: 'git', url: 'https://github.com/sreddy9676/spring-boot-api'
    }
    stage('docker build'){
        sh 'mvn clean package'
        sh "docker build -t ${dockerRepo} ."
    }
    stage ('Nexus login and push images to nexus'){
       withCredentials([string(credentialsId: 'nexuspassword', variable: 'nexuspwd')]) {
        sh """
            docker login ${nexushost} -u admin -p ${nexuspwd}
            docker push ${dockerRepo}
           """
        }
    }
}
    
