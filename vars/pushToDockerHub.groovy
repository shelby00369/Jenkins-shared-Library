def call() {
    echo "This is pushing the image to DockerHub"
    withCredentials([usernamePassword(
        credentialsId: "Jendocktoken",
        passwordVariable: "dockerhubpass",
        usernameVariable: "dockerHubUser"
    )]) {
        sh "docker login -u ${dockerHubUser} -p ${dockerhubpass}"
        sh "docker image tag notes-app:latest arthurboy007/notes-app:latest"
        sh "docker push arthurboy007/notes-app:latest"
    }
}
