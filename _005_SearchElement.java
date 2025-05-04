public class _005_SearchElement {
    public static int checkIfElePresent(Node head,int ele){
        Node temp=head;
        while(temp!=null){
            if(temp.data==ele){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
    public static void main(String args[]){
        int arr[]={2,4,7,9,4,56,78};
        Node head=_002_ConvertArray2LL.convertArray2LL(arr);
        System.out.print(checkIfElePresent(head,561));
    }
}
