package com.sapient.scala.practice

/*
Ques 3)  Write a pure function that takes Any and returns its datatype.
*/

object ques3
{
  //Function
  def dtype(x:Any)= x.getClass

  //Main function
  def main(args: Array[String]): Unit =
  {
    val input = 23
    println(s"Input => $input")
    println(s"Output: Datatype => "+ dtype(input))

  }
}
