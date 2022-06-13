public class Matrix{

    public static void main(String args[]) {

            int n=4;
            int k;
            int[][] arr = new int[2*n-1][2*n-1];
            int counterY = n-1;
            int counterX;
            for(int i=0; i< n ; i++) {
                k = n;
                counterX = n-1;
                for(int j=0;j<n;j++) {
                    
                    arr[i][j] = k;
                    if(k+i > n)
                        k--;
                }
                for(int j=n-2; j>=0; j--) {

                    //System.out.println(counterX);
                    arr[i][++counterX] = arr[i][j];
                }
            }
            for(int i=n-2; i>=0;i--) {
                counterY++;
                for(int j=0;j< 2*n-1; j++)
                    arr[counterY][j] = arr[i][j];            
            }

            for(int i=0;i<2*n-1;i++) {
                for(int j=0;j<2*n-1;j++)
                    System.out.print(arr[i][j]);

                System.out.println();
            }
        }
}