public class EvenAndOdd {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even numbers are: " + even);
        System.out.println("Odd numbers are: " + odd);
    }
}