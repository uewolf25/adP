public class HelloWorld2 {
  private void run(String[] args){
    if(args.length <= 0){
      System.out.println("Hello, World");
    } else{
      System.out.printf("Hello, %s%n", args[0]);
    }
  }

  public static void main(String[] args) {
    HelloWorld2 hWorld2 = new HelloWorld2();
    hWorld2.run(args);
  }
}