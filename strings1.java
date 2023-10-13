public class strings1 {
    public static void palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println("Not Palindrome");
            }else{
                System.out.println("palindrome");
            }
        }
    }
    public static float shortestpath(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            switch(str.charAt(i)){
                case 'N' :x++;break;
                case 'S' :x--;break;
                case 'E' :y++;break;
                case 'W' :y--;break;
            }
        }
        float shortest=(float) Math.sqrt(x*x+y*y);
        return shortest;
    }
    public static void main(String args[]){
        // String name= "abba";
        // palindrome(name);
        String drxn="NSNSSS";
        System.out.println(shortestpath(drxn));
        
    }
    
}
