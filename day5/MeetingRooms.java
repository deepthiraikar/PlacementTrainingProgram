import java.util.Arrays;

public class MeetingRooms {
    
 public static boolean canAttendMeetings(int[][] intervals){
        if(intervals.length==0) return false;
        Arrays.sort(intervals,(row1,row2)->row1[1]-row2[1]);
        int pEnd=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
            if(intervals[i][0]<pEnd) return false;
            else pEnd=intervals[i][1];
        return true;
    }

    public static void main(String[] args) {
        int[][] intervals={{1,2},{2,3},{3,5}};
        System.out.println(canAttendMeetings(intervals));
    }
}