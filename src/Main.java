
public class Main {
   public  static  void  main(String[] args){
    Student student1 = new Student(
            "Spomgebob",30,3.2);
       Student student2 = new Student(
               "Sallam",30,3.2);

       System.out.println(student1.name);
       System.out.println(student1.age);
       System.out.println(student1.gba);
       System.out.println(student1.isEnrolled);



       System.out.println(student2.name);
       System.out.println(student2.age);
       System.out.println(student2.gba);
       System.out.println(student2.isEnrolled);

   }
}
