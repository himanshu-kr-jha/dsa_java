import java.util.*;
public class queue {
    // Implementation of queue using array
    
    /* 
    static class QueueA{
        static int arr[];
        static int size;
        static int rear;
        QueueA(int n){
            arr=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void enqueue(int data){// O(1)
            if(rear==size-1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear]=data;
        } 
        public static int dequeue(){// O(n)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];  
            }
            rear--;
            return front;
        }
        public static int peek(){ //O(1)
            return arr[0];
        }
    }
    */

// Implementation of circular queue using arrays
    
/* 

    static class CircularQueue{
        static int arr[];
        static int size;
        static int rear; 
        static int front;
        CircularQueue(int n){
            arr=new int[n];
            size=n;
            rear=-1;
            front=-1;
        }
        static boolean isEmpty(){
            return rear==-1&& front==-1;
        }
        static boolean isFull(){
            return ((rear+1)%size)==front;
        }
        static void enqueue(int data){
            if(isFull()){
                System.out.println("Queue is full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        static int dequeue(){
            if(isEmpty()){
                return -1;
            }
            int data= arr[front];
            //last element
            if(rear==front){
                rear=-1;
                front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return data;
        }
        static int peek(){
            return arr[front];
        }
    }

    */

    // Node of linked list
    /* 
    static class Node{
            int data;
            Node next;

            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
       */ 

//Queue implementation with linked list
      
      /* 
    static class QueueLL{
        //we will maintain head and tail pointer  and apply 
        // enqueue-> add at end
        // dequeue -> remove from beginning
        // peek-> show from front
        static Node head=null;
        static Node tail=null;
        static boolean isEmpty(){
            return head==null && tail == null;
        }
        static void enqueue(int data){
            Node newnode=new Node(data);
            if(head==null){
                head=tail=newnode;
                return;
            }
            tail.next=newnode;
            tail=newnode;
        }
        static int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int data=head.data;
            if(tail==head){
                tail=head=null;
            }else{
                head=head.next;
            }
            return data;

        }
        static int peek(){
            if(isEmpty()){
                System.out.println("Empty Queue");
            }
            return head.data;
        }
        
    }*/
    public class queueJCF{
        // object of queue cannot be made as it is interface
        // in java queue can be implemented by two ways 1. linked list and 2.ArratDeque
        // syntax
        // Queue <objectName> queue_name = new LinkedList/ArrayDeque<>();
    }
    public static void main(String args[]){
        // QueueLL a=new QueueLL();
        // a.enqueue(1);
        // a.enqueue(12);
        // a.enqueue(13);
        // a.enqueue(134);
        // while(!a.isEmpty()){
        //     System.out.println(a.peek());
        //     a.dequeue();    
        // }
        // Queue<Integer> q = new java.util.LinkedList<>();
        Queue <Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.poll());
        q.remove();
    

    }    
}
