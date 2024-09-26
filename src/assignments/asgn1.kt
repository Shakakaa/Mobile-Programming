fun main() {
    ex3_functions()
}

fun ex1_basic_syntax() {
    println("############### Variables and Data Types ##############")

    val a: Int = 1
    println(a)

    val b: Double = 1.5
    println(b)

    val c: String = "Test"
    println(c)

    val d: Boolean = true
    println(d)

    println("######### Conditional Statements #############")

    print("Enter a number: ")
    val num: Int = readln().toInt()

    if (a > 0) {
        println("Positive number")
    } else if (a < 0) {
        println("Negative number")
    } else {
        println("Null number")
    }

    println("######## Loops ############")
    for (n in 1..10) {
        print("$n\t")
    }
    println()
    var i = 1
    while (i < 11) {
        print("$i\t")
        i++;
    }

    println()
    println("###### Collections #########")

    val numbers = listOf(1, 2, 3, 4, 5)

    var sum = 0

    for (number in numbers) {
        sum += number
    }

    println("The sum of all numbers is: $sum")
}

fun ex2_oop() {

    println("########## Create a Person class ##########")
    open class Person(var name: String, var age: Int, var email: String) {

        open fun display_info() {
            println("Name: $name, Age: $age, Email: $email")
        }
    }

    println("######### Inheritance #############")
    class Employee(name: String, age: Int, email: String, var salary: Double) : Person(name, age, email) {
        override fun display_info() {
            super.display_info()
            println("Salary: $salary")
        }
    }

    var tom = Person("Tom", 18, "Tom@gmail.com")
    tom.display_info()

    var bob = Employee("Bob", 22, "Bob@gmail.com", 500.125)
    bob.display_info()

    println("############### Encapsulation #############")

    class BankAccount(private var balance: Double) {

        fun deposit(amount: Double) {
            if (amount > 0) {
                balance += amount
                println("Deposited: $$amount")
            } else {
                println("Deposit amount must be positive.")
            }
        }

        fun withdraw(amount: Double) {
            if (amount > 0 && amount <= balance) {
                balance -= amount
                println("Withdrew: $$amount")
            } else {
                println("Insufficient balance or invalid amount.")
            }
        }

        fun displayBalance() {
            println("Current balance: $$balance")
        }
    }

    var bankAccount = BankAccount(125.123)
    bankAccount.displayBalance()
    bankAccount.withdraw(50.1)
    bankAccount.displayBalance()
    bankAccount.deposit(100.566)
    bankAccount.displayBalance()
}

fun ex3_functions() {
    println("########### Basic Function ############")
    fun sum(num1: Int, num2: Int): Int {
        print("sum of $num1 and $num2 is ")
        return (num1 + num2)
    }

    println(sum(55, 12))

    println("######### Lambda Functions ##############3")
    var multiply: (Int, Int) -> Int = { a, b -> a * b }

    var result = multiply(4, 5)
    println("The result is: $result")


    println("############## Higher-Order Functions ##############33")
    fun applyOperation(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
        return operation(a, b)
    }

    val add: (Int, Int) -> Int = { x, y -> x + y }

    val sum = applyOperation(5, 3, add)
    println("The sum is: $sum")


    val product = applyOperation(5, 3, multiply)
    println("The product is: $product")

}

fun ex4_android_layout_kotlin() {
    println("Another project")
}