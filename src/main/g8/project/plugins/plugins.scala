import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  lazy val appengine = "net.stbbs.yasushi" % "sbt-appengine-plugin" % "2.1"
}
