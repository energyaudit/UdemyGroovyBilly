package Groovy.Udemy
// you must provide an assetion an expression that evaluates to true
println "assertion nothing happen"
assert true

// we can provide a full expression on the right hand side 
// note that unlike Java and more like Ruby or Scala == is equality 
assert 1 == 1

// like the example above we are evaluating an expression
def x = 1
assert x == 1

// what happens when the expression doesn't evaluate to true?
println "assertion false groovy will console why false"
assert false

// The power assertion output shows evaluation results from the outer to the inner expression
assert 1 == 2

// complex debug output
assert 1 == (3 + 10) * 100 / 5 * 20

// The power assertion statements true power unleashes in complex Boolean statements, 
// or statements with collections or other toString-enabled classes:
def x1= [1,2,3,4,5]
assert (x1 << 6) == [6,7,8,9,10]