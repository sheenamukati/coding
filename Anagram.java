package buildTool;

import java.util.ArrayList;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		ArrayList<String> input = new ArrayList<String>();
		input.add("cat");
		input.add("pot");
		input.add("atc");
		input.add("top");
		Anagram m = new Anagram();
		ArrayList<ArrayList<Integer>> output = m.anagrams(input);
	}

	int[] countOccur(String st){
		int c[] = new int[128];
		char ch[] = st.toCharArray();
		for (int i=0; i<ch.length; i++){
			c[ch[i]]++;
		} 
		return c;
	}

	boolean compare(int a[], int b[]){
		for(int i=0; i<b.length; i++){
			if (a[i] != b[i]){
				return false;
			} 
		}
		return true;
	}

	
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
    	ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();

    	for (int i=0; i<A.size() - 1; i++) {
    		for (int j=i+1; j<A.size(); j++) {
    			String s1 = A.get(i);
    			String s2 = A.get(j);
    			boolean result;
    			if (s1.length() != s2.length()){
    				break;
    			}

    			Anagram m = new Anagram();
    			int sc1[] = m.countOccur(s1);
    			int sc2[] = m.countOccur(s2);
    			result = m.compare(sc1, sc2);
    			
    			if (result) {
    				ArrayList<Integer> res = new ArrayList<Integer>();
    				res.add(i + 1);
    				res.add(j + 1);
    				output.add(res);
    			}
    		}
    	}
    	
    	return output;
	}
}
