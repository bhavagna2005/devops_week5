public class factorial{
    public int findFactorial(int n){
        if(n == 0 || n == 1){
            return 1;
        } else {
            return n * findFactorial(n - 1);
        }
    }
    public static void main(String[] args){
        factorial fact = new factorial();
        int number = 5; // Example input
        int result = fact.findFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}