public class Patterns {
    public static void floyds(String name){
        int size=name.length();
        for(int i=0;i<size;i++){
            for(int space=size-i-1;space>=0;space--)
                System.out.print(" ");
            for(int j=0;j<=i;j++)
                System.out.print(name.charAt(j));
            System.out.println();
        }
    }

    public static void sandClock(String str){
        int size=str.length();

        //upper
        for(int i=size/2;i>0;i--){
            for(int space=size-1;space>i;space--)
                System.out.print(" ");
            for(int j=0;j<=i*2 && j<str.length();j++)
                System.out.print(str.charAt(j));
            System.out.println();
        }
    

        //lower
        for(int i=0;i<size/2;i++){
            for(int space=size-1;space>i;space--)
                System.out.print(" ");
            for(int j=0;j<=i*2 && j<str.length();j++)
                System.out.print(str.charAt(j));
            System.out.println();
        }
    }
    public static void main(String[] args) {
    floyds("Deepthi");
    System.out.println();
    sandClock("Raikar");
}
}
