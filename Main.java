public class Main {
    public static void main(String[] args) {
        int[] n={10,20,30,40,50};
        int tar=60;
        boolean found=false;
        for (int num:n) {
            if(num==tar){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println(tar+" found in the array");
        }else{
            System.out.println(tar+" not found");
        }
    }
}