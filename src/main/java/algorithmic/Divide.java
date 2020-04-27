package algorithmic;

public class Divide {

  public static void main(String[] args) {
    int a = 4, b = 0;
    int c= divide(a,b);
    System.out.println("C " + c);
}

public static int divide(int a,int b)
{
  int c = -1;

  try{
    c = a/b;
  }
  catch (Exception e) {
    System.err.println("Exception");
  }
  finally {
    System.err.println("Finally");

  }
  return c;
}
}