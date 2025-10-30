public class ReversePalindrome{
    public static String reverse(String s){
        StringBuilder sb = new StringBuilder(s);
        if(s==null || s.length()<1){
            return "";
        }
        sb = sb.reverse();
        String rev = sb.toString();

        return rev;
    }
    public static void main(String[] args) {
        String s = "malayalam";
        String reversed = reverse(s);
        System.out.println("reversed string is : "+reversed);
        if(s.equals(reversed)){
            System.out.println("it's a palindromic string");
        }
        else{
            System.out.println("not a palindromic string");
        }
    }
}
