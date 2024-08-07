def call() {
    dir('spring-boot-App (v3)') {
        // Maven Build (mvn install)
        sh 'mvn clean install'
    }
    sh "ls spring-boot-war-example-1/target/"
}
