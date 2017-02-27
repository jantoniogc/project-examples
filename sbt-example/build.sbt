
lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.1-SNAPSHOT",
    scalaVersion := "2.12.1"
  )

  resolvers += "Artifactory" at "https://www.opencanarias.com/ic/repositorio/jcenter/"

  publishTo := Some("Artifactory sbt Example" at "https://www.opencanarias.com/ic/repositorio/temp/")

  credentials += Credentials("Artifactory sbt Example", "https://www.opencanarias.com/ic/repositorio", "jgonzalez", "may13may")  
  //credentials += Credentials(new File("credentials.properties"))

  libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
