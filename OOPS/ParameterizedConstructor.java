public class ParameterizedConstructor {
    public static void main(String[] args){
        Student s1 = new Student("Vaishnavi", 21);
        
    }
}

class Student{
    String name;
    int roll_no;

    Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
}