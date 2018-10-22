package algorithms

import sendhelp.Util

object BogoBogoSort {

  def sortArray(array: Array[Int]) : Array[Int] = {
    var sortedArray: Array[Int] = array.clone()
    var i = 0 : Int
    for (i <- 0 until sortedArray.length) {
      while (!Util.subArrayIsSorted(sortedArray, 0, i))
        sortedArray = Util.shuffleArray(sortedArray)
      if (!Util.subArrayIsSorted(sortedArray, 0, i + 1))
        //i = 0; // <- can't do that
        sortArray(sortedArray)
    }
    return sortedArray
  }

}
