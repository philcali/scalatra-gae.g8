import sbt._

class Project(info: ProjectInfo) extends AppengineProject(info) {
  val scalatraVersion = "2.0.0.M3" 

  lazy val scalatra = "org.scalatra" %% "scalatra" % scalatraVersion
}
