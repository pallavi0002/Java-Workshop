package exceptionhandling;

public class NullPointerException {
	

	   private void checkArithmaticException(){
	        try {
	            int a=0;
	            int result=10/a;
	            System.out.println("result : "+result);
	        }
	        catch (ArithmeticException e){
	            System.out.println(e.getMessage());

	        }
	        restOfTheCode();
	    }

	    private  void checkArithmaticException(){
	        try {
	            String s = null;
	            int length = s.length();
	            System.out.println(length);
	        }
	        catch (Exception e){
	            System.out.println(e);
	        }
	        restOfTheCode();
	        }

	    private void restOfTheCode(){
	        System.out.println("Rest of the code");
	    }

	    public static void main(String[] args) {

	        ExceptionDemo demo=new ExceptionDemo();
	        demo.checkArithmaticException();

	    }

	}
