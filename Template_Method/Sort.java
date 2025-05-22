import java.util.Scanner;

public abstract class Sort {
	
	static Scanner sc = new Scanner(System.in);
	private static int arr[];
	
	//the sort method that will be defined in the children classes
	abstract void sort(int array[]);
	
	//fill the array
	void fillArray(){
		int n;
		System.out.println("How much element:");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("Enter you elements:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
	};
	
	//print the array
    void printArray(){
    	int n = arr.length; 
		for (int i=0; i<n; ++i) 
			System.out.print(arr[i]+" "); 
		System.out.println();
    };

	//template method
	public final void methodTemplate(){

		//the cycle of execution 
		fillArray();
		
		sort(arr);
		
		printArray();

	}
}
