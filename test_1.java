public class test_1 {
	public static Cargo_Carrier[] CreateGroupCargo() {
		Cargo_Carrier[] A = new Cargo_Carrier[5];
		A[0] = new CarW("Moscow", "Minsk", 11, 716);
		A[1] = new AirplaneW("Minsk", "Berlin", 10.5, 970);
		A[2] = new TrainW("Peter", "Berlin", 60, 1400);
		A[3] = new AirplaneW("Minsk", "Peter", 120, 690);
		A[4] = new TrainW("Minsk", "Baranovichi", 8, 140);

		return A;
	}
	public static Passenger_Carrier[] CreateGroupPass() {
		Passenger_Carrier[] A = new Passenger_Carrier[5];
		A[0] = new CarP("Moscow", "Minsk", 8, 716);
		A[1] = new AirplaneP("Minsk", "Berlin", 10, 970);
		A[2] = new TrainP("Peter", "Berlin", 60, 1400);
		A[3] = new AirplaneP("Minsk", "Peter", 120, 690);
		A[4] = new TrainP("Minsk", "Baranovichi", 8, 140);

		return A;
	}

	public static void main(String[] args) {
		try {
			Connector connector = new Connector("groupCargo.dat");
			connector.write(CreateGroupCargo());
			Cargo_Carrier[] groupCargo = connector.readC();
			System.out.println("The group of Cargo_Carriers:");
			for (Cargo_Carrier l: groupCargo)
				System.out.println(l);
			/*System.out.println("Create object with exception:");
			Cargo_Carrier c = new CarW("Minsk", "Vitebsk", 999, -1);
			System.out.println(c);*/
			System.out.println();
			////////////////////////////////////////////////////////////////////
			Connector con = new Connector("groupPass.dat");
			con.write(CreateGroupPass());
			Passenger_Carrier[] groupPas = con.readP();
			System.out.println("The group of Passenger_Carriers:");
			for (Passenger_Carrier l: groupPas)
				System.out.println(l);
			/*System.out.println("Create object with exception:");
			Passenger_Carrier p = new CarP("Minsk", "Vitebsk", 70, 180);
			System.out.println(p);*/
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}