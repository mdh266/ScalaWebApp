package com.example
import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport

class HelloApp(var name : String) extends ScalatraServlet with ScalateSupport {

  get("/") {
    contentType = "text/html"
    jade("/index", "name" -> name)
  }

  post("/new") {
    name = params.get("name").get
 	redirect("/")
 }

}
