import java.util.*;

public class symmetry {
	
	public static void main(String args[])
	{
	int row, col,i,j,val,flag = 1;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number of rows");
	row = s.nextInt();
	System.out.println("Enter the number columns");
	col = s.nextInt();
	if(row != col)
	{
		System.out.println("Order should be same");
	}
	else
	{
	int matrix[][] = new int[row][col];
	int transpos[][] = new int[col] [row];
	System.out.println("Enter the elements of the matrix");
	for ( i= 0 ; i < row ; i++ )
	{  
	for ( j= 0 ; j < col ;j++ )
	{
	val =s.nextInt();
	matrix[i][j] = val;
	transpos[i][j]=val;
	}
	System.out.println();
	}
	System.out.println("Matrix is :-");
	for ( i= 0 ; i < row ; i++ )
	{ 
	for ( j= 0 ; j < col ;j++ )
	System.out.print(matrix[i][j]+"\t");
	System.out.println();
	}
	System.out.println("Transpose of Given Matrix:-");
	for ( i= 0 ; i < row ; i++ )
	{ 
	for ( j= 0 ; j < col ;j++ )
	System.out.print(transpos[j][i]+"\t");
	System.out.println();
	}
	for (i = 0; i < row; i++)
	{
	 for (j = 0; j < col; j++) 
	 {
	   if (matrix[i][j] != transpos[j][i]) 
	   {
	     flag = 0;
	     break;
	   } 
	 }
	}
	  if( flag == 1)
	  {
		  System.out.println("\nThe Given Matrix is Symmetric");
	  }
	  else
	  {
		  System.out.println("\nThe Given Matrix Is Not Symmetric");
	  }
	           
	 }
		
	}
	
	}

