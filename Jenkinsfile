@Library('shared_library') _

import template.CommonGeneric

pipeline {
    agent any
    
    stages {
        stage('Hello World') {
            steps {
                script {
                    def commonGeneric = new CommonGeneric()
                    commonGeneric.call(this)
                }
            }
        }
    }
}
