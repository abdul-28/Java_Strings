import java.util.Arrays;

public class ReverseChar {
    public static void main(String[] args) {
        char [] ch ={'w','e','l','c','o','m','e'};
        int start = 0;
        int end = ch.length-1;
        char temp;
        while(start < end){
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(ch));
    }
    
}
