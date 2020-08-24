
public class QuickSortAlgo {

	public void QuickSort(int [] a,int first,int last)
	{
		if(first<last)
		{
			partition(a,first,last);
			QuickSort(a,first+1,last);
			QuickSort(a,first,last-1);
		}
	}
	
	
	public int partition(int [] a,int first,int last)
	{
		int pivot=a[first];
		int low=first+1;
		int high =last;
		
		while(high>low)
		{
			while(a[high]>pivot)
				high--;
			while(high>=low&&a[low]<pivot)
				low++;
			
		if(high>low)
		{
			swap(a,low,high);
		}
		
		
		}
		if(pivot>a[high])
			{a[first] = a[high];
			a[high]=pivot;
			return high;}
		else
			return first;	
			
	}
	private void swap(int [] a ,int i,int j)
	{
		int tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
	public void display(int[]list)
	{
		for(int i=0;i<list.length;i++)
			System.out.print(list[i]+" ");
		System.out.println(" ");
	}
	
}
