package com.example
import org.scalatra.ScalatraServlet
import org.scalatra.scalate.ScalateSupport

class HelloApp extends ScalatraServlet with ScalateSupport {

  get("/") {
    contentType = "text/html"
    jade("/index")//, name)
  }

}
