package fp_java.ch03.slicing;

import java.util.ArrayList;
import java.util.List;

import fp_java.ch02.stream.vo.Dish;
import fp_java.ch02.stream.vo.DishData;

public class SlicingExample {

	public static void main(String[] args) {
		
		// 칼로리가 300보다 큰 음식 중
		// 앞의 2개는 무시하고 나머지는 모두 출력
		List<Dish> menu = DishData.menu;
		
		// Stream이 아닌 경우
		
		// 칼로리가 300보다 큰 음식 리스트
		List<Dish> dishes = new ArrayList<>();
		for(Dish dish : menu) {
			if(dish.getCalories() > 300) {
				dishes.add(dish);
			}
		}
		System.out.println(dishes);
		
		// 앞의 2개는 무시하고 나머지 출력
		for(int i=0; i<dishes.size(); i++) {
			if(i >= 2) {
				System.out.println(dishes.get(i));
			}
		}
		
		
		// Stream을 사용할 경우
		menu.stream()
			.filter( (dish) -> dish.getCalories() > 300)
			.skip(2)
			.forEach( (dish) -> System.out.println("Stream: " + dish));
		
		
		// 메뉴의 타입(Type)이 Dish.Type.MEAT 이거나, Dish.Type.OTHER인 메뉴 중
		// 가장 앞 2개는 건너뛰고
		// 3개만 가져와서 메뉴의 이름을 출력
		menu.stream()
			.filter( (dish) -> dish.getType() == Dish.Type.MEAT ||
								dish.getType() == Dish.Type.OTHER)
			.skip(2)
			.limit(3)
			.forEach( (dish) -> System.out.println("타입: " + dish));
		
		menu.stream()
			.filter(d -> d.getCalories() > 300)
			.map(Dish::getName)
			.limit(3)
			.forEach(System.out::println);
		
		
	}

}
