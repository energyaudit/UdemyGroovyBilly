package Groovy.Udemy.control
// if
if( true ) 
  println "value is true"

// false | null | empty strings | empty collections
println " false | null | empty strings | empty collections,\nif(false ) wont do anything,because value true so won't do next line\n"
if( !false )
  println "value is false" 
  
String name = "Dan"
if( name ) 
  println "name has a value"

println "null is false,so next line skipped"
String name1 = null
if( name1 )
    println "name has a value"

String last = ""
println "\"\" is false,so next line skipped"
if( last ) 
  println "last has a value"
  
  
// if/else 
def x = 5
if( x  == 10 ){ 
  println "x is 10"
} else {
  println "x is NOT 10"
}

// classic while
def i = 1
println "classic while:while( i <= 10 )"
while( i <= 10 ) {
    println i
    i++
}


// for in list
def list = [1,2,3,4]
println "for( num in list )"
for( num in list ){
    println num
}

// closure
def list2 = [1,2,3,4]
println "list2.each { println it }"
list2.each { println it }

// switch
def myNumber = 1
println "switch:case 1:, default:"
switch(myNumber) {

    case 1:
        println "number is 1"
        break
    default:
        println "we hit the default case"    

}




