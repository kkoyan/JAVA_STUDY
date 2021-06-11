/*定数の利用

public class Main {
  public static void main(String[] args) {
    int age = 20;//変数ageを２０で初期化
    System.out.println("私の年齢は" + age);
    age = 31;//変数ageに再度代入している。
    System.out.println("…いや、本当の年齢は" + age);
  }

}
実行結果：３１
…すでに値が入っている変数に代入すると古い値は消滅、新しい値に変わる。

誤）
public class Main {
  public static void main(String[] args) {
    double pi = 3.14;//円周率を入れた変数
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
    System.out.println("パイの半径を倍にします");
    pi = 10;// 誤り。代入すべき変数は「pie」
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * pi);
  }
}
実行結果：250.0

円周率であるpiは変わる必要がない。
final を加えると書き換え防止になる。
final付きで宣言された変数は定数と呼ばれ初期に代入された値から変わらなくなる。

定数の宣言
final 型 定数名 = 初期値;
※定数名には全て大文字を用いる。

正）
public class Main {
  public static void main(String[] args) {
    final double PI = 3.14;
    int pie = 5;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
    System.out.println("パイの半径を倍にします");
    pie = 10;
    System.out.println("半径" + pie + "cmのパイの面積は、");
    System.out.println(pie * pie * PI);
  }
}

*/