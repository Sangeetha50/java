public class Program
{
	public static void main(String[] args) {
	    int i,j,num=12345,n,count=0,temp;
	    int[] arr=new int[10];
	    while(num != 0){
	        temp = num %10;
	        num =num /10;
	        arr[count]=temp;
	        count ++;
	    }
	   int k=count-1;
	    for(i=0;i<count;i++){
	        for(j=0;j<count;j++){
	               if( i == j){
	                     System.out.print(arr[k]);
	                     k--;
	               }
	                else if((i+j) == count -1)
	                    System.out.print(arr[i]);
	                   
	                
	                else
	                    System.out.print("  ");
	        }
	        System.out.println();
	    }
	    
	}
}
