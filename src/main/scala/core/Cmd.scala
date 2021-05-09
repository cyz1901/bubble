package pers.cyz.bubble
package core

object Cmd {
  def parsing(args : String): Unit = {
    val cmdArray = args.split("\\s+")
    println(cmdArray)
  }
}
