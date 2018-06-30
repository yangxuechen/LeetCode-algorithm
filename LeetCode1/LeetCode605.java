package leetCode2;

public class LeetCode605 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[]= {0,0};
     boolean b=canPlaceFlowers(a,1);
     if(b) {
    	 System.out.println("true");
     }
     for(int i:a) {
    	 System.out.println(i);
     }
	}
	
	/**
	 * function 1
	 * @param flowerbed
	 * @param n
	 * @return
	 */
	
	/*
	public static boolean canPlaceFlowers(int[] flowerbed, int n) {
	    for(int i=0;i<n;i++) {
	    	if(!placeFlowers(flowerbed)) {
	    		return false;
	    	}
	    }
		return true;
	}
	public static boolean placeFlowers(int flowerbed[]) {
		for(int i=0;i<flowerbed.length;i++) {
			if(i==0){
				if(flowerbed.length>1) {
					if(flowerbed[i+1]==0&&flowerbed[i]==0) {
						flowerbed[i]=1;
						return true;
					}
				}else if(flowerbed[i]==0){
					return true;
				}
				
				
			}else if(i==flowerbed.length-1) {
				 if(flowerbed[i-1]==0&&flowerbed[i]==0) {
						flowerbed[i]=1;
						return true;
				 }
			}else if(flowerbed[i-1]==0&&flowerbed[i]==0&&flowerbed[i+1]==0) {
				flowerbed[i]=1;
				return true;
			}
		}
		return false;
	}
	
	*/
	
	public static boolean canPlaceFlowers(int flowerbed[],int n) {
		int count=0;
		for(int i=0;i<flowerbed.length;i++) {
			if(flowerbed[i]==1) {
				continue;
			}
			int pre=0;
			int next=0;
			if(i==0) {
				pre=1;
			}else {
				if(flowerbed[i-1]==0) {
					pre=1;
				}
			}
			
			if(i==flowerbed.length-1) {
				next=1;
			}else {
				if(flowerbed[i-1]==0) {
					next=1;
				}
			}
			if(pre==1&&next==1) {
				flowerbed[i]=1;
				count++;
			}
		}
		if(count>=n) {
			return true;
		}
		return false;
	}
}
