package hw_tests;

public class SumCalculator {
    public static void main(String[] args) {
        new SumCalculator().sum(3);
    }
    int sum(int n){
        if(n <= 0){
            throw new IllegalArgumentException("'n' cannot be less than or equal to zero");
        }
        int result = 0;
        while(n != 0){
            result += n;
            n--;
        }
        return result;
    }
}
