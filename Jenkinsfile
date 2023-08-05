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
	            credentialsId:"3ad7bcf3-a35f-48db-a458-d4392b0cd51b",
	            branch:"main"
	            )
	        }
	    }
	                     
	    stage("login docker"){
          steps{
          	sh "echo $PATH"
          	sh "docker login -u $DOCKERHUB_CRED_USR -p $DOCKERHUB_CRED_PSW"              
          }
      	}
      	
      	stage("build docker image"){
		   	steps{
		   	    
		   	    sh	"./mvnw -B -DskipTests clean package"
		   	}
     	}
      	
		
		stage("Push to docker hub"){
		 	steps{
               
               sh "docker push dipanshusingh2107/phase5:latest"
           }
                  
         }

	                    
      	stage("fun"){
      	    
      	    steps{
      	        sh "echo whattt"
      	    }

      	}
	    
	}

}
