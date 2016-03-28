package org.examples

import org.examples.sort.QuickSort

/**
 * Created by chlr on 3/27/16.
 */


object Main extends App {
  val input = 10 :: -1 :: Nil
  val output = QuickSort.sort(input)
  println(output)
}
