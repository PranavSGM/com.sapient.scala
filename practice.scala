package com.sapient.scala.practice

/**
  * Created by pjai58 on 3/23/2017.
  */
object practice {
  def main(args: Array[String]): Unit =
  {

    //unbounded stream ~ Lazy List
    def inc(i:Int):Stream[Int] = i #:: inc(i+1)
    println(inc(1).take(5).toList)

    //bounded stream
    def tol(head:Char,end:Char):Stream[Char]= (head>end) match
    {
      case true => Stream()
      case false=> head #:: tol((head+1).toChar,end)
    }

    println(tol('A','p').take(100).toList)
    println(tol('A','p'))
  }

}
