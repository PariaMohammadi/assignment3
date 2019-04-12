public static void matrix(int[][] matrix) { 
  
         int row, col; 
         int rowCount = matrix.length;  
         int columnCount = matrix[0].length; 
  
         for (int p= 0; p < rowCount; p++) { 
             for (row = p, col = 0; row >= 0 && col < columnCount; row--, col++) { 
                 System.out.print(matrix[row][col] + " " ); 
             } 
             System.out.println(); 
         } 
  
         for (int p = 1; p < columnCount; p++) { 
             for (row = rowCount - 1, col = p; row >= 0 && col < columnCount; row--, col++) { 
                 System.out.print(matrix[row][col] + " " ); 
             } 
             System.out.println(); 
         } 
     } 
 
 
    public static void main(String[] args) { 
      int row = 0, col = 0; 
         int p = 1; 
                Scanner scan =new Scanner(System.in); 
                Random rand=new Random (); 
                int n=scan.nextInt(); 
         int matrix[][] = new int[n][n]; 
         for (int i = 0; i < n; i++) { 
             for (int j = 0; j < n; j++) { 
                 matrix[i][j] = rand.nextInt(100); 
             } 
 
         } 
           
 
         System.out.println("Input Matrix" ); 
         for (int i = 0; i < matrix.length; i++) { 
             System.out.println(Arrays.toString(matrix[i])); 
         } 
          
         System.out.println("Printing Matrix " ); 
         matrix(matrix);    
    }}
