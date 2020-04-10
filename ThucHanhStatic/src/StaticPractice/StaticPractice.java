package StaticPractice;
class Student{
    private int amingo;
    private String name;
    private static String college ="Grand Bandit";
    Student(int n , String r){
        amingo = n;
        name = r;
    }
    static void changeCollege(String c){
        college = c ;
    }
    void  display(){
        System.out.println(amingo + " " + name + " " + college);
    }
}

public class StaticPractice {
    public static void main(String[] args) {
        Student.changeCollege("Kindergarten");
        Student a = new Student(113,"G.Washington");
        Student b = new Student(118,"G.Bush");
        Student c = new Student(117,"B.Clinton");
        a.display();
        b.display();
        c.display();
    }
}
