import java.util.Scanner;

class Negative{

  public static void main(String[] args){

    Scanner value = new Scanner(System.in);

    System.out.print("整数値:");
    int x = value.nextInt();

    if(x < 0)
      System.out.println("その値は負です．");
    else
      System.out.println("その値は正です．");
  }
}
