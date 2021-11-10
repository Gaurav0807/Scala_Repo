package pract1

object SelectionSort {
  
  def swap(arr:Array[Int],i:Int,j:Int)
  {
    var tmp=arr(i)
    arr(i)=arr(j)
    arr(j)=tmp
  }
  
  def Selection(arr:Array[Int])={    
    var i=0
    while(i<(arr.length-1))
    {
      var min=i
      var j=i+1
      
      while(j<arr.length)
      {
        if(arr(j)<arr(min))
        {
          min=j
        }
        j+=1
      }
      swap(arr,i,min)
      i+=1
    }
  }
  
 def main(args:Array[String]):Int={
  var a=Selection(Array(12,45,23,51,19,8))
  
  for(i<-a)
  {
  println(a)
  }
 }
  
}