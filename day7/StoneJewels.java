import java.util.HashSet;

public class StoneJewels {
    public static int findCount(String jw, String st){
        HashSet<Character> jSet=new HashSet<>();
        for(char each: jw.toCharArray()) jSet.add(each);
        int c=0;
        for(char each: st.toCharArray()){
            if(jSet.contains(each)) c++;
        }
        return c;

    }

    public static void main(String[] args) {
        String jewels="aA", stones="aAAbbb";
        System.out.println(findCount(jewels, stones));
    }
}
