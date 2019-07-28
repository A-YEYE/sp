package kr.or.connect.sp.dao;

public class GuestbookSqls {
	public static final String SELECT_ALL = "SELECT id, name, subject, content, regdate FROM guestbook ORDER BY id DESC LIMIT :start, :limit";
	public static final String UPDATE2 = "UPDATE guestbook SET subject := subject, content =:content WHERE id =:id";
	public static final String DELETE = "DELETE FROM guestbook WHERE id =:id";
	public static final String SELECT_ONE = "SELECT id, name, subject, content, regdate FROM guestbook WHERE id =:id";
	public static final String COUNT = "SELECT count(*) FROM guestbook";
}
