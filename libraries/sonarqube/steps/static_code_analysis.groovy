void call(){
    def var1 = load "first.groovy"
                   
    stage("SonarQube: Static Code Analysis"){
        println "static code analysis from the sonarqube library"
         var1.build("php build")
    }
}