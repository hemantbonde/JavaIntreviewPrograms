package Basic;

public class primeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=29;
		boolean prime=true;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				prime=false;
				break;
			}
		}
		if(prime) {
			System.out.println("Number is prime : "+num);
		}
		else {
			System.out.println("Number is not prime : "+num);
		}
	}

}
