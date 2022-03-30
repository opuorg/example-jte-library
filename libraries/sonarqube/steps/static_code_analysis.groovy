def var1 = load "../../../functions/first.grovvy"

void call(){
    
                   
    stage("SonarQube: Static Code Analysis"){
        
        println "static code analysis from the sonarqube library"
         var1.build("php build")
    }
}