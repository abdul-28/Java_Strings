import java.util.Arrays;

public class LongestCommonPrefix {

    static String commonPrefix(String [] s){

        String out = "";
        Arrays.sort(s);
        String s1 = s[0];
        String s2 = s[s.length-1];

        for(int i=0;i<s.length;i++){
            if(s1.charAt(i)==s2.charAt(i)){
                out += s1.charAt(i);
            }
            else{
                break;
            }
        }
        return out;
    }

    public static void main(String[] args) {
        String [] str ={"flight","flow","flower"};
        String result = commonPrefix(str);
        System.out.println("The longest common prefix is : "+result);
    }
    
}
