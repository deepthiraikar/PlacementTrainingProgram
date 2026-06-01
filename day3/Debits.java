public class Debits {
    double accBal=0;
    static int machBal=5000;
    public void withdraw(int req){
        if(accBal>=req){
            if(machBal>=req){
                accBal-=req;
                Debits.machBal-=req;
                System.out.println("Rs."+req+" withdrawn successfully");
            }
            else{
                System.out.println("Insufficient machine balance");
            }
        }
        else{
            System.out.println("Insufficient account balance");
        }
    }

    public static void main(String[] args) {
        Debits Anup= new Debits();
        Anup.accBal= 10000;
        Debits Deepthi= new Debits();
        Deepthi.accBal= 15000;
        System.out.println("ATM MACHINE BALANCE:" +Debits.machBal);
        System.out.println("User1 Account Balance:"+Anup.accBal);
        Anup.withdraw(5000);
        System.out.println("User2 Account Balance:"+Deepthi.accBal);
        Deepthi.withdraw(6000);
    }
}
