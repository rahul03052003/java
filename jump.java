public class jump {
    public static void main(String[] args) {
        outerloop:
        for(int i=1;i<=3;i++){
            for(int j=1 ; j<=3;j++){
                if(i==2 && j==2){
                    System.out.println("Skipping iteration using 'continue' with label");
                    continue outerloop;
                }
                if(i==3 && j==2){
                    System.out.println("Breaking out of both loops");
                    break outerloop;
                }
                System.out.println("i= "+i+",j= "+j);
            }
        }
        System.out.println("Loop ended");
    }
}
