public class _004_LengthOfLL {
    public static int lengthOfLL(Node head){
        int cnt=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args){
        int arr[]={2,4,7,9,4,56,78};
        Node head=_002_ConvertArray2LL.convertArray2LL(arr);
        System.out.print(lengthOfLL(head));
    }
}
