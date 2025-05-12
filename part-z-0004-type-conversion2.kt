fun main() {
    
    var x: String = "100"
    
    var y: String = "120"
    
    var q: String = "120 a"
    
    try {
        
        var num = q.toShort()
        
        println("Line 1 worked!")
    }
    
    catch (nfe: NumberFormatException) {
        
        println("Line 2 worked!") // Line 2 worked!
    }
    

     

}
