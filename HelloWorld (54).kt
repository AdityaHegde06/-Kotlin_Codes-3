//KOTLIN PROGRAM  TO CHECK ALPHBET USING IF else

/*fun main()
{
  val c = "b"
  
 if(c >= "a" && c <= "b" || c >= "A" && c <= "Z")
  {
  println("$c is an alphabet")
  }
  else
  {
    println("$c is not an alphabet")
  }
  
}


*/

fun main()
{
  val c ='a'
  
  if(c in 'a'..'z' || c in 'A'..'Z')
  {
    println("$c ia an alphabet")
    }
    
    else 
    {
      println("$c is not an alphabet ")
    }
}