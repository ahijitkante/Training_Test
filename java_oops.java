import java.util.*;

public class PalindromeFilter {
    public static List<String> filterPalindromes(List<String> words) {
        List<String> result = new ArrayList<>();
        if (words == null) return result;
        for (String w : words) {
            if (w == null) continue;
            String lower = w.toLowerCase();
            String rev = new StringBuilder(lower).reverse().toString();
            if (lower.equals(rev)) {
                result.add(w);
            }
        }
        return result;
    }
}


public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return Math.round((a + b + c) * 100.0) / 100.0;
    }
}


public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount() {
        this("UNASSIGNED", 0.0);
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance < 0 ? 0.0 : balance;
    }

    public String getAccountNumber() { return this.accountNumber; }
    public double getBalance() { return this.balance; }
}


public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        if (other != null) {
            this.x = other.x;
            this.y = other.y;
        } else {
            this.x = 0;
            this.y = 0;
        }
    }

    public int getX() { return this.x; }
    public int getY() { return this.y; }
}


