import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product{
    String itemName;
    int itemPrice;
    public Product(String itemName, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }
    @Override
    public String toString(){
        return itemName+"="+itemPrice+"\n";
    }
    public String getItemName() {
        return itemName;
    }
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public int getItemPrice() {
        return itemPrice;
    }
    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}

public class DemoLamda {
    public static void pojoLamda(){
        Product p1=new Product("HP Pavillion", 45000);
        Product p3=new Product("Apple MacBook", 90000);
        Product p2=new Product("Asus Vivobook", 60000);
        List<Product> item=new ArrayList<>();
        item.add(p1); item.add(p2); item.add(p3);
        Collections.sort(item, (o1,o2)->o1.itemPrice-o2.itemPrice);
        System.out.println(item);
    }
    public static void main(String[] args) {
        List<Integer> alpha=new ArrayList<>();
        alpha.add(34); alpha.add(78); alpha.add(45); alpha.add(12);
        System.out.println(alpha);
        Collections.sort(alpha,(i1,i2)->i2-i1);
        System.out.println(alpha);
        pojoLamda();
    }
}
