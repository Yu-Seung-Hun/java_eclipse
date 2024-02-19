package fp_java.ch02.stream;

import java.util.List;
import java.util.stream.Collectors;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class StreamExample {
	
	List<Dish> menu = DishData.menu;
	
	List<String> lowCaloricDishesName = menu.stream()
											.filter( (dish) -> dish.getCalories() < 400)
											.map( (dish) -> dish.getName())
											.collect(Collectors.toList());
	
}
