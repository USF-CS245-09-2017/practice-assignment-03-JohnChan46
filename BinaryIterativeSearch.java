public class BinaryIterativeSearch implements Practice03Search{
	public BinaryIterativeSearch(){

	}

//@Override
	public String searchName(){
		return "Binary Iterative Search";
	}


//@Override
	public int search(int[]a, int target){
		int start = 0;
		int end = a.length;

		while(start < end){
			int mid = (start + end)/2;
			if (a[mid] == target)// check if the target is mid
				return mid;
			if (a[mid] < target)// check if target is bigger than mid; if so, ignore left half
				start = mid + 1;
			else // check if target is smaller than mid; if so, ignore right half
				end = mid - 1;

		}
		return -1;

		}




	}









