import java.util.*;
public class duplicate
{
  public static void main(String[] args) 
    {
        int[] my_array = {1,7, 2, 5, 5, 6, 6, 7, 2,7,2};
        int[] s= new int[200];
        
 
        for (int i = 0; i < my_array.length-1; i++)
        
        {
            for (int j = i+1; j < my_array.length; j++)
            {
                if ((my_array[i] == my_array[j]) && (i != j))
                {
                s[i]=my_array[j];
              
               
                      
                    // System.out.println("Duplicate Element : "+my_array[j]);
                  
                }
            }
        
        }
          for (int i = 0; i < s.length-1; i++)
        
        {
            for (int j = i+1; j < s.length; j++)
            {
                if ((s[i] == s[j]) && (i != j))
                {
                //s[i]=my_array[j];
              
               
                      
                    System.out.println("Duplicate Element : "+my_array[j]);
                  
                }
                else {
                    
                }
            }
            System.out.println(s[i]);
        }
    }    
}
