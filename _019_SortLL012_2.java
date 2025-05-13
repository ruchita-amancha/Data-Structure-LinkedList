
public class _019_SortLL012_2 {

    public static Node sortLL(Node head) {

        Node zeroHead = new Node(-1);
        Node oneHead = new Node(-1);
        Node twoHead = new Node(-1);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                zero.next=temp;
                zero=zero.next;
            }
            else if(temp.data==1){
                one.next=temp;
                one=one.next;
            }
            else if(temp.data==2){
                two.next=temp;
                two=two.next;
            }
            temp=temp.next;
        }
        zero.next=(oneHead.next) != null?(oneHead.next):(twoHead.next);
        one.next=twoHead.next;
        twoHead.next=null;
        return zeroHead.next;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,0,2,1,0,0,1,2,1,2};
        Node head = _002_ConvertArray2LL.convertArray2LL(arr);
        head = sortLL(head);
        PrintLinkedList.printLinkedList(head);
    }
}

// | Complexity       | Value    |
// | ---------------- | -------- |
// | Time Complexity  | **O(n)** |
// | Space Complexity | **O(1)** |

// Time Complexity (TC)
// Step-by-step:
// You traverse the entire list once:
// → while(temp != null) → O(n)

// The pointer rearrangements (zero.next, one.next, etc.) are all O(1) operations per node

// Final connections (zero.next = ..., one.next = ...) are O(1)

// ✅ Final TC = O(n)
// 🖥 Space Complexity (SC)
// You are NOT creating any new nodes —
// you are just reusing existing nodes and relinking them

// The extra space is for dummy nodes:
// → zeroHead, oneHead, twoHead → These are just 3 pointers (constants)
// → Also zero, one, two, temp → constant pointers

// ✅ Final SC = O(1) (constant space)