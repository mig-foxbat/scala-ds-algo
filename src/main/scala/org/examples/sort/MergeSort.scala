package org.examples.sort

/**
 * Created by chlr on 3/27/16.
 */
object MergeSort extends Sortable {

  /**
   * Merge sort implementation
   *
   * @param ls list to be sorted
   * @return sorted list
   */
  override def sort(ls: List[Int]): List[Int] = {
    ls match {
      case Nil => ls
      case (l1 :: Nil) => ls
      case _ => {
        val (left, right) = ls splitAt (ls.length / 2)
        merge(sort(left),sort(right))
      }
    }
  }

  /**
   * merge two sorted list
   * @param xs1 sorted list 1
   * @param xs2 sorted list 2
   * @return merged list
   */
  private def merge(xs1: List[Int], xs2: List[Int]): List[Int] = {
    (xs1, xs2) match {
      case (Nil, l) => l
      case (l, Nil) => l
      case (x :: l1, y :: l2) => if (x <= y) x :: merge(l1,xs2) else y :: merge(xs1,l2)
    }
  }

}
