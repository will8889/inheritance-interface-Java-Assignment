package umlDiagram;

public class Frigate extends Vehicle2 implements SeaVessel{

	private int displacement;
	
	public Frigate() {
		this.name = "Frigate";
		this.maxPassengers=100;
		this.maxSpeed=60;
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
	public int getDisplacement() {
		// TODO Auto-generated method stub
		return this.displacement;
	}

	@Override
	public void setDisplacement(int displacement) {
		// TODO Auto-generated method stub
		this.displacement = displacement;
	}

	@Override
	public void launch() {
		// TODO Auto-generated method stub
		System.out.println("whoosh");
	}
	
	void fireGun() {
		System.out.println("dor dor dor");
}
}
