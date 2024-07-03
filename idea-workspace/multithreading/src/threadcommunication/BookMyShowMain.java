package threadcommunication;

class BookMyShow {
    private double walletBalance;
    private double ticketPrice;

    public BookMyShow(double walletBalance, double ticketPrice) {
        this.walletBalance = walletBalance;
        this.ticketPrice = ticketPrice;
    }

    public synchronized void bookTicket(String name, int numberOfSeats) {
        System.out.println(name + " is inquiring for ticket");
        if (numberOfSeats * ticketPrice > walletBalance) {
            System.out.println("Please add money to wallet");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (numberOfSeats * ticketPrice > walletBalance) {
                System.out.println("Insufficient balance.. Try Again Later");
                return;
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " has booked " + numberOfSeats + " tickets");
    }

    public synchronized void addMoneyToWallet(double amount) {
        System.out.println("Adding money to wallet");
        walletBalance += amount;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Money added to wallet");
        notify();
    }
}


public class BookMyShowMain {

    public static void main(String[] args) {

        BookMyShow bookMyShow = new BookMyShow(500, 300);

        Thread bookTicketThread = new Thread(
                () -> bookMyShow.bookTicket("Ramanuj", 2));
        Thread addMoneyToWalletThread = new Thread(
                () -> bookMyShow.addMoneyToWallet(1000));



        bookTicketThread.start();
        addMoneyToWalletThread.start();

    }
}
