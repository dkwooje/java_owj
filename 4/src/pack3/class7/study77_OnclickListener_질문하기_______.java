package pack3.class7;

class Button {
	OnclickListener ocl;
	void setOnclickListener (OnclickListener ocl) {
		this.ocl = ocl;
	}
	interface OnclickListener {
		public abstract void onClick();
	}
	void onClick() {
		ocl.onClick();
	}
}

public class study77_OnclickListener_질문하기_______ {
	public static void main(String[] args) {
		//개발자 1. 클릭해면 음악 재생
		Button btn1 = new Button();
		btn1.setOnclickListener(new Button.OnclickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자 1: 음악 재생");
			}
		});
		btn1.onClick();
		
		//개발자 2. 클릭하면 네이버 접속
		Button btn2 = new Button();
		btn2.setOnclickListener(new Button.OnclickListener() {
			@Override
			public void onClick() {
				System.out.println("개발자 2: 네이버 접속");
			}
		});
		btn2.onClick();
	}
}
