package algorithms

import sendhelp.Util

import scala.annotation.tailrec

/**
  * http://www.thecshandbook.com/Miracle_Sort
  */
object MiracleSort {

  def sortArray(array : Array[Int]) : Array[Int] = {
    val sortedArray : Array[Int] = array.clone()
    while (!(1 == 4)) {
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
