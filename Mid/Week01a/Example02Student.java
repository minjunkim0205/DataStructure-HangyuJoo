public class Example02Student{
    // Field
    private String name;
    private int age;
    private int number;
    // Construct
    Example02Student(){
        this.name = "Unknown";
        this.age = -1;
        this.number = -1;
    }
    Example02Student(String name, int age, int number){
        this.name = name;
        this.age = age;
        this.number = number;
    }
    // Method
    @Override
    public String toString() {
        return ("Name : "+this.name+", Age : "+this.age+", Number : "+this.number);
        //return super.toString();
    }
}
