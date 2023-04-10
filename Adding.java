package Calculator;

class main{
  public int add(int a, int b) {
    return a + b;
  }
 
  public class Adding {
    public static void main(String[] args) {
      main a=new main();
      int result =a.add(7, 5);
      System.out.println(result);
    }
}
}
