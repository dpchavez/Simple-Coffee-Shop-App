public class Mocha extends CoffeeDecorator{

	private double cost = .50;
	Mocha(Coffee specialCoffee){
		super(specialCoffee);
	}
	
	public double makeCoffee() {
		return specialCoffee.makeCoffee() + addMocha();
	}
	
	private double addMocha() {
		
		System.out.println(" + Mocha: $.50");
		
		return cost;
	}
}
