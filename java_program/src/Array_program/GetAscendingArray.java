package Array_program;

public class GetAscendingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={20,50,40,30,10};
		for(int i=0;i<a.length;i++)
		{ 
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order of an array : ");
		for(int i=0;i<a.length;i++) {
		System.out.println(" "+a[i]);
		}
	}

}
