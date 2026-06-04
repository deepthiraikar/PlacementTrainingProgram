
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;
public class DemoLogs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Logger logger=Logger.getLogger(DemoLogs.class.getName());
        String[] recruiters={"Google","Dlithe","Cognizant","Acccenture","ZOHO"};
        int day=0;

        try{
            System.out.println("Enter the day to get name of the company");
            day=sc.nextInt(); day--;
            logger.info("requested day"+day);
            System.out.println(recruiters[day]);
        }
        catch(ArrayIndexOutOfBoundsException | InputMismatchException exc){
            if(exc.equals("InputMismatchException")){
                Scanner temp=new Scanner(System.in);
                System.out.println("Day must be between 1 and"+recruiters.length);
                logger.severe(exc.toString());
                day=temp.nextInt(); day--;
            }
            System.out.println("Day must be between 1 and"+recruiters.length);
            logger.severe(exc.toString());
            day=sc.nextInt(); day--;
            logger.info("requested day"+day);
            System.out.println(recruiters[day]);
        }
        //KYC kyc=KYC.getKyc();
        //kyc.name="Deepthi";
        //kyc.contact=1234567890;

    }
}
//Singleton 
class KYC{
    String name; long contact;
    private static KYC kyc=new KYC();
    public static KYC getKyc(){
        return kyc;
    }
    private KYC(){}
}