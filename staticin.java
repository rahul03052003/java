interface k{
    static void constant(){
        System.out.println("This is static");
    }
}

class staticin implements k{
    public void constant(){
        System.out.println("Yo");
    }

    public static void main(String[] args) {
        k.constant();
    }
}


o/p
  This is static
