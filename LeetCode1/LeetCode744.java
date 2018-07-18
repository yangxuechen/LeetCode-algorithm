package leetCode2;

public class LeetCode744 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      char []a= {'a','b','c','d','e','f','g','h'};
      char c=nextGreatestLetter(a,'f');
      System.out.println(c);
	}
	
    public static char nextGreatestLetter(char[] letters, char target) {
        int left=0;
        int right=letters.length-1;
        while(left<right) {
        	int middle=(left+right)/2;
        	if(target<letters[middle]) {
        		right=middle-1;
        	}else if(target>=letters[middle]) {
        		left=middle+1;
        	}
        }
    	return left<letters.length?letters[left]:letters[0];
//    	if(target>=letters[letters.length-1]) {
//    		return letters[0];
//    	}
//    	for(int i=0;i<letters.length;i++) {
//    		if(letters[i]>target) {
//    			return letters[i];
//    		}
//    	}
//    	return letters[0];
    }

}
