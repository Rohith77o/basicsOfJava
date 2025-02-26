class Fibonacci {
    void printFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
        System.out.println(); 
    }
    int getNthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return getNthFibonacci(n - 1) + getNthFibonacci(n - 2); 
    }

    void printFibonacciFromTerm(int n, int startTerm) {
        int first = 0, second = 1;
        for (int i = 0; i < startTerm; i++) {
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
        System.out.print("Fibonacci series starting from term " + startTerm + ": ");
        for (int i = startTerm; i < n; i++) {
            System.out.print(first + " ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();

        int num1 = 10;
        int num2 = 5;

        obj.printFibonacci(num1);

        System.out.println("The 7th Fibonacci number is: " + obj.getNthFibonacci(7));

        obj.printFibonacciFromTerm(num1, num2);
    }
}
