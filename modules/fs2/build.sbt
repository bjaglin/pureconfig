import Dependencies.Version._

crossScalaVersions := Seq(scala212, scala213, scala3)

libraryDependencies ++= Seq(
  "co.fs2" %% "fs2-core" % "3.9.4",
  "co.fs2" %% "fs2-io" % "3.9.4"
)

developers := List(Developer("keirlawson", "Keir Lawson", "keirlawson@gmail.com", url("https://github.com/keirlawson")))
