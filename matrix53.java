import java.util.Scanner;
public class Main {
  public static void main(String args[])
  {
	  
	  Scanner scanner=new Scanner(System.in);
	  int n=scanner.nextInt();
    int m=scanner.nextInt();
	  int a[][]=new int[n][m];
	  int count=0;
	  int product=n*m;
	  int total=0;
	  int prevrow=-1;
	  int prevcol=-1;
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<m;j++)
		  {
			  a[i][j]=scanner.nextInt();
		  }
	  }
	  int row=0;
	  int col=0;
	  
	  while(total<product)
	  {
		  //System.out.println("1row:"+row+"col:"+col);
		  if(prevcol==col && prevrow==row)
			{
				col++;
			}
		  while((col<(m-count)) && total<=product )
		  {
			
			  //System.out.print("first loop"+row+col+" row col"+a[row][col]);
			  System.out.print(a[row][col]+" ");
			  total++;
			  col++;
		  }
		  col--;
		  row++;
		  //System.out.println();
		  //System.out.println("2row:"+row+"col:"+col);
		  while(row<(n-count) && total<=product )
		  {		  
			  
			  //System.out.print("2nd"+row+col+" row col"+a[row][col]);
			  System.out.print(a[row][col]+" ");
			  total++;
			  row++;			  
		  }
		  
		  row--;
		  col--;
		  //System.out.println();
		  //System.out.println("3row:"+row+"col:"+col);
		  while(col>=count && total<=product )
		  {
			 
			  //System.out.print("3rd"+row+col+" row col"+a[row][col]);
			  System.out.print(a[row][col]+" ");
			  total++;
			  col--;
			  
		  }
		  col++;
		  row--;
		  //System.out.println();
		  //System.out.println("4row:"+row+"col:"+col);
		  count++;
		  while(row>=count && total<=product )
		  {
			  
			  //System.out.print(row+col+" row col"+a[row][col]);
			 prevrow=row;
			 prevcol=col;
			  System.out.print(a[row][col]+" ");
			  total++;
			  row--;			  
		  }		  		  
			  row++;		  
			  
	  }
	  
  }

}
