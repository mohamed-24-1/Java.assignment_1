package Assignment;


public class BMI {

    // Attributes
    private String name;
    private int age;
    private double weight;
    private double height;

    // Constructor with name, age, weight and height
    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    // Constructor with name, weight and height
    // Default age = 20
    public BMI(String name, double weight, double height) {
        this.name = name;
        this.age = 20;
        this.weight = weight;
        this.height = height;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for weight
    public double getWeight() {
        return weight;
    }

    // Getter for height
    public double getHeight() {
        return height;
    }

    // Calculate BMI
    public double getBMI() {
        return weight * 703 / (height * height);
    }

    // Get BMI status
    public String getStatus() {
        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25.0) {
            return "Normal";
        } else if (bmi < 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
class TestBMI {

    public static void main(String[] args) {

        // Test constructor with name, age, weight and height
        BMI bmi1 = new BMI("Ahmed", 25, 150, 70);

        // Test getName()
        System.out.println("Name is: " + bmi1.getName());

        // Test getAge()
        System.out.println("Age is: " + bmi1.getAge());

        // Test getWeight()
        System.out.println("Weight is: " + bmi1.getWeight());

        // Test getHeight()
        System.out.println("Height is: " + bmi1.getHeight());

        // Test getBMI()
        System.out.println("BMI is: " + bmi1.getBMI());

        // Test getStatus()
        System.out.println("Status is: " + bmi1.getStatus());


        // Test constructor with name, weight and height
        // Default age should be 20
        BMI bmi2 = new BMI("Hassan", 180, 72);

        System.out.println("\nBMI 2:");

        // Test getName()
        System.out.println("Name is: " + bmi2.getName());

        // Test default age
        System.out.println("Age is: " + bmi2.getAge());

        // Test getWeight()
        System.out.println("Weight is: " + bmi2.getWeight());

        // Test getHeight()
        System.out.println("Height is: " + bmi2.getHeight());

        // Test getBMI()
        System.out.println("BMI is: " + bmi2.getBMI());

        // Test getStatus()
        System.out.println("Status is: " + bmi2.getStatus());
    }
}
