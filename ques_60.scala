package com.sapient.scala.practice

/**
  * Created by pjai58 on 3/27/2017.

Ques-6.1:  List(1,2,3,4,5,6,4,5,6,4).secondGreatest  = 5
*/

object ques_60
{
  def main(args: Array[String]): Unit =
  {
    val input = List(1,2,3,4,5,6,4,5,6,4)
    var max = 0

    def greatest(l:List[Int],a:Int=0):Int = l match
      {
        case head::tail if(a<head) => greatest(tail,head)
        case head::tail if(a>=head)=> greatest(tail,a)
        case nil => a
      }
    val result = greatest(input)
    println(s"the input List = $input")
    println(s"the greatest element of the List = $result ")
println("use of sortBy =>")
//println(List(1,2,3,4,5,2,3,4,1) sortBy )



  }
}
