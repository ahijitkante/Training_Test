import java.util.*;

public class Solution {
    public static List<String> filterPalindromes(List<String> words) {
        List<String> result = new ArrayList<>();

        if (words == null) {
            return result;
        }

        for (String word : words) {
            if (word != null) {
                String lower = word.toLowerCase();
                String reversed = new StringBuilder(lower).reverse().toString();

                if (lower.equals(reversed)) {
                    result.add(word);
                }
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
        double sum = a + b + c;
        return Math.round(sum * 100.0) / 100.0;
    }
}

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        if (other == null) {
            this.x = 0;
            this.y = 0;
        } else {
            this.x = other.x;
            this.y = other.y;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

