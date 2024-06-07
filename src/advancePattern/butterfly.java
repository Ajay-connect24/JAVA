package advancePattern;

/*
print
 *                    *
 *  *              *  *
 *  *  *        *  *  *
 *  *  *  *  *  *  *  *
 *  *  *  *  *  *  *  *
 *  *  *        *  *  *
 *  *              *  *
 *                    *


 */

public class butterfly {
    public static void main(String[] args) {
        int n=4;


        for(int i=1;i<=n;i++){
            for(int j =1; j<=i ; j++){
                System.out.print(" * ");
            };

            for(int k=1;k<=2*(n-i);k++){
                System.out.print("   ");
            };

            for(int l =1; l<=i ; l++){
                System.out.print(" * ");
            };

            System.out.println("  ");

        }


        for(int a=4;a>=1;a--){
            for(int b =1; b<=a ; b++){
                System.out.print(" * ");
            };

            for(int c=1;c<=2*(n-a);c++){
                System.out.print("   ");
            };

            for(int d =1; d<=a ; d++){
                System.out.print(" * ");
            };

            System.out.println("  ");

        }

    }

}
