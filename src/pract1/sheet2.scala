package pract1
import scala.io.StdIn._
object sheet2 {
   def main(args: Array[String]): Unit = {
     println("Enter length")
  val n:Int=readInt();
  val l:Int=readInt();
 val a:String=readLine();
 val c:Array[Int]=a.split(" ").map(_.toInt);
 var count=0;
 for(i<-c)
 {
 if(i>l)
 {
 count+=1;
 }
 }
 println(s"Number greater than $l  is"+count);
  }
  
}