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
      println(); println(" ******** Second Greatest ******** ")
      if(l.nonEmpty) println("Sorted Input List =>"+ l.sorted)
      val order = l.sorted
      val d_order = order.distinct
      d_order match
        {
        case x if (x.size>=2) => d_order(d_order.size-2)
        case x if (x.size==1)  => "List has only one Element !"
        case nil => "Empty List"
        }
    }
  };implicit def secondGreatest(List:List[Int])=new greatest_2(List)

  class smallest_2(val l:List[Int])
  {
    def secondSmallest =
    {
      println(); println(" ******** Second Smallest ******* ")
      if(l.nonEmpty) println("Sorted Input List =>"+ l.sorted)
      val order = l.sorted
      val d_order = order.distinct
      d_order match
      {
        case x if x.size>=2 => d_order(1)
        case x if x.size==1 =>  "List has only one Element !"
        case nil => "Empty List"
      }
    }
  };implicit def secondSmallest(List:List[Int])=new smallest_2(List)

  class average(val l:List[Int])
  {
    def average:Any =
    {
      println(); println(" ******** Average ******* ")
      if(l.nonEmpty) println("Sorted Input List =>"+ l.sorted)
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
    def sumOfOdds =
    {
      def rec(l:List[Int],sum:Int=0,c:Int=0,onlyeven:Int=0):Any=
         l match
       {
           //Odd
           case head::tail if(head%2 !=0) => rec(tail,sum+head,c+1,0)
            //Even
           case head::tail if(head%2==0) => rec(tail,sum,c,1)
            //if List has no odd element: For Only Even -
           case nil if(c==0 && onlyeven==1) => " Only Even elements in this List ! "
           //Empty List
           case nil => sum
       }
      println(); println(" ******** Sum_Of_Odds ******* ")
      if (l.nonEmpty){ println("Sorted Input List =>" + l.sorted) ;rec(l)}
      else "Empty List"
    }
  };implicit def sumofodd123(List:List[Int])=new sumofodd(List)

  class plusclass(l:List[Int],p:List[Int])
  {
    def plus
    {
      val listcomb = List(l,p).flatten
      println(); println(" ******* PLUS ******* ")
      if(l.nonEmpty && p.nonEmpty)
      {
        println("Sorted Input List => " + l.sorted); println("Sorted Plus List => " + p.sorted)
        listcomb.sorted.distinct
      }
    }
  }//;implicit def plusList(l:List[Int],p:List[Int])= new plusclass(l,p)



  def main(args: Array[String]): Unit =
  {
    val inputa= List(2,4)//(1,1,2,3,4,5,6,4,5,6,4)
    println("Input => "+ inputa)

    println(s" Second largest element of List => "+ inputa.secondGreatest )

    println(s" Second smallest element of List => " + inputa.secondSmallest )

    println(s" Average of elements of List => "+ inputa.average)

    println(s" sum of odd no.s in list => "+ inputa.sumOfOdds)

   // println(s" List 1 Plus List 2 => " + plus(inputa,List(1,2,2,7,7,9)))

  }
}


//List(1,2,2,7,7,9))