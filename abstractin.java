interface Animal{
    void makesound();
}

class abstractin implements Animal {
    public void makesound(){
        System.out.println("Hello world");
    }

    public static void main(String[] args) {
        abstractin i=new abstractin();
        i.makesound();
    }
}

o/p
  Hello world
