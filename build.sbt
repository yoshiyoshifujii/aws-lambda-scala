val Version = "0.1-SNAPSHOT"

lazy val root = (project in file(".")).settings(
  name := "aws-lambda-scala",
  version := Version,
  organization := "com.hoge",
  scalaVersion := "2.11.7",
  libraryDependencies ++= Seq(
    "com.amazonaws" % "aws-lambda-java-core" % "1.0.0",
    "com.amazonaws" % "aws-lambda-java-events" % "1.1.0",
    "org.specs2" %% "specs2-core" % "3.6" % "test",
    "org.specs2" %% "specs2-mock" % "3.6" % "test",
    "org.specs2" %% "specs2-junit" % "3.6" % "test"
  ),
  assemblyJarName in assembly := "aws-lambda-scala-%s.jar" format(Version)
)

