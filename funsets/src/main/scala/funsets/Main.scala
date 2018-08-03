package funsets

object Main extends App {
  import FunSets._
  println(contains(singletonSet(1), 1))

  printSet(map(x => 0 <= x && x < 10, x => x*x))
}
