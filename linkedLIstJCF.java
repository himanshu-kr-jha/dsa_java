import java.util.LinkedList;
public class linkedLIstJCF {
    public static void main(String args[]){
        //create -> can only stores objects (Integer,Float,Character)
        LinkedList<Integer> ll =new LinkedList<>();
        //add
        ll.addFirst(1);
        ll.addLast(5);
        ll.addFirst(0);
        System.out.println(ll);
        //remove
    }
}
