package Groovy.Udemy.class_exercise.twiterdemo

@groovy.transform.ToString
class Tweet1 {

    String username // @therealdanvega
    String text
    Integer retweets
    Integer favorites
    Date createdOn
    
    public Tweet1(String user, String tweet) {//constructor
       username = user
       text = tweet
       retweets = 0
       favorites = 0
       createdOn = new Date()
        println "groovy constructor same as java that same name as class name and crate new date:  new Date()  "
    }
    
    void addToRetweets(){
        retweets += 1
    }
    void addToFavorites(){
        favorites += 1
    }

}

def tweet = new Tweet1("therealdanvega","Hello,Twitter!")
println "need @groovy.transform.ToString to print or represent tweet"
println tweet


