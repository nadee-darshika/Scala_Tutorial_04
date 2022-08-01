println("Enter the deposit amount:");
val depositAmount = scala.io.StdIn.readDouble();

def interest(depositAmount : Double) : Double ={
  depositAmount match{
    case depositAmount if(depositAmount<=20000) => depositAmount*0.02;
    case depositAmount if(depositAmount<=200000.0) => depositAmount*0.04;
    case depositAmount if(depositAmount<=2000000.0) => depositAmount*0.035;
    case default => depositAmount*.065;
  }
};

println("\n\nInterset amount for Rs:"+ depositAmount + " is Rs:" +interest(depositAmount)+ "\n\n");
