
public class start {
	
	 public static void main(String[] args) {
	QuickSortAlgo quick=new QuickSortAlgo();
    int a2[]= {5,9,2,7,4,3,6,8};
    System.out.print("Before Quick Sort ");
    quick.display(a2);
    quick.QuickSort(a2, 0, a2.length-1);
    System.out.print("After Quick Sort ");
    quick.display(a2);
	 }
}
