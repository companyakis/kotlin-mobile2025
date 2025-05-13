fun main() {
    
    val proverb = "A rolling stone gathers no moss!   "
    
    println(proverb.subSequence(2, 9)) 
    
    if (proverb.contains("!")) {
        
        println("Warning!")
    }
    
    println(proverb.toUpperCase())
    
    println(proverb.toLowerCase())
    
    println(proverb.trim())
     
}

// rolling
// Warning!
// A ROLLING STONE GATHERS NO MOSS!   
// a rolling stone gathers no moss!   
// A rolling stone gathers no moss!
