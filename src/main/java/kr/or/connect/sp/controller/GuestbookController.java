package kr.or.connect.sp.controller;

import java.util.*;

import javax.servlet.http.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

import kr.or.connect.sp.dto.*;
import kr.or.connect.sp.service.*;

@Controller
public class GuestbookController {
	@Autowired
	GuestbookService service;
	
	@GetMapping(path="/list")
	public String list(@RequestParam(name="start", required=false, defaultValue="0")int start,
						ModelMap model) {
		
		// 전체 리스트 구하기
		List<Guestbook> list = service.selectAll(start);
		model.addAttribute("list", list);
		
		// 페이징
		int count = service.count();
		int pageCount = service.count() / service.LIMIT;
		if(service.count()/service.LIMIT > 0) pageCount++;
		
		List<Integer> pageStartList = new ArrayList<>();
		for(int i=0; i<pageCount; i++) {
			pageStartList.add(i*service.LIMIT);
		}
		
		model.addAttribute("count", count);
		model.addAttribute("pageStartList", pageStartList);
				
		return "list";
	}
	
	@GetMapping(path="/write")
	public String list() {
		return "write";
	}
	
	@PostMapping(path="/list")
	public String write(@ModelAttribute Guestbook guestbook,
							HttpServletRequest request) {
		String clientIp = request.getRemoteAddr();
		service.insert(guestbook, clientIp);
		
		return "redirect:list";
	}
	
	@GetMapping(path="/detail")
	public String detail(@RequestParam(name="id", required=false)Long id,	
						ModelMap model) {
		
		Guestbook guestbook = service.selectOne(id);

		model.addAttribute("id", guestbook.getId());
		model.addAttribute("content",  guestbook.getContent());
		model.addAttribute("name", guestbook.getName());
		model.addAttribute("subject", guestbook.getSubject());
		
		return "detail";
	}
	
	@GetMapping(path="/update")
	public String update(@RequestParam(name="id", required=false)Long id,	
							ModelMap model,
							HttpServletRequest request) {
		String clientIp = request.getRemoteAddr();
		
		Guestbook guestbook = service.update(id);
		
		model.addAttribute("id", guestbook.getId());
		model.addAttribute("content",  guestbook.getContent());
		model.addAttribute("name", guestbook.getName());
		model.addAttribute("subject", guestbook.getSubject());
		
		return "update";
	}
	
	@PostMapping(path="/update2")
	public String update2(@ModelAttribute Guestbook guestbook,	
							ModelMap model,
							HttpServletRequest request) {
		String clientIp = request.getRemoteAddr();
		
		int updateCount = service.update2(guestbook, clientIp);
		
		return "update2";
	}
	
	@GetMapping(path="/delete")
	public String delete(@RequestParam(name="id", required=true)Long id,
					HttpServletRequest request) {
		String clientIp = request.getRemoteAddr();
		int deleteCount = service.delete(clientIp, id);
		return "redirect:list";
	}
}
