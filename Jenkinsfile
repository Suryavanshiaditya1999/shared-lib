@Library('shared_library') _

pipeline {
    agent any
    
    stages {
        stage('Hello World') {
            steps {
                script {
                    def commonGeneric = load "template/commongeneric.groovy"
                    
                    // Call the call method of CommonGeneric
                    commonGeneric.call(this)
                }
            }
        }
    }
}
