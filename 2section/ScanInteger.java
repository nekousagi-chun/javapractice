/**
 * Created by mountain on 2018/02/19.
 */
import java.util.Scanner;

public class ScanInteger {

  public static void main(String[] args){
    Scanner value = new Scanner(System.in);

    System.out.print("整数値:");
    int x = value.nextInt();

    System.out.println(x + "と入力しましたね．");
  }
}
