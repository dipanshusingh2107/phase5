pipeline{
    agent any
    
	stages{
	                      
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

	                   	    
	}

}
