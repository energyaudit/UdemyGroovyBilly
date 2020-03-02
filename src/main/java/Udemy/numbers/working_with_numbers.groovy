package Groovy.Udemy.numbers
// Groovy Number Defaults
// ----------------------------------------------------------------------

def number = 10
println " 10: number.class"
println number.class

def decimal = 5.50
println " 5.50: number.class"
println decimal.class

// :: Converting Data Types ::
// ----------------------------------------------------------------------
// Explicit - casting

def myFloat = (float) 1.0
println " :: Converting Data Types : Explicit - casting:,def myFloat = (float) 1.0,1.0: myFloat.class"
println myFloat.class

// Implicit - coercion


// Rules for +,-,*
// ----------------------------------------------------------------------

// If either operand is a float or a double the result is a double 
// In Java if only floats are involved the result is a float

Float f = 5.25
Double d = 10.50
println " Implicit - coercion,If either operand is a float or a double the result is a double,println result2.class  "
def result = d / f
println result
println result.class

Float a = 10.75
Float b = 53.75
def result2 = b / a
println result2
println result2.class 
    
// If either operand is a big decimal 

def x = 34.5 // BigDecimal
def y = 15
def bigResult = x / y
println "If either operand is a big decimal,bigResult.class  "
println bigResult
println bigResult.class


// If either operand is a BigInteger the result is a BigInteger
// If either operand is a Long the result is a Long
// If either operand is a Integer the result is an Integer

// Double division
println " Double division "
println 5.0d - 4.1d
println 5-4.1

// Integer Division

def intDiv = 1 / 2
println intDiv // this is much different than Java where we would get 0 
println intDiv.getClass().getName()
println 1.intdiv(2)



// GDK Methods
// ----------------------------------------------------------------------
println "GDK Methods "
println "GDK Methods1:assert 2 == 2.5.toInteger() "
assert 2 == 2.5.toInteger() // conversion
println "GDK Methods2: assert 2 == 2.5 as Integer "
assert 2 == 2.5 as Integer  // enforced coercion
println "GDK Methods3:assert 2 == (int) 2.5 // cast "
assert 2 == (int) 2.5 // cast
println "GDK Methods4:assert '5.50'.isNumber() "
assert '5.50'.isNumber()
println "GDK Methods5:assert 5 == '5'.toInteger() "
assert 5 == '5'.toInteger()

// times | upto | downto | step
println "20.times {\n" +
        "    print '-'\n" +
        "}"
20.times {
    print '-'
}
println "1.upto(10)"
1.upto(10) { num ->
    println num
}
println "10.downto(1)"
10.downto(1) { num ->
    println num
}
println "0.step(1,0.1)"
0.step(1,0.1) { num ->
    println num 
}



