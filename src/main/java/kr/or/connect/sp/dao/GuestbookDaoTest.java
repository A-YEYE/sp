package kr.or.connect.sp.dao;

import java.util.*;

import org.springframework.context.*;
import org.springframework.context.annotation.*;

import kr.or.connect.sp.config.*;
import kr.or.connect.sp.dto.*;

public class GuestbookDaoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);	
		GuestbookDao gd = ac.getBean(GuestbookDao.class);
		
		Guestbook guestbook = new Guestbook();
		
//		<insert>
//		guestbook.setName("별님이");
//		guestbook.setSubject("아프거든?");
//		guestbook.setContent("옷사러가자");
//		guestbook.setRegdate(new Date());
//		Long id = gd.insert(guestbook);
//		System.out.println(id);
		
//		<update>
//		: id만 꼭 넣어주고 subject, content는 바꿀 내용만 넣어주면 됨.
//		guestbook.setId(1L);
//		guestbook.setContent("만원");
//		int updateCount = gd.update(guestbook);
//		System.out.println(updateCount);
		
//		<selectOne>
//		guestbook = gd.selectOne(1L);
//		System.out.println(guestbook);
		
//		<delete>
		int deletCount = gd.delete(1L);
		
//		<selectAll>
		List<Guestbook> list = gd.selectAll(0, 10);
		for(Guestbook gg : list) {
			System.out.println(gg);
		}
		
//		<count>
		int count = gd.count();
		System.out.println(count);

	}

}
