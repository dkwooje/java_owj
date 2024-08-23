package pack3.classA3;

interface Q{
	void bcd();
}
class W{
	Q q =new Q(){
		@Override
		public void bcd() {
			System.out.println("익명 이너 클래스");
		}
	};

	void abc() {
		q.bcd();
	}
}

public class studyA31_익명이너클래스 {
	public static void main(String[] args) {
			W w = new W();
			w.abc();
	}
}

//익명 이너클래스 :이름이 없는 이너 클래스 :클래스의 선언과 객체의 선언을 동시에 하는 클래스