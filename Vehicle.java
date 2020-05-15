package umlDiagram;

public interface Vehicle {
	abstract String getName();
	abstract void setName(String name);
	abstract int getMaxPassengers();
	abstract void setMaxPassengers(int maxPassengers);
	abstract int getMaxSpeed();
	abstract void setMaxSpeed(int maxSpeed);
}
