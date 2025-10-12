package tests;

public class ActionsimpleObjects {

    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        double d = 7.0;
        int max = Integer.MAX_VALUE;

        plus(a, b);
        minus(a, b);
        delete(a,b);
        multiplication(a,b);
        multDouble (a,d);
        deleteSecondDouble (a,d);
        plusDouble (a,d);
        minusDouble (a,d);
        comparation1 (a,b);
        comparation2 (a,b);
        comparation3 (a,b);
        comparation4 (a,b);
        overflow (max,a);



    }
    public static void plus(int a, int b) {
        int resultPlus = a + b;
        System.out.println(resultPlus);
    }

    public static void minus(int a, int b) {
        int resultMinus = a - b;
        System.out.println(resultMinus);
    }

        public  static void delete(int a, int b) {
            int resultDelete = a/b;
            System.out.println(resultDelete);
        }

        public  static void multiplication(int a, int b) {
            int resultMult = a*b;
            System.out.println(resultMult);
        }

        public static void multDouble(int a, double d) {
            double resultmultDouble = a/d;
            System.out.println(resultmultDouble);
        }

        public static void  deleteSecondDouble(int a, double d) {
            double deleteSecondDouble = a/d;
            System.out.println(deleteSecondDouble);
        }

        public static void plusDouble(int a, double d) {
            double plusDouble = a+d;
            System.out.println(plusDouble);
        }

    public static void minusDouble(int a, double d) {
        double minDouble = a-d;
        System.out.println(minDouble);
        }

    public static void comparation1 (int a, int b) {
        boolean compare1 = a>b;
        System.out.println(compare1);
        }

    public static void comparation2 (int a, int b) {
        boolean compare2 = a<b;
        System.out.println(compare2);
    }

    public static void comparation3 (int a, int b) {
        boolean compare3 = a>=b;
        System.out.println(compare3);
    }

    public static void comparation4 (int a, int b) {
        boolean compare4 = a<=b;
        System.out.println(compare4);
    }

        public static void overflow(int max, int i) {
            int overflow = max * 2;
            System.out.println(overflow);

        }


    }
