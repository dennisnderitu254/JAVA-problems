import java.util.Scanner;
import java.io.*;


public class Demo{
	double d,h,w;

	Demo(){
		d=10;
		h=20;
		w=30;
	}

	Demo(double d, double h, double w){
		this.d = d;
		this.h = h;
		this.w = w;
	}

	double volume(){
		return d*w*h;
	}
}