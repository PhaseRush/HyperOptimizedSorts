package sendhelp

object Util {

  def printArray(array: Array[Int]): Unit
  = for (x <- array) {
    print(x)
    print("\t")
  }

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

  def subArrayIsSorted(array : Array[Int], start : Int = 0, end : Int) : Boolean = {
    return arrayIsSorted(array.slice(start, end))
  }

  def shuffleArray(array: Array[Int]) : Array[Int] =
    return util.Random.shuffle(array.toSeq).toArray

  def shuffleList(list : List[Int]) : List[Int] =
    return util.Random.shuffle(list)

  def quantumRandomize(array: Array[Int]) : Array[Int] = array
  def quantumRandomize(list: List[Int]) : List[Int] = list

  def deleteArray(array: Array[Int]) : Boolean = {
    //array = new Array[Int](array.length)
    return false
  }

}
