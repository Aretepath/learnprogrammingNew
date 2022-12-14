public class Main {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("Loop " + i + " Hello!");
        }

        for(int i=2; i<9; i++){
            System.out.println("228,000 at " + i + "% interest = £" + String.format("%.2f",calculateInterest(228000.0,i)));
        }

        for(int i=8; i>1; i--){
            System.out.println("228,000 at " + i + "% interest = £" + String.format("%.2f",calculateInterest(10000.0,i)));
        }

        for(int i =2; i<100; i++){

                System.out.println(i + " is found to be " + isPrime(i) + " in relation to being a prime number!");
        }

        int count = 0;
        for(int i=10; i<50; i++){
            if(isPrime(i)){
                count++;
                System.out.println("Number " + i + " is prime number");
                if(count == 10){
                    System.out.println("Existing for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i=2; i <= n/2; i++){
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate){
        return(amount * (interestRate/100));
    }
}