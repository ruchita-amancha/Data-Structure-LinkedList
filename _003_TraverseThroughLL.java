
public class _003_TraverseThroughLL {

    public static void traverseThroughLL(int[] arr){
        Node head=_002_ConvertArray2LL.convertArray2LL(arr);
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
       int arr[]={2,4,7,9,4,56,78};
       traverseThroughLL(arr);
    }
}
