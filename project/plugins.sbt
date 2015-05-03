
addSbtPlugin("com.github.gseitz" % "sbt-release" % "0.8.5")

addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "0.3.3")

addSbtPlugin("com.typesafe.sbt" % "sbt-pgp" % "0.8.3")

addSbtPlugin("de.johoop" % "findbugs4sbt" % "1.3.0")

addSbtPlugin("de.johoop" % "jacoco4sbt" % "2.1.6")

scalacOptions ++= Seq("-deprecation", "-feature")
