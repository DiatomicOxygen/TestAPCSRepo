public class Demo {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);

    //Tests for Assignment 9:
    printLoop(x);

    //Tests for Assignment 10:

    //Sample examples (from google classroom)
    //System.out.println(arrayDeepToString(create2DArrayRandomized(6, 4, 4)));
    //System.out.println(arrayDeepToString(create2DArrayRandomized(4, 10, 100)));

    //Extra Testing
    //int y = Integer.parseInt(args[1]);
    //int z = Integer.parseInt(args[2]);
    //int[][] a = create2DArrayRandomized(x, y, z);
    //System.out.println(arrayDeepToString(a));

  }

  //Method for assignment 9:
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

  //Methods for assignment 10:
  public static String arrToString(int[] arr){
    String a = "{";
    for (int i = 0; i < arr.length; i++) {
      a += arr[i];
      if (i != arr.length - 1) {
        a += ", ";
      }
    }
    a += "}";
    return a;
  }

  public static String arrayDeepToString(int[][] arr){
    String a = "{";
    for (int i = 0; i < arr.length; i++) {
      a += arrToString(arr[i]);
      if (i != arr.length - 1) {
        a += ", ";
      }
    }
    a += "}";
    return a;
  }

  public static int[][] create2DArray(int rows, int cols, int maxValue) {
    int[][] a = new int[rows][cols];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        a[i][j] = (int)Math.round(Math.random() * maxValue);
      }
    }
    return a;
  }

  public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
    int[][] a = new int[rows][];
    int x = 0;
    for (int i = 0; i < rows; i++) {
      x = (int)Math.round(Math.random() * cols);
      a[i] = new int[x];
      for (int j = 0; j < x; j++) {
        a[i][j] = (int)Math.round(Math.random() * maxValue);
      }
    }
    return a;
  }

}
