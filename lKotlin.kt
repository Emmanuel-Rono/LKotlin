fun sum(a:Int,b:Int)
{
    val sumOf= a+b
    val ssum=sumOf.toInt()
    return sumOf
}

fun main() {
    
    val valu1=100
    val val2=200
    var result2=sum(valu1,val2)
    println(result2)
val exp1="Talk is cheap"
    val exp2="show us the code "
    print("$exp1, $exp2")
    val name :String="Emmanuel"
    val age:Int=1000
    print("$name is of age: $age")
    
        //Null exeption
    var name2 :String ?="Hello "
    name2=null
    print(name2)
     //Operations
     val a=100 
    val b=200
    val result=a+b
    print(result)
}