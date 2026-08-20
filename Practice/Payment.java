public abstract class Payment {
    String name = "Kutty";
    double amount = 50000;
    abstract void makePayment();
    public static void main(String[] args) {
        Payment upiPayment = new upi("Kutty", 50000);
        Payment cardPayment = new card("Panni", 150000);
        Payment netbankingPayment = new netbanking("Choco", 500000);
        upiPayment.makePayment();
        cardPayment.makePayment();
        netbankingPayment.makePayment();
    }
}
class upi extends Payment {
    upi(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }
    @Override
    void makePayment() {
        System.out.println("payment of " + amount + " is successful using UPI");
    }
}
class card extends Payment {
    card(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    void makePayment() {
        System.out.println("payment of " + amount + " is successful using Card");
    }
}
class netbanking extends Payment {
    netbanking(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    void makePayment() {
        System.out.println("Netbanking payment of " + amount + " is successful using Netbanking");
    }
}