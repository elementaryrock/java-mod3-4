import java.util.Scanner;
class QuickSort
{
	public static void quickSort(String A[], int p, int q)
	{
		if(p<q)
		{
			int r = partition(A,p,q);
			quickSort(A,p,r-1);
			quickSort(A,r+1,q);
		}
	}
	public static int partition(String A[], int p, int q)
	{
		int x = q;
		int i = p-1;
		for(int j=p;j<q;j++)
		{
            if((A[j].compareTo(A[x]))<=0)
        	{
        		i++;
    			String t = A[i];
				A[i] = A[j];
				A[j] = t;
			}
        }
        String t = A[i+1];
        A[i+1] = A[x];
        A[x] = t;
        return (i+1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Names : ");
        int n = sc.nextInt();
        String s[] = new String[n];
        sc.nextLine();
        System.out.println("Enter Names : ");
        for(int i=0;i<n;i++)
        	s[i] = sc.nextLine();
        
        System.out.println("Given Array of Names");
        for(int i=0;i<n;i++)
        	System.out.println(s[i]);
        QuickSort t = new QuickSort();
        quickSort(s,0,s.length-1);
        System.out.println("Sorted Names");
        for(int i=0;i<n;i++)
        	System.out.println(s[i]);
    }
}
    	
