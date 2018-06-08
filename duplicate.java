import java.util.*;
public class duplicate
{
  public static void main(String[] args) 
    {
        int[] a= {1,7, 2, 5, 5, 6, 6, 7, 2,7,2};
        int[] s= new int[a.length];
      
        for (int i = 0; i < a.length-1; i++)
        
        {
            for (int j = i+1; j < a.length;j++)
            {
                if (a[i] == a[j])
                {
              
                    System.out.println("Duplicate Element : "+a[j]);
		}
	    }
	}
   }
}
 
        
