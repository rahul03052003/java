package Mynewpackage;

public class pack {
    public void display(){
        System.out.println("Hello bro");
    }
}



runpack.java

  import Mynewpackage.pack;
public class runpack {
    public static void main(String[] args) {
        pack p=new pack();
        p.display();
    }

}


o/p
  Hello bro
