public class TriangleNumRecursion {
    //n +(n-1)
    public static int triangle(int n){
        if(n==1){
            return 1;
        }else{
            return n+(triangle(n-1));
        }
    }
    public static void main(String[] args) {
        System.out.println(triangle(4));
    }


}
