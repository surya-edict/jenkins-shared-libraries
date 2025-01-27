def call(){
  stage('Push to Docker Hub') {
            steps {
                echo 'Push to Docker Hub'
                withCredentials([usernamePassword(credentialsId: 'dockerhub-cred', passwordVariable: 'dockerhubPass', usernameVariable: 'dockerhubUser')]) {
                    sh 'docker login -u $dockerhubUser -p $dockerhubPass'
}
  
