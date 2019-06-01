package pl.edu.ur.oopl5.number;

/**
 */
public class Number implements NumberInterfaces {

    private int n;

    public void setNumber(String number) {
        n = Integer.parseInt(number);
    }

    public int factorial() {
        int s = 1;
        if (n == 0) {
            return 1;
        }
        for (int i = 1; i <= n; i++) {
            s *= i;
        }
        return s;
    }

    public int multiply(int i) {
        return n * i;
    }

}
