package co.micol.pj;

public abstract class Animal {		//���� �ϳ��̻��� abstract�� ������ �ְų� �Ǵ� ��ü�� �ƿ� ����ִ� Ŭ���� = �߻�Ŭ����
									//�����ڽ��� �ν��Ͻ��� ���� �Ұ� = Animal animal = new Animal();=> �̰� �ȵ�.
	public abstract void run();
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}
}
