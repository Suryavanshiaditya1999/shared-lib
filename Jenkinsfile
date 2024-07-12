// shared-lib/Jenkinsfile
pipeline {
    agent any
    
    stages {
        stage('Hello World') {
            steps {
                script {
                    // Load the shared library
                    @Library('shared-lib') _
                    
                    // Call the commongeneric function
                    template.commongeneric.call(this)
                }
            }
        }
    }
}
