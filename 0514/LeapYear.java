public class LeapYear{

  private void run(String[] args) {
    Integer year = Integer.parseInt(args[0]);

    if (isLeap(year)) {
      System.out.printf("%dはうるう年です。%n", year);
    } else{
      System.out.printf("%dはうるう年ではありません。%n", year);
    }
  }

  private Boolean isLeap(Integer year){
    // 平年
    if ( (year % 4 != 0) || (year % 100 == 0 && year % 400 != 0) ) {
      return false;
    } 
    // うるう年
    else{
      // if ( (year % 100 == 0 && year % 400 == 0) || year % 100 != 0) {
      //   return true;
      // }
      return true;
    }
  }

  public static void main(String[] args) {
    LeapYear ly = new LeapYear();
    ly.run(args);
  }
}