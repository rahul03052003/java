public class stringb {
    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Hello");
        s.append(" World");
        System.out.println(s);

        s.insert(6,"Cool");
        System.out.println(s);

        s.delete(7,11);
        System.out.println(s);

        s.reverse();
        System.out.println(s);

       StringBuffer n= new StringBuffer();
        System.out.println(n.capacity());
    }
}

o/p
  Hello World
Hello CoolWorld
Hello Corld
dlroC olleH
16
