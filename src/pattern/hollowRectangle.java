package pattern;

// * * * * *
// *       *
// *       *
// * * * * *
/*
* 00 01 02 03 04
* 10 11 12 13 14
* 20 21 22 23 24
* 30 21 32 33 34
*
*/

public class hollowRectangle {
    public static void main(String[] args) {
        int n=4;
        int m =5;
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(i==0 || i==n-1||j==0 || j==m-1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
