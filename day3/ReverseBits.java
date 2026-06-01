public class ReverseBits {
    public static int reverseBit(int n) {
        String binary= String.format("%32s",
        Integer.toBinaryString(n))
        .replace(' ','0');
        String rev=new StringBuilder(binary).reverse().toString();

        return (int) Long.parseLong(rev,2);
    }

    public static void main(String[] args) {
        int n= 43261596;
        System.out.println(reverseBit(n));
    }
}
