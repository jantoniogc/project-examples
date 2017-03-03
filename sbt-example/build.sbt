
  name := "SBTExample"
  version := "1.0.0"
  scalaVersion := "2.12.1"
  organization := "com.opencanarias"

  
  resolvers ++= Seq (
    "Artifactory" at "https://www.opencanarias.com/ic/repositorio/ocas/",
    "msetlang" at "https://www.opencanarias.com/ic/repositorio/mset/mset-lang/"
  )

  publishTo := Some("Artifactory Realm" at "https://www.opencanarias.com/ic/repositorio/ocas/")

  credentials += Credentials(new File("credentials.properties"))


  libraryDependencies += "com.opencanarias" % "ocas_2.12" % "1.0.0"
  libraryDependencies += "mset-lang" % "2.1.0.20170117-I" % "plugins"
