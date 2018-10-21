package sendhelp

object Util {

  def arrayIsSorted(array: Array[Int]) : Boolean = {
    for (x <- 0 until array.length - 1) {
      if (array(x) > array(x+1)) {
        return false
      }
    }
    return true
  }

  def listIsSorted(list: List[Int]) : Boolean = {
    arrayIsSorted(list.toArray)
  }

  def shuffleArray(array: Array[Int]) : Array[Int] =
    return util.Random.shuffle(array.toSeq).toArray

  def shuffleList(list : List[Int]) : List[Int] =
    return util.Random.shuffle(list)

}
