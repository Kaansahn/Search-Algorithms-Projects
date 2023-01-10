package binarySearch;

public class BinarySearch {
	int binarySearch(int[] array, int l, int r, int x) {
		if (r >= l) {
			int mid = l + (r - 1)/2;
			if (array[mid] == x)
				return mid;
			if (array[mid] > x)
				return binarySearch(array, l, mid-1, x);
			return binarySearch(array, mid+1, r, x);
		}
		return -1;
	}

}
