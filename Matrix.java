public class Matrix{

    int n=4;
    int[][] arr = new int[2*n-1][2*n-1];
    int counterX = n;
    int counterY = n;
    for(int i=0; i< n ; i++) {
        k = n;
        for(j=0;j<n;j++) {
            if(k+i > n)
                k--;
            a[i][j] = k;
        }
        for(j=n; j>=0; j--) {

            a[i][counterX++] = a[i][j];
        }
    }
    for(i=n-2; i>=0;i--) {
        for(j=0;j< 2*n-1; j++)
            a[counterY++][j] = a[i][j];            
    }

    for(i=0;i<2*n-1;i++)
        for(j=0;j<2*n-1;j++)
            System.out.print(a[i][j]);
}