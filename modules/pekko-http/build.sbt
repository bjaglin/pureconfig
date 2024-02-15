import Dependencies.Version._

crossScalaVersions := Seq(scala212, scala213)

libraryDependencies ++= Seq(
  "org.apache.pekko" %% "pekko-stream" % "1.0.2" % "provided",
  "org.apache.pekko" %% "pekko-http" % "1.0.1"
)
mdocLibraryDependencies ++= Seq(
  "org.apache.pekko" %% "pekko-stream" % "1.0.2"
)
