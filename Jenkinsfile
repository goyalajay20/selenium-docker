pipeline
{
    agent any
    stages
    {
        stage('Build Jar'){
            steps{
               bat 'mvn clean package -DskipTests'
            }
        }
        stage('Build-image'){
            steps{
                bat 'docker build -t=ajaygoyal20/selenium:latest .'
            }
        }
        stage('Push Image'){
            environment{
                DOCKER_HUB = credentials('dockerhub-creds')  // credentials method is not working in local system.
            }
            steps{
                bat 'echo ${DOCKER_HUB_PSW} | docker login -u ${DOCKER_HUB_USR} --password-stdin'
                //bat 'docker login -u %DOCKER_HUB_USR% -p %DOCKER_HUB_PSW%'
                bat 'docker push ajaygoyal20/selenium:latest'
                bat "docker tag ajaygoyal20/selenium:latest ajaygoyal20/selenium:${env.BUILD_NUMBER}"
                bat "docker push ajaygoyal20/selenium:${env.BUILD_NUMBER}"
            }
        }
    }
    post {
        always {
            bat "docker logout"
        }
    }
}