package Groovy.Udemy



// The power assertion statements true power unleashes in complex Boolean statements, 
// or statements with collections or other toString-enabled classes:
def x1= [1,2,3,4,5]
println(x1 << 6)
assert (x1 << 6) == [6,7,8,9,10]

// The power assertion output shows evaluation results from the outer to the inner expression
assert 1 == 2

// complex debug output
assert 1 == (3 + 10) * 100 / 5 * 20