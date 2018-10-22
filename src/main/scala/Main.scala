import algorithms._
import sendhelp.Util

object Main{
  def main(args: Array[String]): Unit = {

    //var unsortedArray = Array(5,2,1,3,12,313,1231,124,4535,3412,4123,52356)
    var unsortedArray = Array(1,6,4,3,42,432,423,321,21)
    var sortedArray = Array(1,2,3,4,5)

    //printArray(sortedArray)
    val startTime = System.currentTimeMillis()
    //SleepSort.sortArray(unsortedArray)
    var array : Array[Int] = BozoSort.sortArray(unsortedArray)
    println(System.currentTimeMillis() - startTime)
    Util.printArray(array)


  }

}

