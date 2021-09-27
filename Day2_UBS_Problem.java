/*
 * Day2:
 There is puzzle using a rectangular grid the upper left corner is at row or column equal 200 each cell contain an integer 
 thus the score starts at zero and is the sum of all the integers in each cell visited as a grade is Travis movement begins
 in either top or the bottom row and States within the top or bottom row and stays within the bounds of grid only one cel 
 can be visited per direction determine the maximum achievable score movement for the two scenarios are as follows
 From a cell(i,j)=(0,p):
 (i+1,j-1)
 (i+1,j)
 (i+1,j+1)
 2. From cell (i,j)=(r-1,q):
 (i-1,j-1)
 (i-1,j)
 (i-1,j+1)
 
 9+2+4=
 9+2+1=
 ...
 4+1+1=
 max out of that.
 * */
package logic;

public class Day2_UBS_Problem 
{
    static int findMaxPath(int mat[][])
    {
        
    	int c = mat[0].length;
    	int r = mat.length;
        int maxSum = -1;
        for (int i = 0; i < c; i++)
        	maxSum = Math.max(maxSum, mat[0][i]);
        int t[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		t[i][j]=mat[i][j];   		
        		
        	}
        }
//        for(int i=0;i<r;i++)
//        {
//        	for(int j=0;j<c+2;j++)
//        	{
//        		System.out.print(t[i][j]);
//        	}
//        }
 
        for (int i = 1; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                
                if (j > 0 && j < c - 1)
                    t[i][j] += Math.max(t[i - 1][j],
                                 Math.max(t[i - 1][j - 1],
                                    t[i - 1][j + 1]));
                else if (j > 0)
                    t[i][j] += Math.max(t[i - 1][j],
                                    t[i - 1][j - 1]);
                else if (j < c - 1)
                    t[i][j] += Math.max(t[i - 1][j],
                                t[i - 1][j + 1]);
 
            
                maxSum = Math.max(t[i][j], maxSum);
            }
        }
        for(int i=0;i<r;i++)
        {
        	for(int j=0;j<c;j++)
        	{
        		System.out.print(t[i][j]+" ");   		
        		
        	}
        	System.out.println();
        }
        return maxSum;
    }

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int arr[][] = {{9,4,7},{2,1,3},{1,4,2}};
		System.out.println("Max Sum: "+findMaxPath(arr));
	}

}

