import java.util.Arrays;
class Store{
    String[] feedback={};
    public void viewAllFeedbacks(){
        System.out.println(Arrays.toString(feedback));
    }
}
    class JavaBatch extends Store{
        String expertName="";
        public JavaBatch(int size){
            feedback=new String[size];
        }
        public void addFeedback(String comments){
            for(int i=0; i<feedback.length;i++)
                if(feedback[i]==null || feedback[i]== ""){
                    feedback[i]=comments;
                System.out.println("Feedback noted");
                return;
        }
        System.out.println("Buffer is full cant add your feedback");
    }
    }

class SoftSkillBatch extends Store{
    public SoftSkillBatch(){
        feedback=new String[]{"Training is good","Body Language learnt","Need to slow the pace"};
    }

    public void read(int i){
        if(i<0 || i>=feedback.length)
            System.out.println("Invalid feedback");
        else
            System.out.println(feedback[i]);

    }
}

public class DemoInheritance{
    public static void main(String[] args) {
        JavaBatch java= new JavaBatch(2);
        java.expertName="Deepthi";
        java.addFeedback("Expected Foundation not advance");
        java.addFeedback("need more time to write code");
        java.addFeedback("Array quite diff");
        java.viewAllFeedbacks();
        SoftSkillBatch soft=new SoftSkillBatch();
        soft.read(9);
        soft.viewAllFeedbacks();
    }
    }
