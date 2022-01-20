name := "example-spark-session-extension"

version := "0.1"

scalaVersion := "2.12.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "3.1.1" % "provided",
  "org.apache.spark" %% "spark-sql" % "3.1.1" % "provided"
)

scalacOptions ++= Seq("-unchecked", "-deprecation", "-encoding", "utf8", "-feature")