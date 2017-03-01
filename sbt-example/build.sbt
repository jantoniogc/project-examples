  name := "SBTExample"
  version := "1.0.0"
  scalaVersion := "2.12.1"
  organization := "com.opencanarias"

  publishMavenStyle := true,

  publishArtifact in Test := false,

  pomIncludeRepository := { _ ⇒ false },
  
  resolvers += "Artifactory" at "https://www.opencanarias.com/ic/repositorio/jcenter/"

  publishTo := Some("Artifactory Realm" at "https://www.opencanarias.com/ic/repositorio/ocas/")

  credentials += Credentials(new File("credentials.properties"))


  libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"
