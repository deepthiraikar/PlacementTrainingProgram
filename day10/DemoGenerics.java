import java.util.Arrays;

class WareHouse<T>{
    private T[] data;
    public void setData(T[] data){this.data=data;}
    public T[] getData(){return data;}
}
public class DemoGenerics {
    public static void main(String[] args) {
        WareHouse<Integer> house1=new WareHouse<Integer>();
        house1.setData(new Integer[]{1,2,3,4,5});
        WareHouse<String> house2=new WareHouse<String>();
        house2.setData(new String[]{"Cognizant","Wipro","Infosys"});
        System.out.println(Arrays.toString(house1.getData()));
        System.out.println(Arrays.toString(house2.getData()));
        
    }
}
