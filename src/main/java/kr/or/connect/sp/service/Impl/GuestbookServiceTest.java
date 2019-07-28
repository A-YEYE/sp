package kr.or.connect.sp.service.Impl;

import java.util.*;

import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.web.context.support.*;

import kr.or.connect.sp.config.*;
import kr.or.connect.sp.dto.*;
import kr.or.connect.sp.service.*;

public class GuestbookServiceTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		GuestbookService service = ac.getBean(GuestbookService.class);
		
		Guestbook guestbook = new Guestbook();
		
//		<insert>
//		guestbook.setName("칭긔칭구");
//		guestbook.setSubject("눈썹문신");
//		guestbook.setContent("앗 노ㅜㅜㅜ");	
//		service.insert(guestbook, "127.0.0.1");
		
//		<selectOne>
//		guestbook = service.selectOne(5L);
//		System.out.println(guestbook);
		
//		<update>
//		guestbook = null;
//		guestbook = service.update(5L);
//		System.out.println(guestbook);
		
//		<update2>
//		guestbook.setSubject("나 끝나쬬");
//		guestbook.setContent("없어그냥");
//		service.update2(guestbook, "127.0.0.1");
//		System.out.println(guestbook);
		
//		<selectAll>
//		List<Guestbook> list = service.selectAll(0);
//		for(Guestbook gg : list) {
//			System.out.println(gg);
//		}
		
//		<delete>
//		guestbook = null;
//		int deleteCount = service.delete("127.0.0.1", 5L);
//		System.out.println(deleteCount);
		
//		<count>
		int count = service.count();
		System.out.println(count);
	}

}
