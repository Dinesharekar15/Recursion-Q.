public class zeronums {
    public static void main(String[] args) {
        zero(1020);
        System.out.println(count);
    }
    static int count=0;
    static void zero(int n){
        if(n==0){
            return;
        }
        if(n%10==0){
           count +=1;
        }
        zero(n/10);
    }
}
