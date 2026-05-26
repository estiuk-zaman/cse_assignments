
public class Array2D {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        Array2D.printArray(a); //This will print the array
         Array2D.printArrayRowWise(a); //This will print the elements of array row-wise
         Array2D.printArrayColWise(a); // This will print the elements of array col-wise
         Array2D.sumRowWise(a); // This will print the sum of every row of the array
         Array2D.sumColWise(a); // This will print the sum of every col of the array

         int[][] b = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
         int[][] swappedRowArray = Array2D.swapRows(b); //This will swap the rows of the array
         Array2D.printArray(swappedRowArray); //This will print the row-swapped array

         int[][] c = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
         int[][] swappedColArray = Array2D.swapCols(c); // This will swap the cols of the array
         Array2D.printArray(swappedColArray); // This will print the col-swapped array

         int[][] d = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
         System.out.println("Sum of elements of primary diagonal is: " + Array2D.addPrimaryDiagonal(d));
         System.out.println("*".repeat(10)); //This will print the sum of primary diagonal elements
        System.out.println("Sum of elements of secondary diagonal is: " + Array2D.addSecondaryDiagonal(d));
        System.out.println("*".repeat(10)); //This will print the sum of secondary diagonal elements//

        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrix2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        System.out.println("Matrix Addition Result:");
        int[][] addResult = Array2D.addMatrices(matrix1, matrix2);
        Array2D.printArray(addResult);

         int[][] m1 = {{1, 2}, {3, 4}};
         int[][] m2 = {{5, 6}, {7, 8}};

         System.out.println("Matrix Multiplication Result:");
         int[][] mulResult = Array2D.multiplyMatrices(m1, m2);
        Array2D.printArray(mulResult);
    }

    public static void printArray(int[][] arr){
        int row = arr.length;
        int col = arr[0].length;
        for(int i =0;i<row;i++){
            for(int j =0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("*".repeat(10));
    }

    public static void printArrayRowWise(int [][] arr){
        int row = arr.length;
        int col = arr[0].length;
        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("*".repeat(10));
    }

    public static void printArrayColWise(int [][] arr){
        int row = arr.length;
        int col = arr[0].length;
        for(int i =0;i<col;i++){
            for(int j=0;j<row;j++){
                System.out.println(arr[j][i]);
            }
        }
        System.out.println("*".repeat(10));
    }

    public static void sumRowWise(int [][] arr){
        int row = arr.length;
        int col = arr[0].length;

        for(int i =0;i<row;i++){
            int sum =0;
            for(int j=0;j<col;j++){
                sum+=arr[i][j];
            }
            System.out.printf("Sum of row %d : %d%n",(i+1),sum);
            //System.out.println("Sum of row "+(i+1)+" : "+sum);
        }
        System.out.println("*".repeat(10));
    }

    public static void sumColWise(int [][] arr){
        int row = arr.length;
        int col = arr[0].length;
        for(int j =0;j<col;j++){
            int sum=0;
            for(int i=0;i<row;i++){
                sum+=arr[i][j];
            }
            System.out.printf("Sum of col %d : %d%n",(j+1),sum);
        }
        System.out.println("*".repeat(10));
    }

    public static int [][] swapRows (int [][] arr){
        int row = arr.length;
        int col = arr[0].length;
        
        for(int i=0;i<(int)row/2;i++){
            for(int j=0;j<col;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[row-1-i][j];
                arr[row-1-i][j]=temp;
            }
        }
        return arr;
    }

    public static int [][] swapCols(int [][] arr ){
        int rows=arr.length;
        int cols =arr[0].length;

        for(int j=0;j<(int)cols/2;j++){
            for(int i =0;i<rows;i++){
            int temp=arr[i][j];
                arr[i][j]=arr[i][cols-1-j];
                arr[i][cols-1-j]=temp;
            }
        }
        return arr;
    }

    public static int addPrimaryDiagonal(int [][] arr){
        int rows = arr.length;
        int sum=0;
        for(int i =0;i<rows;i++){
            sum+=arr[i][i];
        }
        return sum;
    }

    public static int addSecondaryDiagonal(int [][] arr){
        int row_start = 0;
        int col_start= arr[0].length-1;
        int sum=0;
        for(int i =0;i<arr.length;i++){
            sum+=arr[row_start][col_start];
            row_start++;
            col_start--;
        }
        return sum;
    }

    public static int [][] addMatrices(int [][] arr1,int [][] arr2){
        int row= arr1.length;
        int col = arr1[0].length;
        int [][] newArr = new int[row][col];

        for(int i =0;i<row;i++){
            for(int j=0;j<col;j++){
                newArr[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return newArr;
    }

    public static int [][] multiplyMatrices(int [][] arr1,int [][] arr2){
        int row1 = arr1.length;
        int col1 = arr1[0].length;
        int row2 = arr2.length;
        int col2 = arr2[0].length;
        
        if (col1==row2) {
            int [][] result = new int[row1][col2];

            for(int i =0;i<row1;i++){
                for(int j =0;j<col2;j++){
                    for(int k=0;k<col1;k++){
                        result[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
            return result;
        }
        else{
            System.out.println("Not Possible");
            return null;
        }
    }
}
