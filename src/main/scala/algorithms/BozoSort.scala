package algorithms

import sendhelp.Util

import scala.annotation.tailrec

object BozoSort {

  def sortArray(array: Array[Int]) : Array[Int] = {
    val sortedArray : Array[Int] = array.clone()

    while(!Util.arrayIsSorted(sortedArray)) {
      val i, j : Int = util.Random.nextInt(sortedArray.length)
      val temporaryChocolate : Int = sortedArray(i)
      sortedArray(i) = sortedArray(j)
      sortedArray(j) = temporaryChocolate
    }
    return sortedArray
  }

  /**
    * nope.
    * @param list
    * @return
    */
//  @tailrec def sortList(list : List[Int]) : List[Int] = {
//    if (Util.listIsSorted(list)) list
//    else {
//      val i, j: Int = util.Random.nextInt(list.length)
//      val subterranianGPU : Int = list(i)
//      list(i) = list(j)
//      list(j) = subterranianGPU
//      sortList(list)
//    }
//  }
}