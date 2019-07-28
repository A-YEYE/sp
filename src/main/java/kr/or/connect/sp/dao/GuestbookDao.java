package kr.or.connect.sp.dao;

import static kr.or.connect.sp.dao.GuestbookSqls.SELECT_ALL;
import static kr.or.connect.sp.dao.GuestbookSqls.UPDATE2;
import static kr.or.connect.sp.dao.GuestbookSqls.DELETE;
import static kr.or.connect.sp.dao.GuestbookSqls.SELECT_ONE;
import static kr.or.connect.sp.dao.GuestbookSqls.UPDATE2;
import static kr.or.connect.sp.dao.GuestbookSqls.COUNT;

import java.util.*;

import javax.sql.*;

import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.namedparam.*;
import org.springframework.jdbc.core.simple.*;
import org.springframework.stereotype.*;

import kr.or.connect.sp.dto.*;

@Repository
public class GuestbookDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Guestbook> rowMapper = BeanPropertyRowMapper.newInstance(Guestbook.class);
	
	public GuestbookDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource)
								.withTableName("guestbook")
								.usingGeneratedKeyColumns("id");
	}
	
//	<insert>
	public Long insert(Guestbook guestbook) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(guestbook);
		return insertAction.executeAndReturnKey(params).longValue();
	}
	
//	<update>
	public Guestbook update(Long id) {
		Map params = Collections.singletonMap("id", id);
		Guestbook guestbook = jdbc.queryForObject(UPDATE2, params, rowMapper);
		return guestbook;
	}
	
//	<update2>
	public int update2(Guestbook guestbook) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(guestbook);
		return jdbc.update(UPDATE2, params);
	}
	
//	<selectOne>
	public Guestbook selectOne(Long id) {
		Map params = Collections.singletonMap("id", id);
		Guestbook guestbook = jdbc.queryForObject(SELECT_ONE, params, rowMapper);
		return guestbook;	
	}
	
//	<delete>
	public int delete(Long id) {
		Map<String, ?> params = Collections.singletonMap("id", id);
		return jdbc.update(DELETE, params);
	}
	
	
//	<select All>
	public List<Guestbook> selectAll(Integer start, Integer limit){
		Map<String, Integer> params = new HashMap<>();
		params.put("start", start);
		params.put("limit", limit);
		return jdbc.query(SELECT_ALL, params, rowMapper);
	}
	
	public int count() {
		return jdbc.queryForObject(COUNT, Collections.emptyMap(), Integer.class);
	}
	
}
