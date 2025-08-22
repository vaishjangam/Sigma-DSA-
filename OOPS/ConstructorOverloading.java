public class ConstructorOverloading {
    public static void main(String[]  args){
        Student s1 = new Student(); // constructor 1

        Student s2 = new Student("Vaishnavi");
        System.out.println(s2.name);

        Student s3 = new Student("Vaishnavi", 9);
        System.out.print(s3.name+ " " +s3.roll_no);
    }
}

class Student{
    String name;
    int roll_no;

    // Constructor 1 : non parameterized
    Student(){
        System.out.println("Default constructor is called!!!!");
    }

    
    // Constructor 2 : parameterized
    Student(String name){
        this.name = name;
        
    }

    // Constructor 3 : multi parameterized
    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
}