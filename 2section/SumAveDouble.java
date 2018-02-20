import java.util.Scanner;
import java.math.BigDecimal;

public class SumAveDouble{

  public static void main(String[] args){

    Scanner value = new Scanner(System.in);

    System.out.print("xの値:");
    String x = value.nextLine();

    System.out.print("yの値:");
    String y = value.nextLine();

    BigDecimal bdx = new BigDecimal(x);
    BigDecimal bdy = new BigDecimal(y);

    BigDecimal xxx = bdx.add(bdy);
    BigDecimal yyy = new BigDecimal("2");

    System.out.println(x);
    System.out.println(y);
    System.out.println("合計は" + bdx.add(bdy));
    System.out.println("平均は" + xxx.divide(yyy,2,BigDecimal.ROUND_UNNECESSARY));
  }
}
