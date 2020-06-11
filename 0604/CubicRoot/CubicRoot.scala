class CubicRoot(){
  def run(arguments: Array[String]): Unit = {
    for (arg <- arguments){
      var argDouble: Double = arg.toDouble
      var result: Double = calculate(argDouble)
      println(s"cubic_root(${argDouble}) = ${result} = ${Math.cbrt(argDouble)}")
    }
  }

  def calculate(n: Double): Double = {
    val threshold: Double = 0.00001

    var x: Double = 10.0
//    var y: Double = (n: Double, x: Double) => x * x - n
    var y: Double = newton(n, x)
//    println(y)

    while (Math.abs(y) > threshold){
      val slant: Double = 3 * x * x
      val b: Double = y - slant * x

      x = -1 * b / slant
      y = newton(n, x)
    }
    return x
  }
  def newton(n: Double, x: Double): Double = x * x * x - n
}