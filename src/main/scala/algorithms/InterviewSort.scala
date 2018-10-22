package algorithms

import sendhelp.Util

object InterviewSort {

  def sortArray(array: Array[Int], interviewDuration: Int = 3600) : Array[Int] = {
    Thread.sleep(interviewDuration)
    return Util.shuffleArray(array)
  }

  def sortList(list: List[Int], interviewDuration: Int = 3600) : List[Int] = {
    Thread.sleep(interviewDuration)
    return Util.shuffleList(list)
  }
}
