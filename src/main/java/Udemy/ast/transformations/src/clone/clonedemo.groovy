package Groovy.Udemy.ast.transformations.src.clone

import groovy.transform.AutoClone

@AutoClone
class Person1 {

    String first
    String last
    List favItems
    Date since

}
def p = new Person1(first:'John', last:'Smith', favItems:['ipod', 'shiraz'], since:new Date())
def p2 = p.clone()

assert p instanceof Cloneable
assert p.favItems instanceof Cloneable
assert p.since instanceof Cloneable
assert !(p.first instanceof Cloneable)

assert !p.is(p2)
assert !p.favItems.is(p2.favItems)
assert !p.since.is(p2.since)
assert p.first.is(p2.first)