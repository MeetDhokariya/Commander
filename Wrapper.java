public class Wrapper {

    public static void main(String[] args) {

        Integer a = 100;
        Integer b = 150;
        Integer ans;
        Integer c = 2;

        switch (c) {

            case 1:
                ans = a + b;
                System.out.println("Addition of a+b = " + ans);
                break;

            case 2:
                ans = a - b;
                System.out.println("Substraction of a-b = " + ans);
                break;

            case 3:
                ans = a * b;
                System.out.println("Multiplication of a*b = " + ans);
                break;

            case 4:
                ans = a / b;
                System.out.println("Division of a/b = " + ans);
                break;

            case 5:
                ans = a % b;
                System.out.println("Modulas of a%b = " + ans);
                break;

        }

    }
}