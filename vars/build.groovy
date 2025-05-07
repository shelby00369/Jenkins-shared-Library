def call(string ProjectName, String ImageTag, String DockerHubUser){
  echo "This is for building the code"
    sh "docker build -t ${Jendocktoken}/${ProjectName}:${ImageTag} ."
   echo "code cloning success"
