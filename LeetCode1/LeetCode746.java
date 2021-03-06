package leetCode2;

public class LeetCode746 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cost[]= {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
		int n=minCostClimbingStairs(cost);
		System.out.println(n);
	}
    public static int minCostClimbingStairs(int[] cost) {
    	int step[]=new int[1024];
        step[0]=0;
        step[1]=0;
        if(cost.length==0) {
        	return 0;
        }
        if(cost.length==1) {
        	return cost[0];
        }
        if(cost.length==2) {
        	return Math.min(cost[0], cost[1]);
        }
        for(int i=2;i<=cost.length;i++) {
        	step[i]=Math.min(step[i-1]+cost[i-1], step[i-2]+cost[i-2]);
        }
    	return step[cost.length];
    }
}
