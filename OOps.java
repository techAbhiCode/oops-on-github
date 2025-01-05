class Pens{
    private String color;
    private int tip;
    String getColor() {
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        this.color = newColor;
    }
    void setTip(int newTip){
        this.tip = newTip;

    }
}
public class OOps {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setcolor("Blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
        p1.setcolor("Green");
        System.out.println(p1.getcolor());

        Pens p = new Pens();
        p.setColor("Red");
        p.setTip(5);
        System.out.println(p.getColor() + " " + p.getTip());
    }
}
