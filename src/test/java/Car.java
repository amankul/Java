package test.java;

public class Car {

    private void privatemethod(){
    }

    void defaultmethod(){
    }

    public static String name;

    protected void protectedmethod(){

    }

    public  void main(String[] args) {
        privatemethod();                  // private method can be accessed within its own class only

    }

  private class A {                     // private Class can be created inside class ?
        int x;
    }

}


