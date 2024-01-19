package java101.banking;

import java.text.NumberFormat;

/**
 * Represents a bank account with basic services such as deposit and withdraw.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2024
 */
public class Account {

    /* Interest rate of 3.5 percent. */
    private static final double RATE = 0.035;

    /* Account number is unique for each account. */
    private final long acctNumber;
    private double balance;
    private final String identifier;

    /**
     * Constructs an account object by defining its owner, account number, and
     * initial balance.
     *
     * @param owner identifier of account owner
     * @param account a long for the account number
     * @param initial a double representing the initial balance
     */
    public Account(final String owner, final long account, final double initial) {
        identifier = owner;
        acctNumber = account;
        balance = initial;
    }

    /**
     * Deposits the specified amount into the account. Returns the new balance.
     *
     * @param amount a double for the amount to deposit
     * @return the new balance after the deposit
     */
    public double deposit(final double amount) {
        balance = balance + amount;
        return balance;
    }

    /**
     * Withdraws the specified amount from the account and applies the fee.
     * Returns the new balance.
     *
     * @param amount a double to withdraw
     * @param fee    a double for a withdrawal fee
     * @return balance after the withdrawal
     */
    public double withdraw(final double amount, final double fee) {
        balance = balance - amount - fee;
        return balance;
    }

    /**
     * Adds interest to the account and returns the new balance.
     *
     * @return balance after interest has been added
     */
    public double addInterest() {
        balance += (balance * RATE);
        return balance;
    }

    /**
     * Returns the current balance of the account.
     *
     * @return balance as a double
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns a one-line description of the account as a String.
     *
     * @return toString description containing account number, identifier,
     * balance separated with tabs.
     */
    public String toString() {
        final NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (acctNumber + "\t" + identifier + "\t" + fmt.format(getBalance()));
    }
}
