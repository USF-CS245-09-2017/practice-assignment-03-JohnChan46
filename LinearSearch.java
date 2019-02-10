public class LinearSearch implements Practice03Search{

	public LinearSearch(){
	}

//@Override
	public String searchName(){
		return "Linear Search";
	}


//@Override
	public int search(int[]a, int target){
		for (int i = 0; i < a.length; i++){
			if (a[i] == target)
				return i;

	}
		return -1;
		}
		
}