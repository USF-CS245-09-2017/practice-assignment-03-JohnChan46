public class BinaryRecursiveSearch implements Practice03Search{
	
	public BinaryRecursiveSearch(){

	}

//@Override
	public String searchName(){
		return "Binary Recursive Search";
	}


//@Override
	public int search(int[]a, int target){
		return recursive(a, target, 0, a.length-1); // return the recursive function
		}

	public int recursive(int[]a, int target, int start, int end){// recursive binary search 
		int mid = (start + end)/2;

		if (a[mid] == target) // check if the target is mid
			return mid;
		if (a[mid] > target) // check if target is smaller than mid; if so, ignore right half
			return recursive(a, target, start, mid - 1);
		else // check if target is bigger than mid; if so, ignore left half
			return recursive(a, target, mid + 1, end);
	}




	}
