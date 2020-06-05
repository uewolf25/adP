public class BigAndSmall{

  private void run(String[] args){
    Double value = Math.random();
    String result = value < 0.5 ? "Small" : "Big";
    System.out.printf("value: %f: %s %n", value, result);
  }

  public static void main(String[] args){
    BigAndSmall bas = new BigAndSmall();
    bas.run(args);
  }
}