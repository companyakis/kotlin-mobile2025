fun main() {
    
    var cond1: Boolean = true
    
    var cond2: Boolean = false
    
    var result1: Boolean = cond1 && cond2
    
    var result2: Boolean = cond1 || cond2
    
    var result3: Boolean = (cond1 && cond2) || (cond1 || cond2)
    
    var result4: Boolean = (cond1 || cond2) && (cond1 && cond2)
    
    println(result1)
    println(result2)
    println(result3)
    println(result4)
    
           
}
