package org.examples

import org.examples.sort.HeapSort

/**
 * Created by chlr on 3/27/16.
 */


object Main extends App {
  val input = 70:: 60 :: 35 :: 23 :: 10 :: 4 :: Nil
  val output = HeapSort.sort(input)
  println(input)
  println(output)
}
