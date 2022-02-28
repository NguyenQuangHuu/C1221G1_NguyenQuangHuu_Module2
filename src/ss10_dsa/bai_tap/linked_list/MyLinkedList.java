package ss10_dsa.bai_tap.linked_list;

public class MyLinkedList<E> {
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }

        public Object getData(){
            return this.data;
        }
    }
    //Phần tử đầu tiên của linkedlist
    private Node head;
    //số lượng phần tử trong danh sách
    private int  numsNode = 0;

    public MyLinkedList(){

    }

    public void addFirst(E element){
        //Khai báo một biến temp tham chiếu đến node head tiếp theo
        Node temp = head;
//        Biến head sẽ nhận giá trị là 1 node mới.
        head = new Node(element);
        //head.next trở đến temp
        head.next = temp;
        numsNode++;
    }

    public void addLast(E element){
        //Khai báo biến temp
        Node temp = head;

        // Sẽ cho con trỏ chạy đến phần tử cuối cùng của danh sách;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(element);
        numsNode++;
    }

    public void add(int index, E element){
        //Khai báo biến temp trỏ đến head
        Node temp = head;
        //Khai báo 1 biến node là holder
        Node holder;
        // Cho con trỏ chạy đến vị trí index -1;
        for(int i = 0;i< index -1 && temp.next!=null;i++){
            temp = temp.next;
        }
        //cho holder tham chiếu đến vị trí index
        holder = temp.next;
        //Node tại vị trí index -1 sẽ trỏ tới node mới
        temp.next = new Node(element);
        temp.next.next = holder;
        numsNode++;
    }

    public void remove(int index){
        Node temp = head;
        
    }

}
