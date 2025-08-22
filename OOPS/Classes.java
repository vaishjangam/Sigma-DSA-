public class Classes{
    public static void main(String args[]){
      // Object for class pen
        Pen p1 = new Pen(); // we are creating object for Pen class and Pen() is a constructor
        p1.setColor("yellow"); //OR p1.color = "yellow"; 
        System.out.println(p1.Color);

        p1.setTip(5);
        System.out.println(p1.tip);

        p1.setMRP(50);
        System.out.println(p1.MRP);

        p1.Color ="Blue";
        System.out.println(p1.Color);

        //object for class Student

        Student p2 = new Student();
        p2.setName("Vaishavi");
        System.out.println(p2.name);

        p2.setDiv("B");
        System.out.println(p2.div);

        p2.setRoll_no(14204);
        System.out.println(p2.roll_no);

        


    }
}

class Pen{
    String Color;
     int tip;
     int MRP;

     void setColor(String newColor){
        Color = newColor;
     }

     void setTip(int newTip){
        tip = newTip;
     }

     void setMRP(int newMRP){
        MRP = newMRP;
     }

}

class Student{
   String name, div;
   int roll_no;

   void setName(String newname){
      name = newname;
   }

   void setDiv(String newdiv){
      div = newdiv;
   }

   void setRoll_no(int newroll_no){
      roll_no =newroll_no;
   }
}