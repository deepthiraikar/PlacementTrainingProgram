import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Feedback implements Serializable {

    private String trainerName;
    private String batchId;
    private String studentUsn;
    private double rating;
    private String comments;
    
    public Feedback(String trainerName, String batchId,
                    String studentUsn, double rating,
                    String comments) {

        this.trainerName = trainerName;
        this.batchId = batchId;
        this.studentUsn = studentUsn;
        this.rating = rating;
        this.comments = comments;
    }
    public String getStudentUsn() {
        return studentUsn;
    }

    @Override
    public String toString() {
        return "Trainer: " + trainerName +
               ", Batch: " + batchId +
               ", USN: " + studentUsn +
               ", Rating: " + rating +
               ", Comments: " + comments;
    }
}

public class FeedBackDemo {
    public static void main(String[] args) {
        String fileName = "feedback.dat";
        try {

            List<Feedback> feedbacks = new ArrayList<>();
            feedbacks.add(new Feedback(
                    "Ramesh", "B101",
                    "NNM23IS030", 4.5,
                    "Good training"));
            feedbacks.add(new Feedback(
                    "Kavya", "B101",
                    "NNM23IS040", 4.8,
                    "Excellent session"));
            feedbacks.add(new Feedback(
                    "Ramesh", "B102",
                    "NNM23IS042", 4.2,
                    "Very helpful"));
            ObjectOutputStream oos =
                    new ObjectOutputStream(
                            new FileOutputStream(fileName));
            oos.writeObject(feedbacks);
            oos.close();
            System.out.println("Feedbacks stored successfully");
            String searchUsn = "NNM23IS042";
            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream(fileName));
            List<Feedback> list =
                    (List<Feedback>) ois.readObject();
            ois.close();
            System.out.println("\nFeedback for USN: " + searchUsn);
            boolean found = false;
            for (Feedback f : list) {
                if (f.getStudentUsn().equals(searchUsn)) {
                    System.out.println(f);
                    found = true;
                }
            }
            if (!found) {
                System.out.println("No feedback found");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}