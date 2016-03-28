package org.examples.sort

/**
 * Created by chlr on 3/27/16.
 */

object BubbleSort {

  def sort(xs: List[Int]): List[Int] = {
    bubbleSort(xs) match {
      case Nil => xs
      case l1 :: Nil => l1 :: Nil
      case list :+ last  => sort(list) ++ (last :: Nil)
    }
  }

  private def bubbleSort(xs: List[Int]): List[Int] = {
    xs match {
      case Nil => xs
      case l1 :: Nil => l1 :: Nil
      case l1 :: l2 :: tail => {
        if (l1 < l2)
          l1 :: bubbleSort(l2 :: tail)
        else
          l2 :: bubbleSort(l1 :: tail)
      }
    }
  }

}
