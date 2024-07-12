@Library('shared_library') _

pipeline {
    agent any
    
    stages {
        stage('Example') {
            steps {
                script {
                    // Import commongeneric from shared library
                    def commongeneric = library.org.generic.commongeneric
                    
                    // Call the method defined in commongeneric.groovy
                    def url = 'https://github.com/OT-MICROSERVICES/attendance-api.git'
                    def creds = 'github-token'
                    def branch = 'main'
                    def repoUrl = 'https://github.com/OT-MICROSERVICES/attendance-api.git'
                    
                    // Call the method from commongeneric
                    commongeneric.runAll(url, creds, branch, repoUrl)
                }
            }
        }
    }
}
