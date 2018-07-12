package com.review.main;

import java.io.PrintWriter;
import java.util.List;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.review.models.BeanieBaby;
import com.review.services.BeanieBabyService;

public class Driver {

	public static void main(String[] args) {
		String serviceUrl = "http://localhost:8080/SOAPExampleService/BeanieBabies";
		
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
		factory.setServiceClass(BeanieBabyService.class);
		factory.setAddress(serviceUrl);
		
		LoggingInInterceptor inInter = new LoggingInInterceptor();
		LoggingOutInterceptor outInter = new LoggingOutInterceptor();
		
		factory.getInInterceptors().add(inInter);
		factory.getOutInterceptors().add(outInter);
		
		inInter.setPrintWriter(new PrintWriter(System.out));
		outInter.setPrintWriter(new PrintWriter(System.out));
		
		BeanieBabyService bbs = (BeanieBabyService) factory.create();
		
		List<BeanieBaby> beanieBabies = bbs.getAllBeanieBabies();
		for(BeanieBaby b : beanieBabies) {
			System.out.println(b.getName());
			System.out.println(b.getPoem());
			System.out.println();
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
		
		bbs.addBeanieBaby(friend);

	}

}
