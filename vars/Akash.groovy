def call(Closure cl){
  return pipeline{
    agent any
    stages{
      stage("A"){
        steps{
          echo "Akash"
          script{
            echo "${cl}"
          }
        }
      }
    }
  }
}
