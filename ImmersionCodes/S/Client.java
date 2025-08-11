package S;

public class Client {
    public static void main(String[] args) {
        Pen p = new Pen();
        Invoice i = new Invoice(p);
        System.out.println(i.createInvoice());
        // i.printInvoice();
        // i.sendMail();

    }
    
}
