package zio.schema.codec

import scala.annotation.StaticAnnotation

//#todo import org.apache.avro.Schema.Field

object JsonAnnotations {

  final case class name(name: String) extends StaticAnnotation
}