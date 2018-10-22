package algorithms

import entity.{Danthonywalker5512, Universe}
import sendhelp.Util

/**
  * WARNING: This is not a stable sort.
  */
object QuantumBogoSort {

  def sortArray(array: Array[Int]): Array[Int] = {
    var currentUniverse: Universe = new Universe()
    var currentDannie = currentUniverse.dannie
    while (true) {
      currentUniverse = new Universe(array, dannieboop = currentDannie)
      Util.quantumRandomize(currentUniverse.sortedArray)

      if (!Util.arrayIsSorted(currentUniverse.sortedArray)) {
        currentUniverse.delete()
        currentUniverse.dannie.idontlikeyou()
      }
      else return currentUniverse.sortedArray
    }
    return currentUniverse.sortedArray
  }
}
