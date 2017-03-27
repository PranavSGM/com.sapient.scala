package com.sapient.scala.practice

/*
 Ques4)  Write a High order function that takes an List[Any] and func literal (int) => Boolean and
         returns List with elements that satisfy functional lit.
*/

object ques4
{

  // Function Literal - Is the input int possible?
  val fl = (a:Int) => if( a <0) false
  else true

  //Higher-Order Function
  def hofunc(l:List[Int], fl:Int => Boolean):List[Int]=
  {
    l match
    {
      case head::tail if fl(head) => head::hofunc(tail,fl)
      case head::tail if !fl(head) =>hofunc(tail,fl)
      case nil => List()
    }
  }

  def main(args: Array[String]): Unit =
  {
    //Input List
    val x = List(1,2,-5,3,0,-5,4,0,-3,4,-5)
    println(s"Input => $x")

    //Function Invocation
    val result = hofunc (x, fl)
    println("Output => " + result)
  }
}
