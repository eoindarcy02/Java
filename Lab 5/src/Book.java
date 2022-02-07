public class Book implements Comparable<Book> {

    private String title, publisher , author;
    private int price;

    public static int sortingMethod = 1;

    public Book(String title, String publisher, String author, int price)
    {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
    }

    public String toString()
    {
        return "The Title of the Book is " + this.title + ". The Publisher of the Book is " + this.publisher + ". The Author of the Book is " + this.author + ". This Cost of the Book is " + this.price;
    }
    public void setSortingMethod(int i)
    {
        sortingMethod = i;
    }
    @Override
    public int compareTo(Book o) {

        if (sortingMethod == 1)
        {
            if (this.title.compareTo(o.title) < 0)
            {
                return 1;
            }
        }
        else if (sortingMethod == 2)
        {
            if (this.publisher.compareTo(o.publisher) < 0)
            {
                return 1;
            }
            else if (sortingMethod == 3)
            {
                if (this.author.compareTo(o.author) < 0)
                {
                    return 1;
                }
            }
            else
            {
                if (this.price < o.price)
                {
                    return 1;
                }
            }
        }
        return price;
    }
    public static void swap(Book [] a, int i, int j)
    {
        Book temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void sortBook(Book[] input)
    {
        for(int i = 0; i < input.length - 1; i++)
        {
            int leastIndex = i;
            for(int j = i+1; j < input.length; j++)
            {
                if(input[j].compareTo(input[leastIndex]) == 1)
                {
                    leastIndex = j;
                }
            }
            if (leastIndex != i) {
                swap(input, i, leastIndex);
            }
        }
        for(Book i : input)
        {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {

        Book p = new Book("1", "P1", "A1", 10);
        Book q = new Book("2", "P2", "A2", 20);
        Book r = new Book("3", "P3", "A3", 30);

        Book [] pa = {p,q,r};

        p.setSortingMethod(1);

        sortBook(pa);
    }
}