package algorithms

import entity.Universe
import sendhelp.Util

/**
  * WARNING: This is not a stable sort.
  */
object QuantumBogoSort {

  def sortArray(array: Array[Int]): Array[Int] = {
    var currentUniverse: Universe = new Universe()
    while (true) {
      currentUniverse = new Universe(array)
      Util.quantumRandomize(currentUniverse.sortedArray)

      if (!Util.arrayIsSorted(currentUniverse.sortedArray))
        currentUniverse.delete()
      else return currentUniverse.sortedArray
    }
    return currentUniverse.sortedArray
  }
}
