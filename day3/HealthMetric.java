class Patient{
   public Patient(){}
   public Patient(String name, int age, String gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }
   private String name;
   private int age;
   private String gender;
   private double weight, height, bmi;
   public void setName(String name) {
    this.name = name;
}
   public void setAge(int age) {
    this.age = age;
   }
   public void setGender(String gender) {
    this.gender = gender;
   }
   public String getName() {
    return name;
}
   public int getAge() {
    return age;
   }
   public String getGender() {
    return gender;
   }
   public double getWeight() {
    return weight;
   }
   public double getHeight() {
    return height;
   }
   public double getBmi() {
    return bmi;
   }
   public void setWeight(double weight) {
    this.weight = weight;
   }
   public void setHeight(double height) {
    this.height = height;
   }
   public void setBmi(double bmi) {
    this.bmi = bmi;
   }
   @Override
   public String toString(){
    return "Patient [name=" + name+ " , age=" + age+ " , gender="+ gender + " , bmi=" + bmi + "]";
   }
}
public class HealthMetric {
    public static void calculate(int age, double bmi){
        System.out.println("Body age");
        if(bmi<18.5) System.out.println(age+2);
        else if(bmi>25) System.out.println(age+5);
        else System.out.println(age);
    }

    public static void calculate(double bmi,int age, String gender){
        System.out.println("Fat rate:");
        if(gender.equals("male")) System.out.println((1.20*bmi)+(0.23*age)-16.2);
        else System.out.println((1.20*bmi)+(0.23*age)-5.4);
    }

    public static void calculate(Patient object){
        System.out.println(object.getName()+" BMI");
        object.setHeight(object.getHeight()/100);
        object.setBmi(object.getWeight()/(object.getHeight()*object.getHeight()));
        System.out.println(object.getBmi());
        calculate(object.getAge(),object.getBmi());
        calculate(object.getBmi(),object.getAge(),object.getGender());
    }

    public static void main(String[] args) {
        Patient p1= new Patient();
        p1.setName("Deepthi");
        p1.setAge(20);
        p1.setWeight(45);
        p1.setHeight(152);
        p1.setGender("female");
        calculate(p1);
        System.out.println(p1);
        Patient p2= new Patient("Anup", 22, "male", 65, 170);
        calculate(p2);
        System.out.println(p2.getBmi());

    }

}
