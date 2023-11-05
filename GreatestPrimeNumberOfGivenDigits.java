
public class greatestPrimeNumberOfGivenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(biggestPrime(9));

	}
	
	public static boolean isPrime(int num) {
		if(num<=1)return false;
		if(num==2 || num==3)return true;
		if(num%2 == 0 || num%3 == 0)return false;
		for(int i = 5; i*i <=num ; i=i+6) {
			if(num%i==0 || num%(i+2)==0)return false;
		}
		return true;
	}
	
	public static int biggestPrime(int n) {
		StringBuilder lastNumber = new StringBuilder();
		for(int i=1; i<=n; i++) lastNumber.append("9");
		StringBuilder firstNumber = new StringBuilder();
		firstNumber.append("1");			
		for(int i=1; i<n; i++) firstNumber.append("0");
		System.out.println("lastNumber: "+lastNumber.toString());	
		System.out.println("firstNumber: "+firstNumber.toString());
		int fNum = Integer.parseInt(firstNumber.toString());
		int lNum = Integer.parseInt(lastNumber.toString());
		
		while(lNum > fNum) {
			if(isPrime(lNum)) return lNum;
			lNum--;
		}
		return lNum;
	}

}
