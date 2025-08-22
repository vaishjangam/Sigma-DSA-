public class ShallowCopyConstructor {
    public static void main(String[] args) {
        int[] marks = {90, 94, 80};
        Student s1 = new Student("Vaishnavi", marks);
        Student s2 = new Student(s1);  //shallow copy 
        s1.display();
        s2.display();

        //modifying s2's marks
        s2.marks[0] = 100;
        System.out.println("After modifying marks");
        s1.display();
        s2.display();
    }
}

class Student{
    String name;
    int[] marks;
    //Copy constructor
    Student(String name, int[] marks){
        this.name = name;
        this.marks = marks; //assigning reference
    }

    //shallow copy
    Student(Student s){
        this.name = s.name;
        this.marks = s.marks;
    }

    void display(){
        System.out.print(name + "-marks: ");

        for(int i=0; i< marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}
