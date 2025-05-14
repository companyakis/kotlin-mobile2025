fun main() {
    
    val x: Byte = 12 
    
    val y: Byte = 3 
    
    val years = ShortArray(5)
    
    
    try {
        
        println("$x / $y = ${x / y}")
        
        years[0] = 2011
        years[1] = 1997
        years[2] = 2007
        years[3] = 2018
        years[4] = 2025
        years[10] = 1990
        
    } catch (e: ArithmeticException) {
        
        println("Zero division error!")
        println(e)
        
    } catch(e: ArrayIndexOutOfBoundsException) {
        
        println("Please, consider array length!")
        println(e)
    }
    
}
