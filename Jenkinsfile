pipeline{
    agent any
    environment {
        DOCKERHUB_CRED = credentials('dockerhub')
    }
	
	stages{
	    
	    stage("SCM Checkout"){
	        steps{
	            git "https://github.com/dipanshusingh2107/phase5.git"
	        }
	    }
	    
	    stage("build docker image"){
		   	steps{
		   	    
		   	    sh	"./mvnw -B -DskipTests clean package"
		   	}

          	
     	}

	                     
	    stage("login docker"){
          steps{
         	sh "docker login -u $DOCKERHUB_CRED_USR -p DOCKERHUB_CRED_PSW"              
          }
      	}

	                    
      	stage("fun"){
      	    
      	    steps{
      	        sh "echo whattt"
      	    }

      	}



	    
	}

}
