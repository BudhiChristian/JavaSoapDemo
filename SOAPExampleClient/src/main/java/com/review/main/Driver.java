package com.review.main;

import java.util.List;

import com.review.services.*;

public class Driver {

	public static void main(String[] args) {
		BeanieBabyService bbs = new BeanieBabyServiceImplService().getBeanieBabyServiceImplPort();
		
		List<BeanieBaby> beanieBabies = bbs.getAllBeanieBabies();
		for(BeanieBaby b : beanieBabies) {
			System.out.println(b.getName());
		}
		
		BeanieBaby friend = new BeanieBaby();
		friend.setStyleNumber(47020);
		friend.setAnimal("Bunny");
		friend.setName("Happily");
		friend.setYear(2006);
		friend.setPoem("My friends and I have a neat job to do\r\n" + 
				"Coloring eggs in pink, yellow, and blue\r\n" + 
				"Once that is finished our job isn't done\r\n" + 
				"We have to deliver them to everyone!");
		try {
			bbs.addBeanieBaby(friend);
			System.out.println("Success");
		} catch (NoPoemException_Exception e) {
			e.printStackTrace();
		}
	}

}
