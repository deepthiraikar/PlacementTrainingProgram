import java.io.IOException;
import java.util.Scanner;
public class Prompt {
    public static void main(String[] args) throws IOException,InterruptedException {
        Scanner sc= new Scanner(System.in);
        Runtime run=Runtime.getRuntime();
        System.out.println("Enter the app you want to open:");
        String app=sc.next();
        Thread.sleep(3000);
        Process pro=run.exec(app);
   }
}
