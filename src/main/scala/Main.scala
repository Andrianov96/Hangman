import scala.util.Random

object Main {
  def main(args: Array[String]): Unit = {
    val trying = 5
    var dictionary = new Array[String](10)
    dictionary(0) = "hate"
    dictionary(1) = "homework"
    var guessed: Set[Char] = Set()
    var currentString = dictionary(Math.abs(Random.nextInt() % 2))

    var success = false
    var i = 1
    while (i <= trying && !success) {
      println("Guess a letter:")
      var letter = io.StdIn.readLine()
      if (currentString.contains(letter)) {
        guessed = guessed ++ letter
        println("Hit!")
        printCurWord(currentString, guessed)
        if (currentString.forall(guessed(_))){
          success = true
        }
      } else {
        println(s" Missed, mistake $i out of $trying.")
        printCurWord(currentString, guessed)
        i += 1
      }
    }

    if (success) println("You win!") else println("You lost!")

  }

  def printCurWord(s: String, guessed: Set[Char]) = {
    println(s.map((x: Char) => if (guessed(x)) x else '*'))
  }
}