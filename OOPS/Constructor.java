public class Constructor {
    public static void main(String[] args) {

        Student s1 = new Student("Vaishnavi");
        System.out.println(s1.Name);
        
    }
}

class Student{
    String Name;
    Student( String Name){
        this.Name = Name;
    }
}
