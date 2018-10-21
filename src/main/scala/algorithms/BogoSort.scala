package algorithms

import sendhelp.Util

object BogoSort {

  def sortArray(array: Array[Int]) : Array[Int] = {
    while(!Util.arrayIsSorted(array)) {
      Util.shuffleArray(array)
    }
    array
  }

  def sortList(list: List[Int]) : List[Int] = {
    while(!Util.listIsSorted(list)) {
      Util.shuffleList(list)
    }
    list
  }
}
