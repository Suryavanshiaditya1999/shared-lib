@Library('shared-lib') _

pipeline {
    agent any
    
    stages {
        stage('Run CoveragePython') {
            steps {
                script {
                    // Call CoveragePython function directly
                    callCoveragePython()
                }
            }
        }
        stage('Run Coverage2') {
            steps {
                script {
                    // Call Coverage2 function directly
                    callCoverage2()
                }
            }
        }
        stage('Hello World') {
            steps {
                script {
                    // Additional steps if needed
                }
            }
        }
    }
}
