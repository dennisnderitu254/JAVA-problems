

public class WeightedDemo extends Demo{
	double wt;

	WeightedDemo(double wt){
		super(2,3,4);
		this.wt = wt;
		System.out.println("Weight = " + wt);
	}
}