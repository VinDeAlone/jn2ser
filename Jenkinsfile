

pipeline{
   agent any
   tools{
      maven "Maven"
   }
   stages{
      stage("Git checkout and build project"){
         steps{
            checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/VinDeAlone/jn2ser']])
            powershell "mvn clean install"
         }
      }
      stage("Build docker image"){
         steps{
            powershell "docker build -t vindealone/demoservicejmimage:0.0.1 ."
         }
      }
      stage("Upload docker image to docker hub"){
         steps{
            withCredentials([string(credentialsId: 'docker-pwd', variable: 'dockerpwd')]) {
               powershell "docker login -u vindealone -p ${dockerpwd}"
            }
            powershell "docker push vindealone/demoservicejmimage:0.0.1"
         }
      }
   }
}


