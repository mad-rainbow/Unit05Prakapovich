package lt.lhu.unit05_03.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lt.lhu.unit05_03.bean.Train;
import lt.lhu.unit05_03.logic.TrainsLogic;
import lt.lhu.unit05_03.view.TrainsView;

public class Main {

	public static void main(String[] args) {
		List<Train> trains = new ArrayList<Train>();
		
		Train t1 = new Train("Marseille", "507", "1030");
		Train t2 = new Train("Munich", "1003", "0805");
		Train t3 = new Train("Vienna", "663", "1914");
		Train t4 = new Train("Munich", "709", "1537");
		Train t5 = new Train ("Munich", "1701", "0534");
		
		trains.add(t1);
		trains.add(t2);
		trains.add(t3);
		trains.add(t4);
		trains.add(t5);
		
		System.out.println("Sort by number: \n");
		TrainsView.view(TrainsLogic.sortByNumber(trains));	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Search by number: \n");
		String number = sc.next();
		TrainsView.view(TrainsLogic.searchByNumber(trains, number));
		
		TrainsView.view(TrainsLogic.sortByDestination(trains));
		
		

	}

}
