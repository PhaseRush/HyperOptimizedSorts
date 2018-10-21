package algorithms

import sendhelp.Util

import scala.annotation.tailrec

object MiracleSort {

  def sortArray(array : Array[Int]) : Array[Int] = {
    val sortedArray : Array[Int] = array.clone()
    while (true) {
      if (Util.arrayIsSorted(sortedArray)) {
        return sortedArray
      }
      Thread.sleep(util.Random.nextInt(1000))
    }

    return sortedArray
  }

  @tailrec def sortList(list: List[Int]) : List[Int] = {
    if (Util.listIsSorted(list)) list
    else {
      Thread.sleep(util.Random.nextInt(1000))
      sortList(list)
    }
  }
}
