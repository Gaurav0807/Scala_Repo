package pract1

object FindMaxValue{
  def main(args:Array[String]):Unit={
    var number=Array(1,2,35,4,55,6,79,89);
    var minVal=Long.MinValue;
    var maxVal:Int = 0;
    for(i<-number)
    {
      if(i>minVal)
      {
        maxVal=i;
      }
    }
    
    println("Maximum in the array :-"+maxVal);
  }
  
}