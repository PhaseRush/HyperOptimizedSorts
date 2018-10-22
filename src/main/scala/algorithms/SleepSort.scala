package algorithms

object SleepSort {

  def sortArray(array: Array[Int]): Unit = {
    array.foreach(i => {
      new Thread {
        override def run(): Unit = {
          Thread.sleep(i*10)
          print(i);print("\t")
        }
      }.start()
    })
  }
}
