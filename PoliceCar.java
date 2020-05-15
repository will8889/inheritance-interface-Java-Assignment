package umlDiagram;

public class PoliceCar extends Vehicle2 implements LandVehicle, IsEmergency{

	private int numWheels = 4;
	
	public PoliceCar() {
		this.name="Police Car";
		this.maxPassengers=3;
		this.maxSpeed=200;
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
	public void sirenOn() {
		// TODO Auto-generated method stub
		System.out.println("ngiung ngiung ngiung");
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
		System.out.println("ngoenggggggg");
	}

}
