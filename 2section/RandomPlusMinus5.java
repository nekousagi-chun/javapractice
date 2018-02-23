/*キーボードから読み込んだ整数値plus minus5の範囲の整数値をランダムに生成して表示するプログラム*/

import java.util.Scanner;
import java.util.Random;

class RandomPlusMinus5{

  public static void main(String[] args){
    Scanner value = new Scanner(System.in);
    Random ans = new Random();

    System.out.print("整数値:");
    int x = value.nextInt();
    System.out.println("その値+-5の乱数を生成しました");
    System.out.println("値は" + (x - 5 + ans.nextInt(11)) + "です．");

  }

}
