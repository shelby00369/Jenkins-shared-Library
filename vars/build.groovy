def call(String unused) {
    echo "Building the Docker image"
    sh "docker build -t notes-app:latest ."
}
