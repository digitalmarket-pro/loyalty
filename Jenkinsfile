pipeline {
    agent any
  stages {
        stage('Starting') {
            steps {
                echo 'Building..'
                echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
                echo "JOB NAME = ${env.JOB_NAME}"
                echo "WORKSPACE =${WORKSPACE}"
                    }
        }
       stage('build') {
                           steps {
                               echo 'Building..'
                              sh 'mvn clean install'

                           }
                       }
            stage('Managing Service') {
                                                steps {
                                                    echo 'Managing the service ..'


                                                }
                                            }
    stage('Test') {
            steps {
                echo 'Testing..'
                sh 'who'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                  sh ' cp ${WORKSPACE}/target/Loyalty-0.0.1-SNAPSHOT.jar  /opt/apps/loyalty/app.jar'

            }
        }
    }
}