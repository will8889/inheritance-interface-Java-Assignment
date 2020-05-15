package umlDiagram;

public class Hovercraft extends Vehicle2 implements LandVehicle, SeaVessel{

		private int numWheels;
		private int displacement;
		
		public Hovercraft() {
			this.name="Hovercraft";
			this.maxPassengers=4;
			this.maxSpeed=50;
		}
		
		public String getName() {
			return this.name;
		}
		
		@Override
		public void setName(String name) {
			this.name = name;
		}
		
		public int getMaxPassengers() {
			return this.maxPassengers;
		}
		
		public void setMaxPassengers(int maxPassengers) {
			this.maxPassengers = maxPassengers;
		}
		
		void enterLand() {}
		
		void enterSea() {}

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
			this.displacement = displacement;
		}

		@Override
		public void launch() {
			// TODO Auto-generated method stub
			
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
			
		}
	}

