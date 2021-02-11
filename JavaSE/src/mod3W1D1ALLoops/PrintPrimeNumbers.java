package mod3W1D1ALLoops;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		boolean isPrime = false;
		System.out.println("1 is odd");
		for (int i=2;i<=20; i++){
		  if (i%2==1){
		    int temp = (int) Math.floor(Math.sqrt(i));
		    for(int l=2; l<=temp; l++){
		        if(i%l != 0){
		          isPrime=true;
		        }
		      else {isPrime=false;}
		    }
		    if(isPrime){
		    	System.out.println(i+ " is prime");
		    	}
		    else {
		    	System.out.println(i+ " is odd");
		    }
		  }
		  if(i%2==0){
			  System.out.println(i+" is even");
		  }
		}
	}

}
