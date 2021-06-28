/*  代入時の自動型変換

ある型で宣言された変数には、その値しか代入できない。
○  age = 23;
×  age = 3.2;
×  age = "ヒミツ";

小さな型の値を大きな型の変数に代入する場合に限って、値が自動的に箱の型に変換されて代入される。
この仕組みがあるためコンパイルエラーにならない。

public class Main {
  public static void main(String[] args) {
    float f = 3;
    double d = f;
    System.out.println(f);
    System.out.println(d);
  }
}
実行結果:
3.0
3.0

代入しようとする値の型よりも代入先の型が意味的に大きい場合には、代入時の自動変換が行われる。

逆に大きな型の値を小さな型の変数に代入することは原則的に不可。
コンパイルが失敗する。

public class Main {
  public static void main(String[] args) {
    int i = 3.2;  //小数点以下がどうなるか判断できない。
  }
}

ただし、byte型short型の変数に対して、実害がない範囲でint型リテラルを代入することだけは例外的に認められている。


*/