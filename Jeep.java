package umlDiagram;

public class Jeep extends Vehicle2 implements LandVehicle{

	private int numWheels = 4;	
	
	public Jeep() {
		this.name = "Jeep";
		this.maxPassengers=4;
		this.maxSpeed=160;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public int getMaxPassengers() {
		// TODO Auto-generated method stub
		return this.maxPassengers;
	}

	@Override
	public void setMaxPassengers(int maxPassengers) {
		// TODO Auto-generated method stub
		this.maxPassengers = maxPassengers;
	}

	@Override
	public int getMaxSpeed() {
		// TODO Auto-generated method stub
		return this.maxSpeed;
	}

	@Override
	public void setMaxSpeed(int maxSpeed) {
		// TODO Auto-generated method stub
		this.maxSpeed = maxSpeed;
	}

	@Override
	public int getNumWheels() {
		// TODO Auto-generated method stub
		return this.numWheels;
	}

	@Override
	public void setNumWheels(int numWheels) {
		// TODO Auto-generated method stub
		this.numWheels = numWheels;
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("ngueng");
	}
	
	void soundHorn() {
		System.out.println("piiiiimmmmmmmmmmm");
	}
	
}

