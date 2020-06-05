object LinearCongruentialGenerator{

  def getInputData(argument: Array[String]): Int = {
    if (argument.length == 0) return 10
    return argument(0).toInt
  }

  def main(args: Array[String]): Unit = {
    var inputNumber: Int = getInputData(args)
    val calc = new Calculation
    var outputList: Array[Double] = calc.calculation(inputNumber)
//    println(s"入力された値は${inputNumber}です")
    outputList.foreach(element => println(element))
  }
}