package edu.neu.coe.info6205.FinalExam;

public class Pell {
    public Pell() {

    }

    public long get(int n) {
        if (n < 0) throw new UnsupportedOperationException("Pell.get is not supported for negative n");
        else if (n<=2)
            return n;
        long first = 1;
        long second= 2;
        long res = 0;
        for (int i = 3; i<=n;i++){
            res = (2 * second)+first;
            first=second;
            second=res;
        }
        return res;
    }
}
