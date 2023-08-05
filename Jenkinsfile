pipeline{
    agent any
    environment {
        DOCKERHUB_CRED = credentials('dockerhub')
    }
	
	stages{
	    
	    stage("SCM Checkout"){
	        steps{
	            git(
	            url:"https://github.com/dipanshusingh2107/phase5.git",
	            credentialId:"3ad7bcf3-a35f-48db-a458-d4392b0cd51b",
	            branch:"main"
	            )
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
