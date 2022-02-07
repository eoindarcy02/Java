public class Validation {
    private String title , publisher , author;
    private int price;

    public Validation(String title, String publisher ,String author , int price)
    {
        this.title = (String)validate(title);
        this.publisher = (String)validate(publisher);
        this.author = (String)validate(author);
        this.price = (Integer)validate(price);
    }
    public Object validate(Object o)
    {
        if(o.getClass() == Integer.class) {
            if ((int) o < 0)
                throw new IllegalArgumentException("Must be Greater than Zero");
        }
        if (o.getClass() == String.class)
        {
            String s = (String)o;
            if(s.length() == 0)
                throw new IllegalArgumentException("String cannot be null");
        }
        return o;
    }
    public static void main(String[] args) {
        Validation v = new Validation("book", "book people","joe bloggs", 1);
        System.out.println(v);
    }
}