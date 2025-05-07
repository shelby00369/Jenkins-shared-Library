def call(string ProjectName, String ImageTag, String DockerHubUser){
  echo "This is cloning the code"
    sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
   echo "code cloning success"
