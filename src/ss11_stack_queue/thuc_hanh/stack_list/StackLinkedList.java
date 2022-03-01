package ss11_stack_queue.thuc_hanh.stack_list;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class StackLinkedList<T> {
    public LinkedList<T> stack;

    public StackLinkedList(){
        stack = new LinkedList<>();
    }

    public void push(T t){
        stack.addFirst(t);
    }

    public T pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public int size(){
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}
