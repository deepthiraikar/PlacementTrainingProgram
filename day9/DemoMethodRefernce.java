import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class DemoMethodRefernce {
    public static void main(String[] args) {
        List<String> skills=Arrays.asList("Spring","Django","Cypress","Jinja","NUnit","active MQ");
        skills.sort(String::compareTo);
        skills.forEach(System.out::println);
        pojoRefer();
    }


public static void pojoRefer(){
    List<Product> items= Arrays.asList(
        new Product("SSD",5000),
        new Product("Pendrive",800)
);
items.forEach(System.out::println);
items.sort(Comparator.comparing(Product::getItemName));
items.forEach(System.out::println);
}
}