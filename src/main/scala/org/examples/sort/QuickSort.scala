package org.examples.sort

/**
 * Created by chlr on 3/27/16.
 */
object QuickSort {

  /**
   *
   * @param xs list to be sorted
   * @return sorted list
   */
  def sort(xs: List[Int]): List[Int] = {
    xs match {
      case Nil => xs
      case l1 :: Nil => l1 :: Nil
      case l1 :: tail => {
        val pivot: List[Int] = l1 :: tail filter ( _ == l1)
        val (lt: List[Int], gt: List[Int]) = tail filterNot (_ == l1) partition ( _ < l1 )
        sort(lt) ++ pivot ++ sort(gt)
      }
    }
  }

}
