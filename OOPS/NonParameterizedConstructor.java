public class NonParameterizedConstructor {
    public static void main(String[] args){
        Student s1 = new Student();
    }
}

class Student{
    Student(){
        System.out.println("This is non parameterized constructor");
    }
}
    