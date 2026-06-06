import java.util.HashSet;

public class MorseCode {
    public static int unique(String[] arr){
       String[] code={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
       HashSet<String> uStore=new HashSet<>();
       for(String each: arr){
        StringBuilder build=new StringBuilder();
        for(char ch: each.toCharArray())
            build.append(code[ch-'a']);
        uStore.add(build.toString());
       }
       return uStore.size();
    }

    public static void main(String[] args) {
        String arr[]={"gin","zen","gig","msg"};
        System.out.println(unique(arr));
    }
}
