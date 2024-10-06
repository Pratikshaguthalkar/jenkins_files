pipeline {
    agent{
        label 'dummy'
    } 
    stages{
        stage (pull){
            steps{
                echo "we are pulling from github1"
                git "https://github.com/Pratikshaguthalkar/jenkins_files.git"
            }
        }

    }
}        