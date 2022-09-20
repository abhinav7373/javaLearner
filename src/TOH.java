public class TOH   {
    public static void towerOfHanoi(int n,String source,String helper,String destination){
        if(n==1){
            System.out.print("transfer " + n + " from " + source + " to "+ destination);
            return;
        }
        towerOfHanoi(n-1,source,destination,helper);
        System.out.println();
        System.out.print("transfer " + n + " from " + source + " to  "+ destination);
        System.out.println();
        towerOfHanoi(n-1,helper,source,destination);
    }
    public static void main(String []args){
        int  n =3;
        towerOfHanoi(n,"S","H","D");
    }
}
