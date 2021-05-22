package model;

public class ColorPrinter {

	
	public final static String ESC = "\u001b[";
	
	public final static String RED = "\u001b[41m";
	
	public final static String YELLOW = "\u001b[43m";
	
	public final static String BLUE = "\u001b[44m";
	


	
	public ColorPrinter( ) {
		
	}

	public String chooseColor(int n) {
		
		if(n==1) {
			
			return YELLOW + " "; 
			
		}else if(n==2){
			return BLUE + " ";
			
		}else {
			return RED + " ";
		}	
	}
}
