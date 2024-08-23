package pack1.pack2;

import java.util.ArrayList;
import pack1.run.RUN;

public class study{

public void test() {
	ArrayList<RUN> list = new ArrayList<RUN>();

	RUN.add("사과 , 빨강");
	RUN.add("메론 , 초록");
	RUN.add("포도 , 보라");
	RUN.add("맛있는 과일");
	
	for(int i = 0; i<= list.size(); i++) {
		System.out.println(list.get(i));
		}
	}

	

}
