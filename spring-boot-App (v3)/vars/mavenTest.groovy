def call() {
    dir('spring-boot-App (v3)') {
        // Maven Test (mvn test)
        sh 'mvn test'
    }
}