#include<iostream>
#include<vector>
using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
    	if(nums.size()==0){
    		return 0;
		}
        vector<int>::iterator i;
        int count=nums.size();
        i=nums.begin();
        for(i;i<(nums.end()-1);){
          if(*i==*(i+1)){
          	i=nums.erase(i);
          	count--;
		  }else{
		  	i++;
		  }
		}
		return count;
    }
};
int main(){
	vector<int> v;
	v.push_back(1);
	v.push_back(1);
	v.push_back(1);
	v.push_back(1);
	v.push_back(6);
	v.push_back(17);
	Solution s;
	int n=s.removeDuplicates(v);
	cout<<n<<"\n";
	cout<<"*************\n";
	vector<int>::iterator i;
	for(i=v.begin();i!=v.end();i++){
		cout<<*i<<endl;
	}
	return 0;
}
