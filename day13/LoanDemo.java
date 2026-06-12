abstract class LoanRemote {
    public abstract void applyLoan(int applicantId, String loanType);
    public abstract void viewLoan(int applicantId);
    public abstract void cancelLoan(int applicantId);
    public void log(String message) {
        System.out.println(message);
    }
}

class LoanService extends LoanRemote {
    private String[][] loans = new String[5][3];
    @Override
    public void applyLoan(int applicantId, String loanType) {
        for (int i = 0; i < loans[applicantId].length; i++) {
            if (loans[applicantId][i] == null) {
                loans[applicantId][i] = loanType;
                log("Loan applied: " + loanType +
                        " for applicant " + applicantId);
                return;
            }
        }
        log("No space available for applicant " + applicantId);
    }

    @Override
    public void viewLoan(int applicantId) {
        System.out.print("Applicant " + applicantId + " loans: [");
        for (int i = 0; i < loans[applicantId].length; i++) {
            System.out.print(loans[applicantId][i]);
            if (i < loans[applicantId].length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
    @Override
    public void cancelLoan(int applicantId) {
        for (int i = 0; i < loans[applicantId].length; i++) {
            loans[applicantId][i] = null;
        }
        log("Loans cancelled for applicant " + applicantId);
    }
}

public class LoanDemo {
    public static void main(String[] args) {
        LoanService service = new LoanService();
        service.applyLoan(0, "Personal Loan");
        service.applyLoan(0, "Business Loan");
        service.applyLoan(1, "Education Loan");
        service.viewLoan(0);
        service.cancelLoan(0);
        service.viewLoan(0);
    }
}