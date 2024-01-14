pipeline
{
    agent any
    stages
    {
        stage('Build Jar'){
            steps{
               bat "mvn clean package -DskipTests"
            }
        }
        stage('Build-image'){
            steps{
                bat "docker build -t=ajaygoyal20/selenium ."
            }
        }
        stage('Push Image'){
//             environment{
//                 DOCKER_HUB = Credentials('dockerhub-creds')
//             }
            steps{
                
//                 sh 'echo "Service user is ${DOCKER_HUB_USR}"'
//                 sh 'echo "Service password is ${DOCKER_HUB_PSW}"'
//                 bat 'docker login -u %DOCKER_HUB_USR% -p %DOCKER_HUB_PSW%'
                bat "docker push ajaygoyal20/selenium"
            }
        }


    }
//     post {
//         always {
//             bat "docker logout"
//         }
//     }
}