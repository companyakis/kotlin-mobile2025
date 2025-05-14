fun main() {
    
    val x: Byte = 12 
    
    val y: Byte = 0 
    
    try {
        
        println("$x / $y = ${x / y}")
        
    } catch (e: Exception) {
        
        println("Zero division error!")
        println(e)
    }
    
}
