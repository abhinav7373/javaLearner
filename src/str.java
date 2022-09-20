
public class str {
    public static void printString(String sc,int index){
        if(index==0){
            System.out.print(sc.charAt(index));
            return;
        }
        System.out.print(sc.charAt(index));
        printString(sc,index-1);
    }
    public static void main(String []args){
        printString("abcd",3);
    }
}
