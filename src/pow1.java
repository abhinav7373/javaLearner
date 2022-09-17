public class pow1 {
    public static int calcPower(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPower1 = calcPower( x, n-1);
        return( x* xPower1);
    }
    public static void main(String []args){
          int x=2,n=5;
          int ans = calcPower(x,n);
        System.out.println(ans);
    }
}
