package com.sapient.scala.practice

/*
6)      Enhance List for :
a.      List(1,2,3,4,5,6,4,5,6,4).secondGreatest  = 5
b.      List(1,2,3,4,5,6,4,5,6,4).secondSmallest  = 2
c.      List(1,2,3,4).average = 2.5
d.      List(1,2,3,4,5,6,4,5,6,4).sumOfOdds =  14
e.      List(1,2,3,4,5,6,4,5,6,4) minus List(1,2,3,4) = List(5,6)
f.      List(1,2,3,4,5,6,4,5,6,4) plus List(1,2,3,7) = List(1,2,3,4,5,6,7)
*/
object ques_61
{
  class greatest_2(val l:List[Int])
  {
    def secondGreatest=
    {
      val order = l.sorted
      val d_order = order.distinct
      d_order match
        {
        case x if (x.size>=2) => d_order(d_order.size-2)
        case x if (x.size==1)  => x.head
        case nil => "Empty List"
        }
    }
  };implicit def secondGreatest(List:List[Int])=new greatest_2(List)

  class smallest_2(val l:List[Int])
  {
    def secondSmallest =
    {
      val order = l.sorted
      val d_order = order.distinct
      d_order match
      {
        case x if (x.size>=2) => d_order(1)
        case x if (x.size==1)  => x.head
        case nil => "Empty List"
      }
    }
  };implicit def secondSmallest(List:List[Int])=new smallest_2(List)

  class average(val l:List[Int])
  {
    def average =
    {
    val avg:Double = 1.0*l.sum / l.size
      l match
        {
        case x if(x.nonEmpty) => avg
        case nil => "Empty List"
        }
    }
  };implicit def averageof(List:List[Int])=new average(List)

  class sumofodd(val l:List[Int])
  {
    def sumOfOdds=
    {
      def rec(l:List[Int],sum:Int=0,c:Int=0,le:Int=0):Any=
         l match
       {
        case head::tail if(head%2 !=0) => rec(tail,sum+head,c+1,0)
        case head::tail if(head%2==0) =>rec(tail,sum,0,1)
        case _ if (c==0 && le==0) => "we do not have odd elements in this List ! "
        case nil => sum
       }
      if (l.nonEmpty) rec(l) else "Empty List"
    }
  };implicit def sumofodd123(List:List[Int])=new sumofodd(List)



  def main(args: Array[String]): Unit =
  {
    val inputa= List(0,2,-2)//(1,1,2,3,4,5,6,4,5,6,4)
    println("Input => "+ inputa)
    println("Sorted Input List =>"+inputa.sorted)

    val outa = inputa.secondGreatest
    println(s"Second largest element of List => $outa")

    val outb = inputa.secondSmallest
    println(s"Second smallest element of List => $outb")

    val outc = inputa.average
    println(s"Average of elements of List =>$outc")

    val outd = inputa.sumOfOdds
    println(s"sum of odd no.s in list =>$outd")








  }
}
