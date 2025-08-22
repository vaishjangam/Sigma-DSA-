public class DeepCopyConstructor {
    public static void main(String[] args) {
        int[] marks = {90, 80, 85};
        Student s1 = new Student("Vaishnavi", marks );
        Student s2 = new Student(s1);

        s1.display();
        s2.display();

        //modifying s2's marks
        s2.marks[0] = 100;
        System.out.println("After modifying s2's marks");
        s1.display();
        s2.display();
    }
}

class Student{
    String name;
    int[] marks = {90, 80, 85};

    //copy constructor
    Student(String name, int[] marks){
        this.name = name;
        this.marks= marks;
    }

    //deep constructor
    Student(Student s){
        this.name =s.name;
        //Deep copy : Create a new array and copy elements
        this.marks = new int[s.marks.length];
        for(int i = 0; i < s.marks.length; i++){
            this.marks[i] = s.marks[i];
        }

    }

    void display(){
        System.out.println(name + "marks");
        
        for(int i = 0; i< marks.length; i++){
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}


