package pract1
import scala.io.StdIn._;

object ReverseArray {
  
  def main(args:Array[String]):Unit={
    
    var a:String=readLine();
    var b:Array[Int]=a.split(" ").map(_.toInt);
    
    var i:Int=0;
    var j:Int = b.length-1;
    var temp:Int=0;
    while(i<=j)
    {
      temp=b(i);
      b(i)=b(j);
      b(j)=temp;
      i+=1;
      j-=1;
    }
    
    for(e<-b)
    {
      println(e);
    }
    
    
    
    
    
  }
}