package Groovy.Udemy.classes
// create a new instance of a developer
@groovy.transform.ToString()
class Developer {

    String first
    String last
    def languages = []

    void work() {
        println "$first $last is working..."
    }

}
Developer d = new Developer()
println "assign value to property : d.first = \"Dan\""
d.first = "Dan"
println "assign value to property : d.setLast(\"Vega\"),setter is crate by groovy automatically"
d.setLast("Vega")

// assign some languages
println "assign value to property : d.languages << \"Groovy\""
d.languages << "Groovy"
d.languages << "Java"
println("After assign value to property:    "+d.languages)
// call some methods
d.work()