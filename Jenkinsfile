node {
    checkout scm
    sh './mvnw -B -DskipTests clean package'
    docker.build("dipanshusingh2107/phase5").push()
}