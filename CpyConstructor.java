class Students{
    String name;
    int roll;
    String password;
    int marks[];

    Students(){
        marks = new int[3];
        System.out.println("Students constructor is called ");
    }
    Students( s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
//        this.marks = s1.marks;
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
public class CpyConstructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "Shiv";
        s1.roll = 12;
        s1.password = "abcd0";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Students s2 = new Students(s1);
        s2.password = "abcd0";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
