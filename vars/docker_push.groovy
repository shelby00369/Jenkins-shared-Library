def call(string Project, String ImageTag, String dockerhubuser){
  echo "This is pushing the image to DockerHub"
  withCredentials([usernamePassword('credentialsId':"Jendocktoken",passwordVariable:"dockerhubpass",usernameVariable:"dockerHubUser")]){
      sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
  }
      sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
                       
}
