package algorithms

object BubbleSort {

  def sortArray(array: Array[Int]) : Array[Int]= {
    val n: Int = array.length

    for (i <- 0 until n) {
      for (j <- 0 until n - i - 1)
        if (array(j) > array(j+1)) {
          val tempInt: Int = array(j)
          array(j) = array(j+1)
          array(j+1) = tempInt

      }
    }
    return array
  }

}
