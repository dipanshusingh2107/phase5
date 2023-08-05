pipeline{
    agent any
    
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
          	
          	withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'DUSER', passwordVariable: 'DPASS')]) {
        		sh "docker login -u $DUSER -p $DPASS"    
    		}
              
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
