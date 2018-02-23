/**名前と姓と名とを個別にキーボードから読み込んで，挨拶を行うプログラムを作成*/

import java.util.Scanner;

class Greeting{

  public static void main (String[] args){

    Scanner value = new Scanner(System.in);

    System.out.print("姓:");
    String lastName = value.next();
    System.out.print("名:");
    String firstName = value.next();

    System.out.println("こんにちは" + lastName + firstName + "さん．");
  }
}
