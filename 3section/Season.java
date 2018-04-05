/*月を1~12の整数値として読み込んで，それに対応する季節を表示するプログラムを作成*/
import java.util.Scanner;

class Season{

  public static void main(String[] args){

    Scanner value = new Scanner(System.in);
    System.out.print("何月ですか:");
    int month = value.nextInt();

    switch (month){
      case 3:
      case 4:
      case 5: System.out.println("春です"); break;
      case 6:
      case 7:
      case 8: System.out.println("夏です"); break;
      case 9:
      case 10:
      case 11: System.out.println("秋です"); break;
      case 12:
      case 1:
      case 2: System.out.println("冬です"); break;
      default : System.out.println("そんな月はありません"); break;

    }
  }

}
