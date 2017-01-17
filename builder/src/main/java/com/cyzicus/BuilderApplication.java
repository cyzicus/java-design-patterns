package com.cyzicus;

import com.cyzicus.shape.Meal;
import com.cyzicus.shape.MealBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderApplication.class, args);
		runBuilderPatternDemo();
	}

	private static void runBuilderPatternDemo() {
		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.shotItems();
		System.out.println("Total Cost: " + vegMeal.getCost());

		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\n\nNon-Veg Meal");
		nonVegMeal.shotItems();
		System.out.println("Total Cost: " + nonVegMeal.getCost());
	}
}
