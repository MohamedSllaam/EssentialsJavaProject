public class Student {
    String name;
    int age;
    double gba;
    boolean isEnrolled;

    Student( String name,
    int age,
    double gba){

        this.name=name;
        this.age= age;
        this.gba= gba;
    }

    void  study(){
        System.out.println(this.name +" is studying");
    }
}
