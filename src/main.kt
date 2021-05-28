import java.lang.Thread.sleep

fun main(args: Array<String>) {
    var menuChoice = 0
    do {
        println("1) Watch the Night Before the Big Extinction (starring Brad Pitt)-- Type 1")
        println("2) Watch the Last Time We Met (starring Scarlett Johannson)-- Type 2")
        println("3) Watch Darkness and Light (starring Emily Blunt)-- Type 3")
        println("4) Watch Star Wars: Avengers Re-United (starring Robert Downey Jr.)-- Type 4")
        println ("5) Watch Jurassic Universe 3 (starring Samuel L Jackson)-- Type 5")
        println ("6) Skip watching a movie-- Type 6")
        menuChoice = readLine()!!.toInt()
        when (menuChoice){
            1 -> print("You chose Night Before the Big Extinction. Play will now begin.                                                                                               ")
            2 -> print("You chose Last Time We Met. Play will now begin.                                                                                                              ")
            3 -> print("You choose Darkness and Light. Play will now begin.                                                                                                           ")
            4 -> print("You chose Star Wars: Avengers Re-United. Play will now begin.                                                                                                 ")
            5 -> print("You chose Jurassic Universe 3. Play will now begin.                                                                                                           ")
            !in 1..6 -> print("This is not a valid choice please choose again.                                                                                                        ")
          }
    } while(menuChoice != 6)

}