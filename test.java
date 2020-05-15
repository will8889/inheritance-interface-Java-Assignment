package umlDiagram;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeep j = new Jeep();
		System.out.println(j.getName());
		Frigate f = new Frigate();
		f.setName("Yamato");
		System.out.println(f.getName());
		Frigate z = new Frigate();
		System.out.println(z.getName());
		PoliceCar p = new PoliceCar();
		PoliceCar[] PoliceList = new PoliceCar[10];
		PoliceList[0] = p;
		System.out.println(PoliceList[0].getName());
		
	}

}
