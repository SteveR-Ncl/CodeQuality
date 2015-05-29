package examples;
import java.util.Scanner;
import java.io.IOException;




public class ControlFlow {
	
	
	public void ReadAndSet(){
		int x,y,z;	

		x = read();
		if (x>0){
			z = read() ;
		} else {
			y = read() ;
		}
		x = x*z;

	}

	public void Uncertainty(){

		int w,x,y,z;

		x = read();
		if (x>0){
			z = read();
		} else {
			y = read();
		}  
		if (x>0){
			w = z; 
		} else { 
			w = y;
		}

	}

	public int read(){
		Scanner in = new Scanner(System.in);
		
		int val = in.nextInt();
		in.close();
		return val;

	}
}

