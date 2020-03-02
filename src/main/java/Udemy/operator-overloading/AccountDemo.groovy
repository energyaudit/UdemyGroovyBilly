@groovy.transform.ToString
class Account {

    BigDecimal balance = 0.0
    String type // checking or savings
    
    BigDecimal deposit(BigDecimal amount){
        balance += amount
    }
    
    BigDecimal withdraw(BigDecimal amount){
        balance -= amount
    }
    
    BigDecimal plus(Account account){
        this.balance + account.balance
    }

}


Account checking = new Account(type:"Checking")
checking.deposit(100.00)

Account savings = new Account(type:"Savings")
savings.deposit(50.00)

println checking
println savings

BigDecimal total = checking + savings
println(" BigDecimal plus(Account account),para is another Account object,\n " +
        "and return is by default,so no need write return,\n" +
        "BigDecimal total = checking + savings  ")
println total
