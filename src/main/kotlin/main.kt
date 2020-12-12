package pack

import DiceBag


fun main () {

    var play = true

    val bag1 = DiceBag()
    val bag2 = DiceBag()


    var response = String()


    while(play){

        println("Your dice")
        bag1.rollAll()

        println("Computer's dice")
        bag2.rollAll()


        var sum1 = bag1.sum()


        var sum2 = bag2.sum()

        println("Your total: $sum1")
        println("Computer's total: $sum2")

        if (sum1 > sum2)
            println("You won!")
        else if (sum2 > sum1)
            println("You lost!")
        else
            println("Tie!")

        print("Would you like to play again? Y/N: ")
        response = readLine().toString()
        response.capitalize()
        if (response == "N")
            play = false
    }


}