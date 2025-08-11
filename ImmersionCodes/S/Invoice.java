package S;

public class Invoice {
    Pen p;
    public Invoice(Pen p){
        this.p = p;
    }
    public int createInvoice() {
        return (int)((p.price*1.18)+2);

    }
//     public void printInvoice () {
//         System.out.println("Invoice Print");
//     }
//     public void sendMail() {
//         System.out.println("Mail sent");
//     }
}
