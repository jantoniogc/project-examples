  name := "com.opencanarias.ocas"
  version := "1.0"
  scalaVersion := "2.12.1"
  
  resolvers += "Artifactory" at "https://www.opencanarias.com/ic/repositorio/jcenter/"

  publishTo := Some("Artifactory sbt Example" at "https://www.opencanarias.com/ic/repositorio/temp/")

  credentials += Credentials("Artifactoryr","https://www.opencanarias.com/ic/repositorio","jgonzalez","may13may")

  libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
