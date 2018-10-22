package algorithms

import entity.{Danthonywalker5512, Universe}
import sendhelp.Util

/**
  * WARNING: This is not a stable sort.
  */
object QuantumBogoSort {

  def sortArray(array: Array[Int]): Array[Int] = {
    while (true) {
      val currentUniverse = new Universe(array, dannieboop = new Danthonywalker5512)
      val currentDannie = currentUniverse.dannie
      Util.quantumRandomize(currentUniverse.sortedArray)

      if (!Util.arrayIsSorted(currentUniverse.sortedArray)) {
        currentUniverse.dannie.idontlikeyou()
        currentUniverse.delete()
      }
      else return currentUniverse.sortedArray
    }
    return null
  }
}
