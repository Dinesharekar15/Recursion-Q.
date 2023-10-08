
public class countsteps {
    public static void main(String[] args) {
        steps(2);
        System.out.println(count);
    }
    static int count=0;
    static void steps(int n){
      if (n==0) {
        return;
      } if(n%2==0){
        count +=1;
        n=n/2;
      }
      else{
        n=n-1;
        count +=1;
      }
      steps(n);
    }
}
