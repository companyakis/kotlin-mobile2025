fun main() {
    
    var x: String = "100"
    
    var y: String = "120"
    
    var z: String = "120,12"
    
    var x1 = x.toIntOrNull()
    
    var y1 = y.toIntOrNull()
    
    var z1 = z.toIntOrNull()
    
    if (x1 != null && y1 != null && z1 != null) {
        
        val result1 = x1 + y1 + z1
        
        println(result1)
    }
    
    else {
   
        println("Type conversion error!..") // Type conversion error!..
    }
    
}
