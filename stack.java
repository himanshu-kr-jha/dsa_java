/*
implementation of stack using different methods
1. arraylist
2.linkedlist
3. Java collection framework
 */

import java.util.ArrayList;
import java.util.Stack;
public class stack{
    public static class stackLL{
        static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        public static Node head;
        //public static Node tail;
        static int size;
        public static boolean isEmpty(){
            return head==null;
        }
        public static void push(int data){
            Node newnode=new Node(data);
            if(isEmpty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;

        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static class stackA{
        static ArrayList <Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            // if(list.size()==0){
            //     return true;
            // }
            // return false;
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public static int peek(){
            return list.get(list.size()-1);
        }
    }
    public static void pushAtbottom(Stack <Integer>s,int data){
            if(s.isEmpty()){
                s.push(data);
                return;
            }
            int top=s.pop();
            pushAtbottom(s, data);
            s.push(top);
        }
        public static String reverseString(String str){
            Stack <Character>c = new Stack<>();
            int i=0;
            while(i<str.length()){
                c.push(str.charAt(i));
                i++;
            }
            StringBuilder s=new StringBuilder("");
            while(!c.isEmpty()){
                s.append(c.pop());
            }
            return s.toString();
        }
        public static void reverse(Stack <Integer> s){
            if(s.isEmpty()){
                return;
            }
            int top=s.pop();
            reverse(s);
            pushAtbottom(s, top);
        }
        public static void stockSpan(int stock[],int span[]){
            //span of 0th element would be 1 and that of (n-1)th element would be n+1. 
            // span = index -  prevHighIDX
            
            // store prev_high index in stack... if current element is smaller than prev , then keep poping until immediate bigger element
            Stack<Integer> s =new Stack<>();
            span[0]=1;
            s.push(0);
            for(int i=1;i<stock.length;i++){
                int curr_price=stock[i];
                while(!s.isEmpty() && curr_price>stock[s.peek()]){
                    s.pop();
                }
                if(s.isEmpty()){
                    span[i]=stock.length+1;
                }else{
                    int prev_high=s.peek();
                    span[i]=i-prev_high;
                }
                s.push(i);
            }

        }
        public static int[] nextgreaterelement(int arr[]){
            // this function is implemented by using index of the given array.

            Stack<Integer>nxtStack=new Stack<>();
            int nxtArr[]=new int[arr.length] ;
            for(int i=arr.length-1;i>=0;i--){
                while(!nxtStack.isEmpty()&&arr[nxtStack.peek()]<=arr[i]){
                    nxtStack.pop();
                }
                if(nxtStack.isEmpty()){
                    nxtArr[i]=-1;
                }else{
                    nxtArr[i]=arr[nxtStack.peek()];
                }
                nxtStack.push(i);
            }
            return nxtArr;
            //four variations can be possible with this logic...
            //next greater right
            //next greater left
            //next smaller right
            //next smaller left
        }

        public static boolean validParenthese(String str){
            Stack<Character>s=new Stack<>();
            for(int i=0;i<str.length();i++){
                char token=str.charAt(i);
                if(token=='('||token=='{'||token=='['){
                    s.push(token);
                }else{
                    if((s.peek()=='{'&&token=='}')||(s.peek()=='['&&token==']')||(s.peek()=='('&&token==')')){
                        s.pop();
                    }else{
                        return false;
                    }
                }
            }
            if(s.isEmpty()){
                return true;
            }else{
                return false;
            }
        }
        public static boolean duplicateParentheses(String str){
            for (int i=0;i<str.length()-1;i++){
                Stack<Character>s=new Stack<>();
                char ch=str.charAt(i);
                if(ch==')'){
                    int count=0;
                    while(!s.isEmpty()&&s.peek()!='('){
                        count++;
                        s.pop();
                    }
                    if(count<1){
                        return true;
                    }else{
                        s.pop();
                    }
                }else{
                    s.push(ch);
                }
            }
            return false;
        }

        public static int[] nextsmallerelementR(int arr[]){
            // this function is implemented by using index of the given array.
            Stack<Integer>nxtStack=new Stack<>();
            int nxtArr[]=new int[arr.length] ;
            for(int i=arr.length-1;i>=0;i--){
                while(!nxtStack.isEmpty()&&arr[nxtStack.peek()]>=arr[i]){
                    nxtStack.pop();
                }
                if(nxtStack.isEmpty()){
                    nxtArr[i]=arr.length;
                }else{
                    nxtArr[i]=nxtStack.peek();
                }
                nxtStack.push(i);
            }
            return nxtArr;
        }
        public static int[] nextsmallerelementL(int arr[]) {
            Stack<Integer> nxtStack = new Stack<>();
            int nxtArr[] = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {  // Change loop condition to iterate through all elements
                while (!nxtStack.isEmpty() && arr[nxtStack.peek()] >= arr[i]) {
                    nxtStack.pop();
                }
                if (nxtStack.isEmpty()) {
                    nxtArr[i] = -1;
                } else {
                    nxtArr[i] = nxtStack.peek();
                }
                nxtStack.push(i);
            }
            return nxtArr;
        }
        

        public static int maxAreaHistogram(int arr[]){
            int max=0;
            int rightSmallerArr[]=new int[arr.length];
            int leftSmallerArr[]=new int[arr.length];
            //next smaller right
            rightSmallerArr=nextsmallerelementR(arr);
            //next smaller left
            leftSmallerArr=nextsmallerelementL(arr);
            //current area
            for(int i=0;i<arr.length;i++){
                int width=rightSmallerArr[i]-leftSmallerArr[i]-1;
                int area= arr[i]*width;
                max=Math.max(max, area);
            }
            return max;
        }
        public static void main(String args[]){
        /* 
        //object.push(int data)
        //object.pop() -> remove and returns poped element
        //object.peek() -> returns the last element of stack   
        there are other functionality of Stack in JCF 
         */
        //stackA s1=new stackA();
        // Stack<Integer>s =new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);
        // reverse(s);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
        //     s.pop();
        // }
        // System.out.println("after push at bottom");
        // pushAtbottom(s,4);
        // while(!s.isEmpty()){
        //     System.out.println(s.peek());
            
        // }
        // System.out.println(reverseString("Himanshu"));
        // stackLL s1 = new stackLL();
        // System.out.println(s1.isEmpty());
        // s1.push(2);
        // s1.push(8);
        // s1.push(9);
        // while(!s1.isEmpty()){
        //     System.out.println(s1.peek());
        //     s1.pop();
        // }
        // System.out.println(s1.peek());
        // System.out.println(s1.pop());
        // System.out.println(s1.peek());
        // System.out.println(s1.isEmpty());
        // int stock[]={100,80,60,70,60,85,100};
        // int span[]=new int[7];
        // stockSpan(stock, span);
        // for(int i=0;i<span.length;i++){
        //     System.out.println(span[i]);
        // }
        //Stack<Integer>s =new Stack<>();
        // int arr[]={6,8,0,1,3};
        // int arr[]={8,9,4,6,2};
        // int arr[]={1,0,1,1,1,0};
        // int nGe[]=nextgreaterelement(arr);
        // for(int i=0; i<nGe.length;i++){
        //     System.out.print(nGe[i]+" ");
        // }
        // String str="(){}[]";
        // System.out.println(validParenthese(str));
        // String str="((c+d))";
        // System.out.println(duplicateParentheses(str));
        int arr[]={8,3,5,3};
        System.out.println(maxAreaHistogram(arr));

    }
}