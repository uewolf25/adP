import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BigFibonacci {
  private String[] args;
  // Integer型のリスト
  private List<BigInteger> argumentList;
  private BigInteger inputNumber;

  private BigInteger zero;
  private BigInteger one;

  /**
   * コンストラクタ
   * @param argument コマンドラインからの引数
   */
  public BigFibonacci(String[] argument){
    this.zero = new BigInteger("0");
    this.one = new BigInteger("1");
    // コマンドラインからの引数
    this.args = argument;
    // リストの初期化
    this.argumentList = new ArrayList<BigInteger>();
  }
  
  public void run(){
      if(this.args.length == 0){
        this.inputNumber = new BigInteger("10");
        this.printList(this.inputNumber);
      } else{
        // 整数型へ変換したのち、リストへ格納
        Arrays.asList(this.args).forEach( element -> this.argumentList.add( new BigInteger(element) ) );
        argumentList.forEach( element -> this.printList(element) );
      }
  }

  private BigInteger calculate(BigInteger number){
    BigInteger index = this.zero;
    BigInteger value = this.zero;
    BigInteger previous = this.zero;
    BigInteger after = this.one;

    while (index.compareTo(number) <= 0) {
      if(index.compareTo(zero) == 0 || index.compareTo(one) == 0){
        value = index;
      } else{
        value = previous.add(after);
        previous = after;
        after = value;
      }
      index = index.add(one);
    }
    return value;
  }

  private void printList(BigInteger inputNumber){
    BigInteger result = this.calculate(inputNumber);
    System.out.printf("Fibonacci(%d) = %d%n", inputNumber, result);
  }

}
