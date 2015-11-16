
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/play2-hands-on/conf/routes
// @DATE:Thu Nov 12 19:36:32 JST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_3: controllers.Application,
  // @LINE:9
  Assets_2: controllers.Assets,
  // @LINE:11
  UserController_1: controllers.UserController,
  // @LINE:22
  JsonController_0: controllers.JsonController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_3: controllers.Application,
    // @LINE:9
    Assets_2: controllers.Assets,
    // @LINE:11
    UserController_1: controllers.UserController,
    // @LINE:22
    JsonController_0: controllers.JsonController
  ) = this(errorHandler, Application_3, Assets_2, UserController_1, JsonController_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_3, Assets_2, UserController_1, JsonController_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/list""", """controllers.UserController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/edit""", """controllers.UserController.edit(id:Option[Long] ?= None)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/create""", """controllers.UserController.create"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/update""", """controllers.UserController.update"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/remove/$id<[^/]+>""", """controllers.UserController.remove(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """json/list""", """controllers.JsonController.list"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """json/create""", """controllers.JsonController.create"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """json/update""", """controllers.JsonController.update"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """json/remove/$id<[^/]+>""", """controllers.JsonController.remove(id:Long)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_3.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UserController_list2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/list")))
  )
  private[this] lazy val controllers_UserController_list2_invoker = createInvoker(
    UserController_1.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "list",
      Nil,
      "GET",
      """ Mapping to /user/list""",
      this.prefix + """user/list"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UserController_edit3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/edit")))
  )
  private[this] lazy val controllers_UserController_edit3_invoker = createInvoker(
    UserController_1.edit(fakeValue[Option[Long]]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "edit",
      Seq(classOf[Option[Long]]),
      "GET",
      """ Mapping to /user/edit or /user/edit?id=<number>""",
      this.prefix + """user/edit"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UserController_create4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/create")))
  )
  private[this] lazy val controllers_UserController_create4_invoker = createInvoker(
    UserController_1.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "create",
      Nil,
      "POST",
      """ Mapping to /user/create""",
      this.prefix + """user/create"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_UserController_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/update")))
  )
  private[this] lazy val controllers_UserController_update5_invoker = createInvoker(
    UserController_1.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "update",
      Nil,
      "POST",
      """ Mapping to /user/update""",
      this.prefix + """user/update"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UserController_remove6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UserController_remove6_invoker = createInvoker(
    UserController_1.remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "remove",
      Seq(classOf[Long]),
      "POST",
      """ Mapping to /user/remove/<number>""",
      this.prefix + """user/remove/$id<[^/]+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_JsonController_list7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("json/list")))
  )
  private[this] lazy val controllers_JsonController_list7_invoker = createInvoker(
    JsonController_0.list,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JsonController",
      "list",
      Nil,
      "GET",
      """ JSON API""",
      this.prefix + """json/list"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_JsonController_create8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("json/create")))
  )
  private[this] lazy val controllers_JsonController_create8_invoker = createInvoker(
    JsonController_0.create,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JsonController",
      "create",
      Nil,
      "POST",
      """""",
      this.prefix + """json/create"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_JsonController_update9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("json/update")))
  )
  private[this] lazy val controllers_JsonController_update9_invoker = createInvoker(
    JsonController_0.update,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JsonController",
      "update",
      Nil,
      "POST",
      """""",
      this.prefix + """json/update"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_JsonController_remove10_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("json/remove/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_JsonController_remove10_invoker = createInvoker(
    JsonController_0.remove(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.JsonController",
      "remove",
      Seq(classOf[Long]),
      "POST",
      """""",
      this.prefix + """json/remove/$id<[^/]+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_3.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_2.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_UserController_list2_route(params) =>
      call { 
        controllers_UserController_list2_invoker.call(UserController_1.list)
      }
  
    // @LINE:13
    case controllers_UserController_edit3_route(params) =>
      call(params.fromQuery[Option[Long]]("id", Some(None))) { (id) =>
        controllers_UserController_edit3_invoker.call(UserController_1.edit(id))
      }
  
    // @LINE:15
    case controllers_UserController_create4_route(params) =>
      call { 
        controllers_UserController_create4_invoker.call(UserController_1.create)
      }
  
    // @LINE:17
    case controllers_UserController_update5_route(params) =>
      call { 
        controllers_UserController_update5_invoker.call(UserController_1.update)
      }
  
    // @LINE:19
    case controllers_UserController_remove6_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UserController_remove6_invoker.call(UserController_1.remove(id))
      }
  
    // @LINE:22
    case controllers_JsonController_list7_route(params) =>
      call { 
        controllers_JsonController_list7_invoker.call(JsonController_0.list)
      }
  
    // @LINE:23
    case controllers_JsonController_create8_route(params) =>
      call { 
        controllers_JsonController_create8_invoker.call(JsonController_0.create)
      }
  
    // @LINE:24
    case controllers_JsonController_update9_route(params) =>
      call { 
        controllers_JsonController_update9_invoker.call(JsonController_0.update)
      }
  
    // @LINE:25
    case controllers_JsonController_remove10_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_JsonController_remove10_invoker.call(JsonController_0.remove(id))
      }
  }
}