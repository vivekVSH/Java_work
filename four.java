public class four {
    public static void main(String[] args) {

        /*
          frist
         * 
         * *
         * * *
         * * * *
         * * * * *
          end patten
         */

        int row = 5;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /*
          second patten
         * * * * *
         * * * * *
         * * * * *
         * * * * *
          end patten
         */

        int num = 4;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /*
          Third patten
         *****
         *   *
         *   *
         *****
          patten end
         */

        int num1 = 4;
        int num2 = 5;
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= num2; j++) {
                if (i == 1 || j == 1 || i == num1 || j == num2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        /*
          four patten
         * * * * *
         * * * *
         * * *
         * *
         *
          end patten
         */

        int num3 = 5;
        for (int i = num3; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        /*
          five patten
         *
         * *
         * * *
         * * * *
         * * * * *
          end patten
         */

        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

    }
}
