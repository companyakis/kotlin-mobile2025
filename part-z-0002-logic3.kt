fun main() {
    
    val a: Byte = 12
    
    val b: Byte = 10
    
    val result1 = (a > b) && !(a != b)
    
    println(result1) // false
    
    val result2 = (a == b) || (b != a)
    
    println(result2) // true
     
}
