import scala.util.Random

object Main extends App{

  def printCurWord(s: String, guessed: Set[Char]) = {
    println(s.map((x: Char) => if (guessed(x)) x else '*'))
  }

  def CurWord(s: String, guessed: Set[Char]):String = {
    s.map((x: Char) => if (guessed(x)) x else '*')
  }

  def addChar(guessed:Set[Char], adding:String):Set[Char] = {
    guessed ++ adding
  }
    val trying = 5
    var dictionary = new Array[String](10)
    dictionary(0) = "hate"
    dictionary(1) = "home"
    dictionary(2) = "work"
    var guessed: Set[Char] = Set()
    var currentString = dictionary(Math.abs(Random.nextInt() % 3))

    var success = false
    var i = 1

    while (i <= trying && !success) {
      println("Guess a letter:")
      var letter = io.StdIn.readLine()
      if (currentString.contains(letter)) {
        guessed = addChar(guessed, letter)
        println("Hit!")
        println(CurWord(currentString, guessed))
      } else {
        println(s" Missed, mistake $i out of $trying.")
        println(CurWord(currentString, guessed))
        i += 1
      }
      if (currentString.forall(guessed(_))){
        success = true
      }
    }
    if (success) println("You win!") else println("You lost!")

}

