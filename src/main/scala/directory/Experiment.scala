package directory

class Experiment(val urn: List[Int]) {

  def randomSelection(): Boolean = (urn.head + urn.tail.head) match {
    case 0 => false
    case _ => true
  }

  def printUrn(): Unit = {
    urn.map(x => print(x.toString.concat(" ")))
    println()
  }

}

object Experiment {
  def apply(): Experiment = new Experiment(getList)

  def getList(): List[Int] = {
    val list: List[Int] = List.fill(6) {
      (new scala.util.Random).nextInt(2)
    }
    val result = if (list.fold(0)(_ + _) != 3) getList()
    else list
    result
  }
}
