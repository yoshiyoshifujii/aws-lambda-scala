package com.example

import scala.collection.JavaConverters._
import com.amazonaws.services.lambda.runtime.Context

trait HelloBase {

  def hello(myCount: Int, context: Context): java.util.List[String] = {
    println("Hello World!!")
    List("%d".format(myCount)).asJava
  }
}

class Hello extends HelloBase
