package com.sapient.scala.practice

/*
Ques1) Remove consecutive duplicates from a list
      Input List Like : List(1,1,2,2,2,3,3,1,1,4,5,5,6,7,5,5,5,8,7,7)
      Output Like should be : List(1,2,3,1,4,5,6,7,5,8,7)
*/

object ques1
{
  //Pattern-Matching Function
  def compress[T](l1 : List[T]) : List[T] = l1 match
  {
    case head::nxt::tail if head == nxt => compress(nxt::tail)
    case head::tail => head::compress(tail)
    case nil => Nil
  }

  //Main Function
  def main(args: Array[String]): Unit =
  {
    val input = List(1,1,2,2,2,3,3,1,1,4,5,5,6,7,5,5,5,8,7,7)
    val y= println("Input => "+input)
    val output = println("Output =>" + compress(input) )
  }
}
