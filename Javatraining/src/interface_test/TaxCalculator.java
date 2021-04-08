package interface_test;

public class TaxCalculator implements StateTax,CentralTax{
	
	public void FuelTax() {
		System.out.println("Fuel tax of Central");
	}
	public void liquorTax() {
		System.out.println("liquor tax of state");
	}
	@Override
	public void fuelTax() {
		// TODO Auto-generated method stub
		
	}
	

}
