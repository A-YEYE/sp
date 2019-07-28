package kr.or.connect.sp.service;

import java.util.*;

import kr.or.connect.sp.dto.*;

public interface GuestbookService {
	public static final Integer LIMIT = 5;
	public List<Guestbook> selectAll(Integer start);
	public Guestbook insert(Guestbook guestbook, String ip);
	public Guestbook selectOne(Long id);
	public Guestbook update(Long id);
	public int update2(Guestbook guestbook, String ip);
	public int delete(String ip, Long id);
	public int count();
}
