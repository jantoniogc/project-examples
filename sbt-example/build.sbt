
  name := "SBTExample"
  version := "1.0.0"
  scalaVersion := "2.12.1"
  organization := "com.opencanarias"

  externalIvySettings()


  resolvers ++= Seq (
    "Artifactory" at "https://www.opencanarias.com/ic/repositorio/ocas/",
    "mset-lang" at "https://www.opencanarias.com/ic/repositorio/mset"
  )

  publishTo := Some("Artifactory Realm" at "https://www.opencanarias.com/ic/repositorio/ocas/")

  credentials += Credentials(new File("credentials.properties"))


  libraryDependencies += "com.opencanarias" % "ocas_2.12" % "1.0.0"
  libraryDependencies += "bundle" % "com.isb.qahost.adqa.cobol.cst.parser.source" % "1.0.0.20170117-I"
