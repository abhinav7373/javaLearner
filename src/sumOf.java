public class sumOf {
    public static void sumOfNo(int i,int n,int sum) {
        if (i==n) {
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        sumOfNo(i+1,n,sum);
    }
    public static void main(String []args){
        sumOfNo(3,5,0);

    }
}
