//5. Create an array of twenty elements and then find the second largest element.

class Question5{	
		static int findLargest(int arr[]){
			int temp = arr[0];
			for(int i=1;i<20;i++){
				if (temp<arr[i]){ temp=arr[i]; }
			}
			return temp;
		}
			
		static int[] replaceLargest(int arr[], int item){
			for(int i=0;i<20;i++){
				if (item==arr[i]){ arr[i]=Integer.MIN_VALUE; }
			}
			return arr;
		}
						
	public static void main(String args[])
	{
	int[] myArray = new int[]{23,43,1,99,21,87,43,65,99,88,22,76,54,12,54,76,28,43,75,50};
	for(int i=1;i<20;i++){
		System.out.print(myArray[i] + ", ");
	}
			
	//find largest item
	int largest = findLargest(myArray);
	//remove largest item from array-every occurence
	myArray = replaceLargest(myArray, largest);
	//find second-largest item
	int secondLargest = findLargest(myArray);
	
	System.out.println("\n\nSecond largest element : " + secondLargest);
	
	}//end main
}//end class Question5