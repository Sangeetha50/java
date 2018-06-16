public class MyClass {
   
    public static void main(String[] args) {
    //armstrong
        int num = 370, number, temp, total = 0;
        number = num;
        while (number != 0)
        {
            temp = number % 10;
            total = total + temp*temp*temp;
            number =number/ 10;
        }

        if(total == num)
            System.out.println(" Armstrong number");
        else
            System.out.println(" Not a Armstrong number");
    
    //prime number
    int count1=0;
    for(int i=1;i<=num;i++) {
        if(num%10==0) {
        count1++;
        }
    }
    if(count1==2) {
        System.out.println("prime");
        
    }
    else {
        System.out.println("nonprime");
    }
    //palindrome
    String str ="mam";
		int len=str.length();
		int i,count=0;
		for(i=len-1;i>=0;i--){
		    if(str.charAt(i) == str.charAt((len-1)-i))
		        count ++;
		}
		if(count == len)
		    System.out.println("palindrome");
		 else
		    System.out.println("not palindrome");
		
	}
}
