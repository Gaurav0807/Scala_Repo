package pract1
import scala.io.StdIn._
object ArmStrongNumber {
   def main(args: Array[String]): Unit = {
     
      var a:Int=readInt();
	 var b:Int=a;
	

	 var remainder:Int=0;
	 var result:Int=0

	 while(a!=0)
	 {
	   remainder=a%10;
	   result+=remainder*remainder*remainder;
	   a=a/10;
	   
	 }
	 if(result==b)
	 {
	   println("It a arm strong number");
	 }
	 else
	 {
	   println("It is not a arm strong number");
	 }
   }
}