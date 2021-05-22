package ui;


import thread.ColorPrinterThread;

public class Main {

	public final static String ESC = "\u001b[";
	
	
	public static void main(String[]args) {
	
	System.out.print(ESC+"2J");//Clear screen	
	
	ColorPrinterThread cpty = new ColorPrinterThread(0,15,0,100,1,15);
	
	ColorPrinterThread cptb = new ColorPrinterThread(15,22,0,100,2,60);
	
	ColorPrinterThread cptr = new ColorPrinterThread(22,29,0,100,3,80);
	
	cpty.start();
	cptr.start();
	cptb.start();
	
	
	}	
	
	
}
