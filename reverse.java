import java.lang.*;

import java.io.*;

import java.util.*;

class reverse
{

	public static void main(String[] args)
	{

		String a="sangi";
    byte[] b=a.getBytes();	//Convert String to byte


		byte[] c=new byte[b.length];
		for(int i=0;i<b.length;i++) {
			c[i]=b[b.length-i-1];
		}
		System.out.println(new String(c));
		//aternative
			 String st ="sangeetha";
		int length=st.length();
	
		for(int ii=length-1;ii>=0;ii--){
		    System.out.print(st.charAt(ii));
		}
		\\character reverse
		
			
		char ch[]={'a','v','b'};
		for(int i=ch.length-1;i>=0;i--){
		    System.out.print(ch[i]);
		}
	}
}
