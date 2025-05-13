fun main() {
    
    val proverb = "A rolling stone gathers no moss"
    
    val words = proverb.split(" ")
    
    for (word in words) {
        
        print(" <- $word -> ")
    }
   
}

 // <- A ->  <- rolling ->  <- stone ->  <- gathers ->  <- no ->  <- moss -> 
