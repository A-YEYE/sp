package kr.or.connect.sp.service.Impl;

import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.*;

import kr.or.connect.sp.dao.*;
import kr.or.connect.sp.dto.*;
import kr.or.connect.sp.service.*;
@Service
public class GuestbookServiceImpl implements GuestbookService {
	@Autowired
	GuestbookDao guestbookDao;
	
	@Autowired
	LogDao logDao;


	@Override
	@Transactional
	public List<Guestbook> selectAll(Integer start) {
		List<Guestbook> list = guestbookDao.selectAll(start, GuestbookService.LIMIT);
		return list;
	}


	@Override
	@Transactional(readOnly=false)
	public Guestbook insert(Guestbook guestbook, String ip) {
		guestbook.setRegdate(new Date());
		Long id = guestbookDao.insert(guestbook);
		
		Log log = new Log();
		log.setId(id);
		log.setIp(ip);
		log.setMethod("insert");
		log.setRegdate(new Date());
		Long num = logDao.insert(log);
		
		return guestbook;
	}
	
	@Override
	public Guestbook selectOne(Long id) {
		Guestbook guestbook = guestbookDao.selectOne(id);
		return guestbook;
	}

	@Override
	public Guestbook update(Long id) {
		Guestbook guestbook = guestbookDao.selectOne(id);
		return guestbook;
	}
	
	@Override
	@Transactional(readOnly = false)
	public int update2(Guestbook guestbook, String ip) {
		int updateCount = guestbookDao.update2(guestbook);
		
		Log log = new Log();
		log.setId(guestbook.getId());
		log.setIp(ip);
		log.setMethod("update");
		log.setRegdate(new Date());
		Long num = logDao.insert(log);
		
		return updateCount;
	}

	@Override
	public int delete(String ip, Long id) {
		int deleteCount = guestbookDao.delete(id);
		
		Log log = new Log();
		log.setId(id);
		log.setIp(ip);
		log.setMethod("delete");
		log.setRegdate(new Date());
		Long num = logDao.insert(log);
		
		return deleteCount;
	}


	@Override
	public int count() {
		return guestbookDao.count();
	}		
}
