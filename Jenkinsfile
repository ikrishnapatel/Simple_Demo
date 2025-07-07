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
                sh "mvn clean install"
            }
        }

        stage("Test") {
            steps {
                sh "mvn test"
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
