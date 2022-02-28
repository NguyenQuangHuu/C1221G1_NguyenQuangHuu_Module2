package ss10_dsa.thuc_hanh.linked_list;

public class Node {
    Node next;
    Object data;

    public Node(Object data){
        this.data = data;
    }

    public Object getData(){
        return this.data;
    }
}
