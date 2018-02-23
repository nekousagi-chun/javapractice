import java.util.Scanner;

class Measure{

  public static void main(String[] args){

    Scanner value = new Scanner(System.in);
    System.out.print("実数A:");
    int x = value.nextInt();
    System.out.print("実数B:");
    int y = value.nextInt();

    if(!(x % y == 0))
      System.out.println("BはAの約数ではありません．");
    else
      System.out.println("BはAの約数です．");
  }
}
