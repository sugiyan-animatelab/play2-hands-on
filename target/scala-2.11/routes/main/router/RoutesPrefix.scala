
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/play2-hands-on/conf/routes
// @DATE:Thu Nov 12 19:36:32 JST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
