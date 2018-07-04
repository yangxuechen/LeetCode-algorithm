#include<iostream>
#include<list>
using namespace std;

struct ListNode {
      int val;
      ListNode *next;
      ListNode(int x) : val(x), next(NULL) {}
  };
class Solution {
public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        ListNode *head=new ListNode(0);
        ListNode *p=head;
        while(l1!=NULL&&l2!=NULL){
        	if(l1->val<l2->val){
        		ListNode *node=new ListNode(l1->val);
        		p->next=node;
        		p=p->next;
        		l1=l1->next;
			}else{
				ListNode *node=new ListNode(l2->val);
        		p->next=node;
        		p=p->next;
        		l2=l2->next;
			}
		}
		while(l1!=NULL){
			ListNode *node=new ListNode(l1->val);
        		p->next=node;
        		p=p->next;
        		l1=l1->next;
		}
		while(l2!=NULL){
				ListNode *node=new ListNode(l2->val);
        		p->next=node;
        		p=p->next;
        		l2=l2->next;
		}
		return head->next;
    }
};
void printList(ListNode *l){
	ListNode *p=l;
	while(p!=NULL){
		cout<<p->val<<"\n";
		p=p->next;
	}
}
int main(){
	ListNode* node1=new ListNode(1);
	ListNode* node2=new ListNode(4);
	ListNode* node3=new ListNode(8);
	ListNode* node4=new ListNode(2);
	ListNode* node5=new ListNode(6);
	ListNode* node6=new ListNode(9);
	node1->next=node2;
	node2->next=node3;
	
	node4->next=node5;
	node5->next=node6;
	Solution s;
	ListNode *head=s.mergeTwoLists(node1,node4);
	printList(head);
	return 0;
} 
