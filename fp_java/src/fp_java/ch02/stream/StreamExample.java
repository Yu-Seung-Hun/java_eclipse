package fp_java.ch02.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class StreamExample {
	
	public static void main(String[] args) {
		List<Dish> menu = DishData.menu;
		
		List<String> lowCaloricDishesName = 
				menu.stream()
				.filter( (dish) -> dish.getCalories() > 300)
				.sorted(Comparator.comparing(Dish::getCalories))
				.map(Dish::getName)
				.skip(2)
				.limit(3)
				.collect(Collectors.toList());
		
		lowCaloricDishesName
			.forEach(System.out::println);
	}
	
}
