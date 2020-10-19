public class Demo {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    printLoop(x);
  }

  public static void printLoop(int n){
    int x = 1;
    for(int i = n; i > 0; i--){
      for(int j = i; j > 0; j--){
        System.out.print(x);
      }
      x++;
      System.out.println();
    }
  }
}
