/**
 * 線形合同法は，擬似乱数を発生させるアルゴリズムです．以下の漸化式で求めます．
 *
 * Xn+1=(A×Xn+B)modM
 * A，B，Mは定数です．Aは自分の誕生日（月日．3桁もしくは4桁），Bは1， Mは65535，X0は自分の年齢としてください．
 * 完成すれば，A，B，M，X0の値を変更して結果がどのように変わるかを確認しましょう．
 * ただし，A<M，B<Mである必要があります．
 */
class Calculation(){
  private val a: Int = 425
  private val b: Int = 1
  private val m: Int = 65535
  private var x: Int = 22
  private var list: Array[Double] = Array.empty

  /**
   * 漸化式を計算する。
   * @param inputNumber
   * @return list
   */
  def calculation(inputNumber: Int): Array[Double] = {
    for (i <- 1 to inputNumber){
      x = (a * x + b) % m
      list :+ (1.0 * x / m)
      println(1.0 * x / m)
    }
    return list
  }
}