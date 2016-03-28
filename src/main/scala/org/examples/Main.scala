package org.examples

import org.examples.sort.MergeSort

/**
 * Created by chlr on 3/27/16.
 */


object Main extends App {
  val input = 10 :: 4 :: 7 :: 2 :: 87 :: 0 :: Nil
  val output = MergeSort.sort(input)
  println(output)
}
