import scala.compiletime.ops.string

def toUpper(str : String) : String = {
  return str.toUpperCase;
}

def toLower(str : String) : String = {
  return str.toLowerCase;
}

def formatNames(name : String)(namesOfFunc : String => String) : String ={
  namesOfFunc(name);
}

def firstTwoUpper(str : String) : String ={
  val strLength = str.length();
  toUpper(str.substring(0,2)) + toLower(str.substring(2,strLength));
}

def firstAndLastUpper(str : String) : String ={
  val strLength = str.length();
  toUpper(str.substring(0,1)) + toLower(str.substring(1,strLength - 1)) + toUpper(str.substring(strLength-1,strLength));
}

println("\n\n" + formatNames("Benny")(toUpper(_)));
println(formatNames("Niroshan")(firstTwoUpper(_)));
println(formatNames("Saman")(toLower(_)));
println(formatNames("Kumara")(firstAndLastUpper(_)));


