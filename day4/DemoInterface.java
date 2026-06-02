import java.util.Arrays;

interface FeedBackRemote{
    String[][] feedbacks=new String[2][3];
    void createFeedBack(int id, String comment);
    void readFeedBack(int id);
    void deleteFeedBack(int id);
}

class FeedBackService implements FeedBackRemote{

    @Override
    public void createFeedBack(int id, String comment) {
        if(id>=0 && id<feedbacks.length){
            for(int i=0;i<3;i++){
                if(feedbacks[id][i]==null || feedbacks[id][i]==""){
                    feedbacks[id][i]=comment;
                    System.out.println(comment+ "noted");
                    return;
                }
            }
            System.out.println("FeedBack buffer is full");
        }
        else System.out.println("Invalid Batch");

    }

    @Override
    public void readFeedBack(int id) {
        if(id>=0&&id<feedbacks.length)
            System.out.println(Arrays.toString(feedbacks[id]));
        else System.out.println("Invalid batch");
    }

    @Override
    public void deleteFeedBack(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteFeedBack'");
    }
    
}

public class DemoInterface {
    public static void main(String[] args) {
        FeedBackService service=new FeedBackService();
        service.createFeedBack(1, "Good");
        service.createFeedBack(2, "Good");
        service.createFeedBack(0, "Bad");
        service.createFeedBack(1, "Average");
         service.createFeedBack(0, "Average");
        service.createFeedBack(1, "Excellent");
        service.createFeedBack(1, "Bad");
        service.readFeedBack(0);
        service.readFeedBack(1);
    }
}
