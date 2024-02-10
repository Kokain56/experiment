import directory.Experiment

object Main {
  def main(args: Array[String]): Unit = {
    val listExp: List[Experiment] = List.fill(1000) {
      Experiment()
    }
    val count = listExp.foldLeft(0.0)((acc, x) => if (x.randomSelection()) acc + 1 else acc)
    println(count / 1000)
  }
}