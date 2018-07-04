#include<iostream>
#include<vector> 
using namespace std;
class Solution{
	public:
		vector<int> twoSum(vector<int>& nums,int target){
			vector<int> v;
			vector<int>::iterator p;
			vector<int>::iterator q;
			p=nums.begin();
			int i,j;
			for(p,i=0;p!=nums.end();p++,i++){
				q=p;
				q++;
				int flag=0;
				for(q,j=i+1;q!=nums.end();q++,j++){
					if((*p)+(*q)==target){
						v.push_back(i);
						v.push_back(j);
						flag=1;
						break;
					}
			/*		if(flag==1){
						break;
					}
					
			*/		
				}
			}
			return v;
		}
};

int main(){
	
	vector<int> nums;
	nums.push_back(1);
	nums.push_back(2);
	nums.push_back(3);
	nums.push_back(4);
	nums.push_back(5);
	vector<int>::iterator iter;
	for(iter=nums.begin();iter!=nums.end();iter++){
		cout<<*iter<<"\n";
	}
	cout<<"---------------\n";
	Solution s;
	vector<int> v=s.twoSum(nums,7);
	for(iter=v.begin();iter!=v.end();iter++){
		cout<<*iter<<"\n";
	}
	return 0;
}
