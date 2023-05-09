package zio.schema.testdata.common

import zio.schema._
import zio.Chunk

import scala.annotation.StaticAnnotation


object Shared {

  def c1(s: StaticAnnotation): Schema.Enum3[String, String, String, String] = {
    val caseA = Schema.Case[String, String](
      "A",
      Schema.primitive(StandardType.StringType),
      identity,
      identity,
      _.isInstanceOf[String]
    )
    val caseB = Schema.Case[String, String](
      "B",
      Schema.primitive(StandardType.StringType),
      identity,
      identity,
      _.isInstanceOf[String]
    )
    val caseC = Schema.Case[String, String](
      "C",
      Schema.primitive(StandardType.StringType),
      identity,
      identity,
      _.isInstanceOf[String]
    )
    Schema.Enum3(TypeId.Structural, caseA, caseB, caseC, Chunk(s))
  }
}
