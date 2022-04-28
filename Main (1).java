public class bubblesort
{
	public static void main(String[] args) {
	    java.util.Scanner kb = new java.util.Scanner(System.in);
		System.out.println("How many numbers do you want to enter ?");
		int size = kb.nextInt();
		int array[] = new int[size];
		int i,k,temp;
		System.out.println("Enter the numbers : ");
		for (i=0;i<size;i++){
		    array[i] = kb.nextInt();
		}
		System.out.println("Numbers you have entered : ");
		for (i=0;i<size;i++){
		    System.out.print(array[i] +" ");
		}
		//Bubble Sort Algorithm
		for (k=0;k<size;k++)
		    for (i=0;i<size-1-k;i++)
		        if (array[i+1]<array[i]){
		            temp=array[i];
		            array[i]=array[i+1];
		            array[i+1]=temp;
		        }
		System.out.println();
		System.out.println("Numbers in ascending order : ");
	    for (i=0;i<size;i++){
		    System.out.print(array[i] +" ");
		}
	}
}
