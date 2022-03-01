package ss11_stack_queue.thuc_hanh.queue_list;

public class QueueLinkedListTest {

        public static void main(String[] args) {
            QueueLinkedList queue = new QueueLinkedList();
            queue.enqueue(10);
            queue.enqueue(20);
            queue.dequeue();
            queue.dequeue();
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);
            System.out.println("Dequeued item is " + queue.dequeue().key);
        }

}
