package co.micol.pj;

public abstract class Animal {		//나는 하나이상의 abstract를 가지고 있거나 또는 몸체가 아예 비어있는 클래스 = 추상클래스
									//자지자신을 인스턴스로 생성 불가 = Animal animal = new Animal();=> 이거 안됨.
	public abstract void run();
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
}
