fun main(){
 greetperson("mercy")
 var remainder=division(50,3)
 println(remainder)
    addition(20,30,50,35)
    interesting(  "swimming")
}
fun greetperson(name:String){
    println("hello $name")

}
fun division(num1:Int,num2:Int):Int{
    var remainder=50%3
    return(remainder)

}
fun addition(num1:Int,num2:Int,num3:Int,num4:Int):Int{
    var sum=num1+num2+num3+num4
    return(sum)
    println(sum)

}
fun interesting(fact:String){
   println("i love $ fact")
}



