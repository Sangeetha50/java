public class Stringduplicates
{
	public static void main(String[] args) {
	    int i,j,l;
	    int k=0;
	    int count=0;
	    String output="";
	    String str="Sevvandhi";
	    for(i=0;i<str.length();i++){
	        for(j=0;j<str.length();j++){
	            if(i != j){
    	            if(str.charAt(i) == str.charAt(j)){
    	                    count ++;
    	                if(output.length() == 0) 
    	                    output += str.charAt(j);
    	                else
    	                    for(l=0;l<output.length();l++){
    	                        if(output.charAt(l)!= str.charAt(j))
    	                            output += str.charAt(j);
    	                    }
    	                }
	            }
	        }
	    }
	    for(i=0;i<output.length();i++){
	        System.out.print("Duplicate character " +output.charAt(i) + " " +" And count " + count);
	    }
	    
	}
}
