import java.util.*;
public class queue {
    static class Queue{
        private static final int Rdata = 0;
        private static final int key = 0;
        static int queueA[];
        static int size;
        static int rear;
        Queue(int n){
            queueA=new int[n];
            size=n;
            rear=-1;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        static void enqueue(int data){
            if(size==0){
         //       front=0;
                rear=0;
            }
            else{
                rear=rear+1;
            }
            queueA[rear]=data;
        }
        public static int dequeue(){
            if(size!=0){
                int key= queueA[rear];
                rear=rear-1;
            }
            else{
                return -1;
            }
            return key;
        }
        public static int peek(){
            return queueA[rear];
        }
    }
    public static void main(String args[]){
        Queue a=new Queue(5);
        a.enqueue(1);
        a.enqueue(12);
        a.enqueue(13);
        a.enqueue(134);
        System.out.println(a.peek());
    }    
}
