
/*
 * HOMEWORK 5
 * CS 342
 * DANIELA P. CHAVEZ
 * FALL 2020 - CORONA TIME
 * */



public class Barista

{
	//This will contain all the data of the order...
	Coffee Order;
	
	//This will initialize the barista...
	Barista()
	{
		Order = new BasicCoffee();
		//System.out.println("Black Coffee: $3.99");
	}
	
	
	//This will initialize the barista with an existing coffe order...
	Barista(Coffee ExistingCoffee)
	{
		Order = ExistingCoffee;
		//System.out.println("Black Coffee: $3.99");
	}

	//This will add extra sugar to the order....
	void AddExtraSugar() 
	{
		Order = new Sugar(Order);
		System.out.println("+ $ 1.00");
	}

	//This will add extra cream to the order...
	void AddExtraCream()
	{
		Order = new Cream(Order);
	}
	
	//This will add an extra shot tot he order...
	void AddExtraShot() 
	{
		Order = new ExtraShot(Order);
	}
	
	void AddExtraIce() 
	{
		Order = new Ice(Order);
	}
	
	void AddExtraMocha()
	{
		Order = new Mocha(Order);
		System.out.println("+ $0.50");
	}
}