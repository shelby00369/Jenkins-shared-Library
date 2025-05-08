def call() {
    echo "This is for deploying the app"
    sh "docker run -d -p 8000:8000 notes-app:latest"
}
