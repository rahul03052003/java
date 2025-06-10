class grandfather {
    void grand(){
        System.out.println("This is Grandfather");
    }
}
class father extends grandfather{
    void father(){
        System.out.println("This is father");
    }
}
class child extends father{
    void child(){
        System.out.println("This is child");
    }

    public static void main(String[] args) {
        child c=new child();
        c.child();
        c.father();
        c.grand();
    }
}

o/p-
This is child
This is father
This is Grandfather

  

