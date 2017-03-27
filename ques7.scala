package com.sapient.scala.practice

/*
Ques 7) Pure function for =>
List(3,4,5,6) = List(List(1,2,3) , List(1,2,3,4 ),  List(1,2,3,4,5), List(1,2,3,4,5,6))
*/

object ques7
{

  //Function - creating the Internal Lists
  def lol (head:Int, start:Int=1):List[Int] = head match
  {
    case h if (h >= start) => start :: lol(h,start+1)
    case h if (h<start) => Nil
  }

  //Function - creating the outer List of List
  def lol2 (l:List[Int]):List[List[Int]]= l match
  {
    case head::tail if (l.nonEmpty) => (lol(head)::lol2(tail))
    case nil => Nil
  }

  //Main Function
  def main(args: Array[String]): Unit =
  {
    val input =List(3,4,5,6)
    println(s"The Input List => $input")
    val out1 = lol2(input)
    println(s"The Output List of List => $out1")
  }
}
