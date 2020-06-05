public class Factorial {
  private void run(String[] args){
    Integer number = Integer.parseInt(args[0]);
    Integer sumResult = 1;

    for(; number > 0; number--){
      sumResult *= number;
    }
    System.out.printf("%s! = %d%n", args[0], sumResult);
  }
  public static void main(String[] args) {
    Factorial fact = new Factorial();
    fact.run(args);
  }
}