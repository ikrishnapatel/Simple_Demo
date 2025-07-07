pipeline {

    agent any

    stages {

        stage("Cleanup Directry") {
            steps {
                deleteDir()
            }
        }

        stage("Build") {
            steps {
                dir("Simple_Demo") {
                    sh "mvn clean install"
                }
            }
        }

        stage("Test") {
            steps {
                dir("Simple_Demo") {
                    sh "mvn test"
                }
            }
        }

        stage("Build Complete")
        {
            steps {
                echo "Build is completed."
            }
        }
    }
}