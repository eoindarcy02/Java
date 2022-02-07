public class Box {

    private String boxName;
    private int w,h,d;
    private boolean full = false;

    //Creates Constructor Method which contains a String and 3 type int values
    public Box() {
        boxName = "Cardboard";
        w = 1;
        h = 2;
        d = 3;
    }

    public Box(String boxName, int w, int h, int d, boolean full) {
        this.boxName = boxName;
        this.full = full;
        this.w = w;
        this.d = d;
        this.h = h;
    }
    //Getter Method
    public String getName() {
        return boxName;
    }
    //Setter Method
    public void setName(String s) {
        boxName = s;
    }
    //Setter Method
    public int setW() {
        return w;
    }
    //Setter Method
    public int setD() {
        return d;
    }
    //Setter Method
    public int setH() {
        return h;
    }
    //Getter Method
    public int getArea() {
        return w*h*d;
    }
    //Setter Method
    public void setFull(boolean full) {
        this.full = full;
    }
    public String toString()
    {
        return "Box name = " + boxName + " box area is " + this.getArea() +
                " box status " + full;
    }

    public static void main(String[] args) {
        Box b = new Box("plastic", 10,10,10, false);

        System.out.println(b);
    }
}
