public class LengthOfLastWord {

    public static int lengthOfLastWord(String s){

        s = s.trim();
        String [] str = s.split(" ");
        String last = str[str.length - 1];

        return last.length();
    }

    public static void main(String[] args) {
        
        String s = " fly me to the moon ";
        int length = lengthOfLastWord(s);

        System.out.println("Length of the last word : "+length);
    }
    
}
