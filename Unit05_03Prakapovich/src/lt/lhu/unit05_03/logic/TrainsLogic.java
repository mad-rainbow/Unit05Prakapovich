package lt.lhu.unit05_03.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lt.lhu.unit05_03.bean.Train;

public class TrainsLogic {
	public static List<Train> sortByNumber(List<Train> trains) {

		for (int i = 0; i < trains.size(); i++) {
			int min = Integer.parseInt(trains.get(i).getNumber());
			int pos = i;

			for (int j = i + 1; j < trains.size(); j++) {
				int current = Integer.parseInt(trains.get(j).getNumber());
				if (min > current) {
					min = current;
					pos = j;
				}
			}
			Train temp = trains.get(pos);
			trains.set(pos, trains.get(i));
			trains.set(i, temp);
		}

		return trains;
	}

	public static List<Train> searchByNumber(List<Train> trains, String query) {
		Train t = new Train();
		List<Train> result = new ArrayList<Train>();

		for (int i = 0; i < trains.size(); i++) {
			t = trains.get(i);
			if (query.equals(t.getNumber())) {
				result.add(t);
			}
		}
		return result;
	}

	public static List<Train> sortByDestination(List<Train> trains) {

		for (int i = 0; i < trains.size(); i++) {
			String min = trains.get(i).getDestination();
			int pos = i;

			for (int j = i + 1; j < trains.size(); j++) {
				String current = trains.get(j).getDestination();
				if (min.compareTo(current) > 0) {
					min = current;
					pos = j;
				} else if (min.compareTo(current) == 0) {
					int minDep = Integer.parseInt(trains.get(pos).getDeparture());
					int currentDep = Integer.parseInt(trains.get(j).getDeparture());
					if (minDep > currentDep) {
						Train temp = trains.get(pos);
						trains.set(pos, trains.get(j));
						trains.set(j, temp);
					}
				}
			}
			Train temp = trains.get(pos);
			trains.set(pos, trains.get(i));
			trains.set(i, temp);
		}

		return trains;
	}
}