package co.micol.pj;

import co.micol.pj.friend.CompanyFriend;
import co.micol.pj.friend.Friend;
import co.micol.pj.friend.SchoolFriend;

public class MainApp {
	public static void main(String[] args) {
//		DoWhileTest doWhileTest = new DoWhileTest();
//		doWhileTest.run();
		
//	Animal man = new Man();
//	man.run();
//	man.sleep();
//	
//	Animal bird = new bird();
//	bird.run();
//	bird.sleep();
//	
//	Man man2 = new Man();
//	man2.sleep();
//	man2.run();
	
	Friend schoolFriend = new SchoolFriend();
	schoolFriend.name = "홍길동";
	schoolFriend.tel ="010-111-1111";
	schoolFriend.address="대구광역시 중구";
	schoolFriend.friendPrint();
	
	Friend comFriend = new CompanyFriend();
	comFriend.name = "홍길순";
	comFriend.tel="010-222-2222";
	comFriend.address="서울특별시 종로구";
	comFriend.friendPrint();
	}
}
