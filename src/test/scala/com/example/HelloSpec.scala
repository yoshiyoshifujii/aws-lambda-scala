package com.example

import org.specs2.mutable.Specification
import org.junit.runner.RunWith
import org.specs2.mutable._
import org.specs2.runner.JUnitRunner
import org.specs2.specification.Scope
import scala.collection.JavaConverters._

@RunWith(classOf[JUnitRunner])
class HelloSpec extends Specification {

  sequential

  "HelloSpec" should {
    "hello" in new WithFixture {
      val res0 = hello(1, new Mock.ContextMock {})
      res0.isEmpty must_== false
      res0.asScala.map { s =>
        s must_== "1"
      }
    }
  }

  trait WithFixture extends Scope with HelloBase
}
