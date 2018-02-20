import java.util.Scanner;

class Globe{

  public static void main (String[] args){

    Scanner value = new Scanner(System.in);
    final double PI = 3.1416;

    System.out.println("球の体積と表面積を求める．");
    System.out.print("半径:");
    double r = value.nextDouble();

    System.out.println("表面積は" + (4 * PI * r * r ) + "です．");
    System.out.println("体積は" + (4 * PI * r * r * r / 3.0) + "です．");
  }
}
