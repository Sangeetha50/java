public class MyClass {
    public static void main(String args[]) {
       int i,k=0,j=1;
       for(i=0;i<5;i++) {
    
           System.out.print(k);
           i=j;
           j=k;
           k=i+j;
       }
    }
}
