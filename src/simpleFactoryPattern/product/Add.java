package simpleFactoryPattern.product;


public class Add implements Operation {

	@Override
	public double getResult(double numberA, double numberB) {
		// TODO Auto-generated method stub
		return numberA+numberB;
	}

}
