import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
    public static void StreamPojo(){
        List<Product> items=Arrays.asList(new Product("SSD",5600),
            new Product("Pendrive",800),
            new Product("Trolley",2800)
        );
        List<String> names =  items.stream().
        map(Product::getItemName).
        collect(Collectors.toList());
        System.out.println(names);
    }
    public static void main(String[] args) {
            StreamPojo();
        }
    }

