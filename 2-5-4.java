/*  演算時の自動型変換

代入だけでなく計算が行われる場合も「左右のオペランドは同一の型」が原則。
int型同士であればint型の結果
  5/2
  評価：2

double型同士であればdouble型の結果
  5.0/2.0
  評価：2.5

異なる型で演算を行う場合「意味的に大きな型」に統一されてから演算が行われる。
  5.0/2
  5/0/2.0
  評価：2.5

数値型同士の演算時の型変更ルール
・片方のオペランドが double なら、他方を double に型変換して揃える。
・片方のオペランドが float なら、他方を float に型変換して揃える。
・片方のオペランドが long なら、他方を long に型変換して揃える。
・片方のオペランドが int なら、他方を int に型変換して揃える。
・short や byte オペランドは int に型変換して揃える。

例）
public class Main {
  public static void main(String[] args) {
    double d = 8.5 / 2;  2(int型)を2.0(double型)に変更
    long l = 5 + 2L;  5(int型)を5l(long型)に変更
    System.out.println(d);
    System.out.println(l);
  }
}

実行結果：4.25
7


文字列を含む演算時の型変換
 …片方のオペランドがStringなら、他方もStringに変換して連結する。

例）
public class Main {
  public static void main(String[] args) {
    String msg = "私の年齢は" + 23;  23(int型)が、"23"(String型)に変更されて連結される。
    System.out.println(msg);
  }
}

実行結果：
私の年齢は２３

*/