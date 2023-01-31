package LinkedList;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println("19 is a happy number: "+isHappy(19));
        System.out.println("12 is a happy number: "+isHappy(12));
    }
    static boolean isHappy(int n) {
        int fast=n;
        int slow=n;
        do{
            slow=squiredValue(slow);
            fast=squiredValue(squiredValue(fast));
        }while(fast!=slow);
        if(slow==1)return true;
        return false;
    }
    static int squiredValue(int n){
        int ans=0;
        while(n!=0){
            int rem=n%10;
            ans+=(rem*rem);
            n=n/10;
        }
        return ans;
    }
}
