package OCA.Chapter4;

public class Order {
    static String result = "";
    {result += "c";}
    static
    {result += "u";}
    {result += "r";}
}

class OrderDriver {
    public static void main (String[] args) {
        System.out.println(Order.result + " ");
        System.out.println(Order.result + " ");
        new Order();
        new Order();
        System.out.println(Order.result + " ");
    }
}

//u u ucrcr