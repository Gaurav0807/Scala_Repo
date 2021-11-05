package pract1
import scala.io.StdIn._
object RootGivenNumber {
  def main(args:Array[String]):Unit={
    
    var ep:Double=1e-6;
    var x=readInt();
    var l=1;
    var h=x;
    var mid=0;
    while(h-l>ep)
    {
      mid=(h+l)/2;
      if(mid*mid<x)
      {
        l=mid;
      }
      else
      {
        h=mid;
      }
    }
    println("Nth Square root is"+l);
    
  }
}