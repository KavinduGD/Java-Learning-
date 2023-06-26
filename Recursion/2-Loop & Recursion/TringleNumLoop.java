public class TringleNumLoop {
  
    //counting each element
    public static  int triangle1(int n){
        int count=0;
       for(int i=n;i>0;i--){
        for(int j=1;j<=i;j++){
            count++;
        }
       }
       return count;
    }

    //counting colomns
    // *
    // **
    // ***
    // ****
    // *****
    public static int triangle2(int n){
        int t=0;
        for(int i=n;i>0;i--){
            t=t+i;
        }
        return t;
    }

    public static void main(String[] args) {
        System.out.println(triangle1(4));
        System.out.println(triangle2(4));
    }
}
