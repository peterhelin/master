package programingscala.patternmatching

/**
 * MatchVararglist
 *
 * @author tyee.noprom@qq.com
 * @time 2/20/16 12:06 PM.
 */
object Op extends Enumeration {
  type Op = Value
  val EQ = Value("=")
  val NE =Value("!=")
  val LTGT = Value("<>")
  val LT =Value("<")
  val LE =Value("<=")
  val GT =Value(">")
  val GE =Value(">=")
}

import Op._


//def main (args: Array[String] ) {
//  case class WhereOp[T](columnName: String, op: Op, value: T)
//  case class WhereIn[T](columnName: String, val1: T, vals: T*)
//  val wheres = Seq(
//    WhereIn("state", "IL", "CA", "VA"),
//    WhereOp("state", EQ, "IL"),
//    WhereOp("name", EQ, "Buck Trends"),
//    WhereOp("age", GT, 29))
//  )
//  for (where <- wheres) { where match {
//    case WhereIn(col, val1, vals @ _*) => //
//    val valStr = (val1 +: vals).mkString(", ")
//    println (s"WHERE $col IN ($valStr)")
//    case WhereOp(col, op, value) => println (s"WHERE $col $op $value")
//    case _ => println (s"ERROR: Unknown expression: $where") }
//  }
//}