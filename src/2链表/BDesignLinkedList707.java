/**
 * Created with IntelliJ IDEA.
 * User: lixin
 * Date: 2021/11/30
 * Time: 20:28
 * Description: No Description
 */
class BDesignLinkedList707 {

    public static void main(String[] args) {


        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(7);
        linkedList.addAtHead(2);
        linkedList.addAtHead(1);
        linkedList.addAtIndex(3,0);
        linkedList.deleteAtIndex(2);
        linkedList.addAtHead(6);
        linkedList.addAtTail(4);
        linkedList.get(4);
        linkedList.addAtHead(4);
        linkedList.addAtIndex(5,0);
        linkedList.addAtHead(6);
        System.out.println("11");
    }


}