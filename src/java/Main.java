public class Main {
    public static void main(String[] args) {
//        int count = 0;
//        for (int i = 0; i < 10; i++) {
//            System.out.println(count + " " + "Hello, Andrii");
//            count++;
//        }

//        for (int i = 1; i < 11; i++) {
//            System.out.println(i);
//        }

//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

//        for (int i = 2; i <= 20; i += 2) {
//            System.out.println(i);
//        }

//        int number = 5;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " x " + i + " = " + (number * i));
//        }

//        int n = 10;
//        int factorial = 1;
//        for (int i = 1; i <= n; i++) {
//            factorial *= i;
//        }
//        System.out.println(factorial);

//        int n = 20;
//        int a = 0, b = 1;
//        for (int i = 0; i < n; i++) {
//            System.out.println(a + " ");
//            int next = a + b;
//            a = b;
//            b = next;
//        }

        int sum = 0;
        for (int num = 2; num  <= 50; num++) {
            boolean isPrime = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += num;
            }
        }
        System.out.println(sum);

    }
}
