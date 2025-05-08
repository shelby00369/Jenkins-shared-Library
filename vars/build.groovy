def call(String ProjectName, String ImageTag, String DockerHubUser) {
  echo "This is for building the code"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "code cloning success"
}
