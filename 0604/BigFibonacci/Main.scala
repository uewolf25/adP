/**
 * scala-version 2.13.2
 */
object Main{

  def main(args: Array[String]): Unit = {

    args.map(_.toInt)

    args.foreach(item => println( item.getClass()) )
  }
//    var numArray: Array[Int] = Array.empty
//
//    for (i <- 0 to args.length-1){
//      numArray :+ args(i).toInt
//      println(args(i))
//    }
//
//    println("------------以下はデバッグ用------------")
//
//    for (i <- 0 to numArray.length-1) {
//      println(numArray(i))
//    }

//    var numList = Nil
//
//    for(item <- 0 to args.length-1){
//      numList :: args(item).toInt :: Nil
//      println( args(item) )
//    }
//
//    println("------------以下はデバッグ用------------")
//
//    for(i <- 0 to numList.length-1)
//      println(numList(i))
//      println("aaaaa")
//  }

}