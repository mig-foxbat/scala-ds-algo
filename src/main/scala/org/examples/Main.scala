package org.examples

import org.examples.sort.BubbleSort

/**
 * Created by chlr on 3/27/16.
 */


object Main extends App {
  val input = 10 :: 6 :: 10  :: -1 :: -1 :: Nil
  val output = BubbleSort.sort(input)
  println(output)
}
