name := """play-scraper-sample"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
    .enablePlugins(PlayScala)
    .enablePlugins(org.nlogo.PlayScrapePlugin)

scalaVersion := "2.11.7"

scrapeRoutes ++= Seq("/")

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

