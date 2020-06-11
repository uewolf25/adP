object Main{

  def getInputData(argument: Array[String]): Array[String] = {
    if (argument.length == 0) {
      println("引数を与えてください。¥nプログラムを終了します。")
      sys.exit(1)
    }
    return argument
  }

  def main(args: Array[String]): Unit = {
    val input: Array[String] = getInputData(args)
    val cubicRoot = new CubicRoot
    cubicRoot.run(input)
  }
}