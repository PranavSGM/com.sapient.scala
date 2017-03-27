package com.sapient.scala.practice

/*
Ques2)  Write a High Order function that can take two integers and an functional literal of type  (int,int) => double
        and returns the result after applying the function on integers.
*/

object ques2
{
  //Function Literal - Divide 2 no.
  val divide = (a: Int, b: Int) => if (b != 0) 1.0 * a / b else 00.00

  //Higher-Order Function
  def hofunc(x: Int, y: Int, f: (Int, Int) => Double): Double =f(x,y)

  //Main Function
  def main(args: Array[String])
  {
    val division = hofunc(_: Int, _: Int, divide)
    println("Division = " + division(1,9))
  }
}