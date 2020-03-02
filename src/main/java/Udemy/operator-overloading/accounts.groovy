class Account {

    BigDecimal balance

    Account plus(Account other) {
        new Account( balance: this.balance + other.balance )
    }
    
    String toString(){
        "Account Balance: $balance"
    }

}

Account savings = new Account(balance:100.00)
Account checking = new Account(balance:500.00)

println savings
println checking
println("operator overloading: Account plus(Account other),savings + checking,method plus return new Account\n" +
        " new Account( balance: this.balance + other.balance ) ")
println savings + checking