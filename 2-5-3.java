/*　　強制的な型変換

小さな型に変換して押し込むと言った指示ができる。
強制的に代入する。

public class Main {
  public static void main(String[] args) {
    int age = (int)3.2;
    System.out.println(age);
  }
}
実行結果：
３

3.2というdouble型リテラルの前に記述された(int)が強制的な型変換を指示するキャスト演算子(cast operator)。

キャスト演算子は元のデータの一部を失ってもデータを強制的に変更しようとする。（この場合.2をなくす。）
あまり使用することはない。

*/