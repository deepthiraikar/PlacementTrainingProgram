import java.util.Scanner;

public class Forward {
    static Scanner sc=new Scanner(System.in);
    static int weight, height;
    public static void calculateBMI(){
        try{
            int bmi= weight/(height*height);
            System.out.println(bmi);
        }catch(ArithmeticException am){
            System.out.println("Reached service....");
            throw am;
        }
    }
    public static void executor(){
        try{
            calculateBMI();
        }catch(ArithmeticException ar){
            try{
                System.out.println("Enter non zero height:");
                height=sc.nextInt();
                calculateBMI();
            }catch(ArithmeticException a){
                System.out.println("Enter non zero height:");
                height=sc.nextInt();
                try{calculateBMI();}
                catch(ArithmeticException ae){
                System.out.println("Out of attempts");}
            }

        }
    } 

    public static void main(String[] args) {
        System.out.println("Check bmi with weight and height");
        weight=sc.nextInt();
        height=sc.nextInt();
        executor();
        }
}
