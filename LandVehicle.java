package umlDiagram;

public interface LandVehicle extends Vehicle {
	abstract int getNumWheels();
	abstract void setNumWheels(int numWheels);
	abstract void drive();
}
