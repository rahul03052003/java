class superc {
    public void father(){
        System.out.println("This is father");
    }
}
class son extends superc{
    public void child(){
        father();
        System.out.println("This is child");
    }

    public static void main(String[] args) {
        son c=new son();
        c.child();
    }
}
o/p-
  This is father
This is child
