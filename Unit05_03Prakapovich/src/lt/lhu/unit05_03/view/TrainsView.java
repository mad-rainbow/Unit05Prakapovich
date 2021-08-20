package lt.lhu.unit05_03.view;

import java.util.List;

import lt.lhu.unit05_03.bean.Train;

public class TrainsView {

	public static void view(List<Train> trains) {
		if (trains.size() == 0) {
			System.out.println("No Results");
		} else {
			Train t = new Train();
			for (int i = 0; i < trains.size(); i++) {
				t = trains.get(i);
				System.out.println("Destination: " + t.getDestination());
				System.out.println("Train number: " + t.getNumber());
				System.out.println("Departure time: " + t.getDeparture().substring(0, 2) + ":" + t.getDeparture().substring(2));
				System.out.println("_____________________________________________________");
			}
		}
	}
}