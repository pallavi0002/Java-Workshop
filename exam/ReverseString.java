package exam;

public class ReverseString {
	
	   public static void main(String[] args) {
	        String str = "i am Pallavi";
	        String reversed = reverseString(str);
	        System.out.println("i am Pallavi: " + reversed);
	    }

	    public static String reverseString(String str)
	    {
	        if (str.isEmpty())
	            return str;
	        
	        return reverseString(str.substring(1)) + str.charAt(0);
	    }
	}


