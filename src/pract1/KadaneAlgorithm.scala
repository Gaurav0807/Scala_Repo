package pract1

object KadaneAlgorithm {
  
  def main(args: Array[String]): Unit = {
  var arr=Array(-2,-3,4,-1,-2,1,5,-3);
  var n=arr.length;
  
  var start=0;
  var end=0; var s=0;var max_so_far=Long.MinValue; var max_ending_here=0;
  var i=0
  while(i <(arr.length))
  {
    max_ending_here += arr(i);
    if(max_so_far<max_ending_here)
    {
      max_so_far=max_ending_here;
      start=s;
      end=i;
    }
    if(max_ending_here<0)
    {
      max_ending_here=0;
      s=i+1;
    }
    i+=1;
  }
  
  println("Largest sum-continous array :- ",max_so_far);
  println("Start :-"+start+"End"+end);
  
  }
  
}