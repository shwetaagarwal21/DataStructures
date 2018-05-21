class FlippingAnImage {
  public int[][] flipAndInvertImage(int[][] A) {
        int k = 0;
        int[][] B = new int[A.length][A[0].length];
        for(int row = 0; row < A.length; row++){
            k = 0;
            for(int col=A[row].length-1; col >= 0; col--){
                B[row][col] = A[row][k];
                k++;
            }
        }
        
        for(int row = 0; row < B.length; row++){
            for(int col=0; col < B[row].length; col++){
                B[row][col] = B[row][col] ^ 1;
                /*if(B[row][col] == 0)
                    B[row][col] = 1;
                else
                    B[row][col] = 0;*/
            }
        }
        return B;
    }
}
