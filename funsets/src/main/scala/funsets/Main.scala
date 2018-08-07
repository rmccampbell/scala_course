package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  val s: Set = x => 0 <= x && x < 10
  printSet(map(s, x => x*x))
}
