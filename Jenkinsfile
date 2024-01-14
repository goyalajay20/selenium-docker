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
            steps{
                bat "docker push ajaygoyal20/selenium"
            }
        }
    }
}