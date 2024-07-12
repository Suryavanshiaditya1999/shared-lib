@Library('shared_library') _

import template.CommonGeneric

pipeline {
    agent any
    
    stages {
        stage('Hello World') {
            steps {
                script {
                    // Instantiate CommonGeneric class
                    def commonGeneric = new CommonGeneric()
                    
                    // Call the call method of CommonGeneric
                    commonGeneric.call(this)
                }
            }
        }
    }
}
