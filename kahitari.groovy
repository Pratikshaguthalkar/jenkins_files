pipeline {
    agent any 
    stages{
        stage (pull){
            steps{
                echo "we are pulling from github"
                git "https://github.com/Pratikshaguthalkar/software-studetnapp-project.git"
            }
        }

    }
}        