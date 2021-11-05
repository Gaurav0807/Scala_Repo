package pract1


object BinarySearch {
  def RecursiveBinary(arr:Array[Int],Element:Int)(low:Int=0,high:Int=arr.length-1):Int=
  {
    if(low>high)
      return -1
    
      var middle=low+(high-low)/2;
    if(arr(middle)==Element)
      return middle
    else if(arr(middle)>Element)
      return RecursiveBinary(arr,Element)(low,middle-1)
    else
      return RecursiveBinary(arr,Element)(middle+1,high)
  }
  
  def main(args:Array[String]):Unit={
    
    var index=RecursiveBinary(Array(1,2,3,4,55,65,75),4)(0,6);
    
    if(index == -1)
    {
      println("Not found");
    }
    else
    {
      println("Found 4 at "+index);  
    }
    
    
  }
}