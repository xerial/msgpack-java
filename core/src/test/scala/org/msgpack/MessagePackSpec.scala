package org.msgpack

import org.scalatest._
import matchers.{MustMatchers, ShouldMatchers}
import java.io.ByteArrayOutputStream
import java.lang.String
import scala.Predef.String
import scala.language.implicitConversions

trait MessagePackSpec extends WordSpec with Matchers with GivenWhenThen with OptionValues with BeforeAndAfter {

  implicit def toTag(t:String) = Tag(t)

  /**
   * Captures the output stream and returns the printed messages as a String
   * @param body
   * @tparam U
   * @return
   */
  def captureOut[U](body: => U) : String = {
    val out = new ByteArrayOutputStream
    Console.withOut(out) {
      body
    }
    new String(out.toByteArray)
  }

  def captureErr[U](body: => U) : String = {
    val out = new ByteArrayOutputStream
    Console.withErr(out) {
      body
    }
    new String(out.toByteArray)
  }

}


