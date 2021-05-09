package pers.cyz.bubble

object Sub {
  def main(args: Array[String]): Unit = {
    val a = "hello    world".split("\\s+")
    println(a.mkString("Array(", ", ", ")"))
  }

}
