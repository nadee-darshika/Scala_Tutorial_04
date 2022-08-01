println("Enter any number: ");
val num = scala.io.StdIn.readInt();

def numberCheck(num: Int):String={
  num match{
    case num if(num<=0) => "Negative/Zero is input";
    case num if(num%2==0) => "Even number is given";
    case default => "Odd number is given";
  }; 
}

println("\n\n"+numberCheck(num)+"\n\n");
