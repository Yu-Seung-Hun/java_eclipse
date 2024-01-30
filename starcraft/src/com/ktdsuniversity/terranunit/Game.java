package com.ktdsuniversity.terranunit;

public class Game {
	
	public static void move(Attackable unit) {
		unit.attack();
		unit.move();
		unit.stop();
		unit.hold();
		unit.patrol();
		
		
		if(unit instanceof Mineable) {
			Mineable worker = (Mineable) unit;
			worker.mining();
		}
	}
	
	public static void main(String[] args) {
		
		// 익명 클래스 
		// 한번 쓰고 안쓸 클래스를 쉽게 만드는 방법. 
		// Steam API를 사용할 때 주로 사용되는 방법. 
		Mineable drone = new Mineable() {
			
			@Override
			public void mining() {
				System.out.println("드론이 미네랄을 채굴합니다.");
			}
		};
		
		drone.mining();
		
		SpecialCommand marine = new Marine();
		
		Attackable scv = new Scv();
		
		marine.attack();
		marine.steampack();
		marine.move();
		
		scv.attack();
		scv.move();
		scv.patrol();
		scv.hold();
		
		move(scv);
		move(marine);
	}
}
