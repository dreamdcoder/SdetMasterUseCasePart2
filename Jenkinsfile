pipeline {
  agent any
  stages {
    stage('Fetch') {
      steps {
        git 'https://github.com/dreamdcoder/SdetMasterUseCasePart2'
      }
    }

    stage('run') {
      steps {
        bat 'mvn verify'
      }
    }

  }
}