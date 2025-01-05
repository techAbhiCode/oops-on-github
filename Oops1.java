class Pen{
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}
class Student{
    String name;
    int age;
    float percentage;
    void calPercentaeg(int phy, int chem, int maths){
        percentage = (phy + chem + maths)/3;
    }
}
public class Oops1 {

    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("red");
        System.out.println(p1.color);
        p1.setTip(2);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.name = "Shivam";
        s1.age = 18;
        s1.calPercentaeg(99,90,100);
        System.out.println("Name is " + s1.name + " age is " + s1.age + " Percentage is : " + s1.percentage);
    }

}
