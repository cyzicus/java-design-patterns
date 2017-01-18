package com.cyzicus;

import com.cyzicus.color.Color;
import com.cyzicus.shape.Shape;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbstractFactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbstractFactoryApplication.class, args);
		runAbstractFactoryDemo();
	}

	private static void runAbstractFactoryDemo() {
		AbstractFactory shapeFactory = FactoryProducer.getFactory(FactoryProducer.FactoryType.SHAPE);
		AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryProducer.FactoryType.COLOR);

		Shape shape1 = shapeFactory.getShape(AbstractFactory.ShapeType.CIRCLE);
		shape1.draw();

		Shape shape2 = shapeFactory.getShape(AbstractFactory.ShapeType.RECTANGLE);
		shape2.draw();

		Color color1 = colorFactory.getColor(AbstractFactory.ColorType.BLUE);
		color1.fill();

		Color color2 = colorFactory.getColor(AbstractFactory.ColorType.RED);
		color2.fill();
	}
}
