class Testfactorial{
    public static void main(String args[]){
        factorial fact = new factorial();
        int result = fact.findFactorial(5);
        if(result==120){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }
}
