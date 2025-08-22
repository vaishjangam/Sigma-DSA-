class Student {
    String name;
    int roll;

    // Constructor
    Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    // Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.roll = s.roll;
    }

    void display() {
        System.out.println(name + " - " + roll);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Vaishnavi", 1);
        Student s2 = new Student(s1); // copy constructor called
        s1.display();
        s2.display();
    }
}

