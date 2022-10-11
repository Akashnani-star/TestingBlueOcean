pipeline {
  agent any
  stages {
    stage('Testing Env') {
      steps {
        sh 'echo $swaggerChecks'
      }
    }

  }
  environment {
    swaggerChecks = 'fw'
  }
}