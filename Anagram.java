import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String a, String b){

        String s1 = a.toLowerCase();
        String s2 = b.toLowerCase();

        char str1 [] = s1.toCharArray();
        char str2 [] = s2.toCharArray();

        Arrays.sort(str1);
        Arrays.sort(str2);

        if(Arrays.equals(str1, str2) == true){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        
        String s = "Anagram";
        String b = "Nagaram";

        if(isAnagram(s, b)){
            System.out.println("Strings are anagram");
        }
        else{
            System.out.println("Strings are not anagram");
        }
    }
    
}
