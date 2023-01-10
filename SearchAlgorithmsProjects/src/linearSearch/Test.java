package linearSearch;

public class Test {
	public static void main(String[] args) {
		int arr[] = {1, 5, 20, 35, 50, 65, 70};
	     int x = 50;
	     int result = LinearSearch.search(arr,x);
	     
	     if(result == -1)
	    	 System.out.println("Element is not present in array");
	     else
	    	 System.out.println("Element is present at " + result );
	}
}
