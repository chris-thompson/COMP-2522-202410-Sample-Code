package java101.banking;

/**
 * Demonstrates the creation and use of multiple Account objects.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2024
 */
public final class Transactions {

    /**
     * Fee for a single withdrawal.
     */
    public static final double WITHDRAWAL_FEE = 1.50;

    private Transactions() {
    }

    /**
     * Creates some bank accounts and requests various services.
     *
     * @param args command line arguments (unused)
     */
    public static void main(final String[] args) {
        final Account acct1 = new Account("Grace Hopper", 72354, 102.56);
        final Account acct2 = new Account("Edsgar Dijkstra", 69713, 40.00);
        final Account acct3 = new Account("James Gosling", 93757, 759.32);

        final double hopperDeposit = 25.85;
        acct1.deposit(hopperDeposit);

        final double dijkstraBalance = acct2.deposit(500.00);
        System.out.println("Dijkstra balance after deposit: "
                + dijkstraBalance);

        final double dijkstraWithdrawal = 430.75;
        System.out.println("Dijkstra balance after withdrawal: "
                + acct2.withdraw(dijkstraWithdrawal, WITHDRAWAL_FEE));

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}
