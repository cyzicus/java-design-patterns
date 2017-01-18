package com.cyzicus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrototypeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrototypeApplication.class, args);
		runPrototypePatternDemo();
	}

	private static void runPrototypePatternDemo() {
		ShapeCache.loadCache();

		Shape clonedShape = ShapeCache.getShape("1");
		System.out.println("Shape: " + clonedShape.getType());
		
		Shape clonedShape2 = ShapeCache.getShape("2");
		System.out.println("Shape: " + clonedShape2.getType());

		Shape clonedShape3 = ShapeCache.getShape("3");
		System.out.println("Shape: " + clonedShape3.getType());
	}
}
