import algorithms.BubbleSort
import sendhelp.Util

object Main{
  def main(args: Array[String]): Unit = {
    var unsortedArray = Array(5,2,3,4,1)
    var sortedArray = Array(1,2,3,4,5)

    //printArray(sortedArray)
    println(Util.arrayIsSorted(unsortedArray))
    unsortedArray = BubbleSort.sortArray(unsortedArray)
    println(Util.arrayIsSorted(unsortedArray))

    val i, j: Int = util.Random.nextInt(12)
    print(i)
    print(j)
//    val 1 : Int = 2
//    print(1 + 1)
  }

  def printArray(array: Array[Int])
  = for (x <- array) {
    print(x)
  }

}

