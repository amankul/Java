package algorithmic;

public class PrimeNumbers{

  public static void main(String args[]){
    int i,m=0;
    int n=33;//it is the number to be checked
    m=n/2;
    if(n==0||n==1){
      System.out.println(n+" is not prime number");
    }else{
      for(i=2;i<= Math.sqrt(n);i++){                        // For odd nos, instead of n/2 check only till its sqrt.
        if(n%i==0){
          System.out.println(n+" is not prime number");
          return;
        }

      }

      System.out.println(n+" is prime number");

    }//end of else
  }
}