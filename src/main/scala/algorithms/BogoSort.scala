package algorithms

import sendhelp.Util

object BogoSort {

  def sortArray(array: Array[Int]) : Array[Int] = {
    var sortedArray: Array[Int] = array.clone()
    while(!Util.arrayIsSorted(sortedArray)) {
      sortedArray = Util.shuffleArray(sortedArray)
    }
    sortedArray
  }

  def sortList(list: List[Int]) : List[Int] = {
    while(!Util.listIsSorted(list)) {
      Util.shuffleList(list)
    }
    list
  }
}
