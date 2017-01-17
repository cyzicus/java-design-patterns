package com.cyzicus;

import com.cyzicus.shape.Shape;
import com.cyzicus.shape.ShapeFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.cyzicus.shape.ShapeFactory.*;
import static com.cyzicus.shape.ShapeFactory.ShapeType.*;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryApplication.class, args);
		runFactoryMethodDemo();
	}

	private static void runFactoryMethodDemo() {
		ShapeFactory factory = new ShapeFactory();
		Shape circle = factory.getShape(CIRCLE);
		Shape rectangle = factory.getShape(RECTANGLE);
		Shape square = factory.getShape(SQUARE);
		circle.draw();
		rectangle.draw();
		square.draw();
	}
}
