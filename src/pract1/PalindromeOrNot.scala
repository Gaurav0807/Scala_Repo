package pract1
import scala.io.StdIn._;

object PalindromeOrNot {
  
  def is_Palindrome(a:String)= {
    a ==a.reverse    
  }
  
  def main(args:Array[String]):Unit={
    
    var a:String=readLine();
    println("Palindrome Or Not"+is_Palindrome(a));
    
  }
}