package kr.or.connect.sp.dto;

import java.util.*;

public class Guestbook {
	private Long id;
	private String name;
	private String subject;
	private String content;
	private Date regdate;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	@Override
	public String toString() {
		return "Guestbook [id=" + id + ", name=" + name + ", subject=" + subject + ", content=" + content + ", regdate="
				+ regdate + "]";
	}
}
