package thread;

import model.ColorPrinter;

public class ColorPrinterThread extends Thread{

	private ColorPrinter colorPrinter;
	
	private int currentX;
	
	private int currentY;
	
	private int maxY;
	
	private int maX;
	
	private int color;
	
	private int sleepTime;
	
	public final static String ESC = "\u001b[";
	

	
	public ColorPrinterThread(int currentY,int maxY,int currentX, int maX,int color,int sleepTime) {
		
		colorPrinter = new ColorPrinter();
		this.currentY = currentY;
		this.currentX = currentX;
		this.maxY = maxY;
		this.maX = maX;
		this.color = color;
		this.sleepTime = sleepTime;
	}
	@Override
	public void run() {
		
		//String msg = colorPrinter.print(currentY,maxY,currentX,maX);
		//colorPrinter.setCurrent(msg);
		printFlag();
	}
	public synchronized void printFlag() {
		
		for(int i=currentX; i<maX;i++ ) {
		
			for(int j=currentY;j<maxY;j++) {
			
				System.out.print(ESC+i+"G"+ESC+j+"d" + colorPrinter.chooseColor(color));
				try {
					Thread.sleep(sleepTime);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}
	} 
	
	
	}
