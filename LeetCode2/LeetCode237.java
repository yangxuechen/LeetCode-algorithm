package LeetCode2;

public class LeetCode237 {
    public static void main(String[] args) {

        ListNode h=getList();
        traversingList(h);
        ListNode tmp=h;
        for(int i=0;i<3;i++){
            tmp=tmp.next;
        }

        System.out.println(tmp.val);

        deleteNode(tmp);
        traversingList(h);
    }
    public static void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }
    public static void traversingList(ListNode h){
        while(h!=null){
            System.out.print(h.val+" ");
            h=h.next;
        }
        System.out.println();
    }
    public static ListNode getList(){
        ListNode n1=new ListNode(1);
        ListNode n2=new ListNode(2);
        ListNode n3=new ListNode(3);
        ListNode n4=new ListNode(4);
        ListNode n5=new ListNode(5);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        return n1;
    }
}
