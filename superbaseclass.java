class base {
  int x=10;

  void display(){
      System.out.println("Base class method");
  }
}
class derived extends base{
    void show(){
        System.out.println("Value of x: "+x);
        display();
    }


    public static void main(String[] args) {
        derived d = new derived();
        d.show();
    }
    }

o/p=

  Value of x: 10
Base class method
