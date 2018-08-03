package recfun

import scala.annotation.tailrec

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
    * Exercise 1
    */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
    * Exercise 2
    */
  def balance(chars: List[Char]): Boolean = {
    @tailrec
    def checkBalance(chars: List[Char], count: Int): Boolean =
      if (count < 0) false
      else if (chars.isEmpty) count == 0
      else checkBalance(chars.tail, chars.head match {
        case '(' => count + 1
        case ')' => count - 1
        case _ => count
      })

    checkBalance(chars, 0)
  }

  /**
    * Exercise 3
    */
  def countChange(money: Int, coins: List[Int]): Int =
    if (money < 0) 0
    else if (money == 0) 1
    else coins match {
      case Nil => 0
      case denom :: tail =>
        countChange(money - denom, coins) + countChange(money, tail)
    }
}
