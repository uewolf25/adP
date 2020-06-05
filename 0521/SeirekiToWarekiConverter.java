public class SeirekiToWarekiConverter{
  private void run(String[] args){
    Integer year;
    if(args.length <= 0){
      year = 2020;
    } else{
      year = Integer.parseInt(args[0]);
    }
    System.out.printf("西暦 %s: %s", year, converter(year));
  }

  private String converter(Integer year){
    // String item = "";
    String returnValue = "";

    if(year < 1868){
      return "明治より前であるため判定できません\n";
    } else if(1868 <= year && year < 1912){
      returnValue = String.valueOf(year - 1867);
      return "明治" + returnValue + startYear(year);

    } else if(1912 <= year && year < 1926){
      returnValue = String.valueOf(year - 1911);
      return "対象" + returnValue + startYear(year);

    } else if(1926 <= year && year < 1989){
      returnValue = String.valueOf(year - 1925);
      return "昭和" + returnValue + startYear(year);

    } else if(1989 <= year && year < 2019){
      returnValue = String.valueOf(year - 1988);
      return "平成" + returnValue + startYear(year);

    } else if(2019 <= year){
      returnValue = String.valueOf(year - 2018);
      return "令和" + returnValue + startYear(year);

    } else{
      return "Unexception input .";
    }
  }

  private String startYear(Integer year){
    if(year == 1868){
      return "（大正元年）\n";
    } else if(year == 1912){
      return "（昭和元年）\n";
    } else if(year == 1926){
      return "（平成元年）\n";
    } else if(year == 2019){
      return "（令和元年）\n";
    } else{
      return "\n";
    }
  }

  public static void main(String[] args) {
    SeirekiToWarekiConverter seirekiToWarekiConverter = new SeirekiToWarekiConverter();
    seirekiToWarekiConverter.run(args);
  }
}