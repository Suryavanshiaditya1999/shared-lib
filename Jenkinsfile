@Library('shared_library') _

pipeline {
    agent any
    
    stages {
        stage('Hello World') {
            steps {
                script {
                    // Load the shared library
                   
                    
                    // Call the commongeneric function
                    template.CommonGeneric.call(this)
                }
            }
        }
    }
}
