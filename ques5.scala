package com.sapient.scala.practice

/*
  ques5) Write a pure function to sub list from a given list  getSubList(List(1,2,3,4,5,6,7) , 3,5) = List(4,5,6)
*/

object ques5
{
  //Pure Function
  def getSubList(l:List[Int],a:Int,b:Int,c:Int=0):List[Int]= l match
  {
    case head::tail if(c>=a && c<=b ) =>head :: getSubList(tail,a,b,c+1)
    case head::tail if(c<a) => getSubList(tail,a,b,c+1)
    case head::tail if(c>b && c<l.size) => List()//getSubList(tail,a,b,c+1)
    // case head::tail if(c==l.size)=>List()
    case nil => List()
  }
  //Main Function
  def main(args: Array[String]): Unit =
  {
    val input = List(1,5,2,6,2,7,0,3)
    val start = 2
    val end = 5
    println(s"input,start,end => $input, $start, $end")
    val result:List[Int] = getSubList(input,start,end)
    println(s"output => $result")
  }
}
