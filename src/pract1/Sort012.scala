package pract1

object Sort012 {
  
  def Sorting(arr:Array[Int])
  {
    var i:Int=0;
    var j:Int=0;
    var k:Int=arr.length-1;
    var temp:Int=0;
    while(i<=k)
    {
      if(arr(k)==2)
      {
        k-=1;
      }
      else if(arr(i)==0)
      {
        temp=arr(i);
        arr(i)=arr(j);
        arr(j)=temp;
        i+=1;
        j+=1;
      }
      else if(arr(i)==1)
      {
        i+=1;
      }
      
      else if(arr(i)==2)
      {
        temp=arr(i);
        arr(i)=arr(k);
        arr(k)=temp;
        k-=1;
      }
    }
    
    
  }
  
  def main(args:Array[String]):Unit={
    
    var arr=Array(0,1,2,0,1,2,0,0,1,2);
    Sorting(arr);
    for(i<-arr)
    {
      println(i);
    }
    
  }
}