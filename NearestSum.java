package buildTool;

import java.util.ArrayList;

public class NearestSum {

	public static void main(String[] args) {
		NearestSum ns = new NearestSum();
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(-1);
		A.add(2);
		A.add(1);
		A.add(-4);
		int B = 1;
		int result = ns.threeSumClosest(A, B);
		System.out.print("Nearest sum is: " + result);
	}
	
	    public int threeSumClosest(ArrayList<Integer> A, int B) {
	        int sum=0, lowestDiff=Integer.MAX_VALUE, currentDiff, answer=Integer.MAX_VALUE;
	        for (int i=0; i<A.size()-2; i++){
	        	for(int j=i+1; j<A.size()-1; j++){
	        		for(int k=j+1; k<A.size(); k++){
	        sum = A.get(i) + A.get(j) + A.get(k);
	             currentDiff = Math.abs(sum - B);
	             if (currentDiff < lowestDiff){
	                lowestDiff = currentDiff;
	                answer = sum;
	             }
	     }
	 }
	} 
	    return answer;
	}

}
