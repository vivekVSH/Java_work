public class five {
    public static void main(String[] args) {

/* start
    *
   ***
  *****
 *******
*********
end
*/


        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
         start
        *********
         *******
          *****
           ***
            *
        end
         */

        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
start
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
end
         */

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--)
                System.out.print(" ");
            for (int k = 1; k <= (2 * i - 1); k++)
                System.out.print("*");
            System.out.println();
        }

        /*start

* * * * * 
*       * 
*       * 
*       * 
* * * * *

        end */

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5 || j == 1 || j == 5)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        /*start
    * 
   * * 
  * * * 
 * * * * 
* * * * *
         end*/

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= (5 - i); j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
