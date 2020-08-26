class OuterClass1 {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class MyMainClass {
  public static void main(String[] args) {
    OuterClass1 myOuter = new OuterClass1();
    OuterClass1.InnerClass myInner = myOuter1.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}
2 error will come as an output