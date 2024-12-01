package kr.ac.kopo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.mybatis.MyConfig;
import kr.ac.kopo.vo.CommentVO;

public class CommentDAO {
	
	private SqlSession session;
	
	public CommentDAO() {
		session = new MyConfig().getInstance();
	}
	//전체게시글 조회 
	public List<CommentVO> selectAll() throws Exception{
		List<CommentVO> commentList = session.selectList("kr.ac.kopo.dao.CommentDAO.selectAll");
		System.out.println(commentList);
			return commentList;
	}
	
	
	
	
	private void insert() throws Exception{
		
		CommentVO comment = new CommentVO();
		comment.setUser_id("user03");
		comment.setMovie_title("센과 치히로의 행방불명");
		comment.setReply("하하 나의 인생영화야");
		session.insert("kr.ac.kopo.dao.CommentDAO.insert", comment);
		session.commit();//insert update delete;
		System.out.println("삽입완료..");
	}
	
	private void selectone() throws Exception{
	//3번 게시물을 누르면 그거에 대한 정보가 나옴 
	//게시물이 나옴 나올수 있는거는 0개에서 1개
	// 파라미터 타입이 기본자료형임  parameterType은 int에다가 넣는다.
	//CommentVO comment = session.selectOne("kr.ac.kopo.dao.CommentDAO.selectByNo", 3);
	//System.out.println(comment);
	
	CommentVO c = new CommentVO();
	c.setComment_no(3);
	CommentVO comment = session.selectOne("kr.ac.kopo.dao.CommentDAO.selectByNo", c.getComment_no());
	System.out.println(comment);
	//에러난 이후 3값을 넣었는데도 실행이 안되가지고 왜그러지 생각했는데 생각해보니까, 
	//출력하는것을 3으로 하고 있었음 
	}
	
	public void selectWhere() throws Exception{
		//영화제목이 센과 치히로일때 게시물 출력
		CommentVO b = new CommentVO();
		b.setMovie_title("센과 치히로의 행방불명");
		
		List<CommentVO> list
		=session.selectList("kr.ac.kopo.dao.CommentDAO.selectWhere", b);
		
		for(CommentVO comment: list) {
			System.out.println(comment);
		}
	}
	
	
	public void work() throws Exception {
		//mybatis 실행
		selectAll();
		//insert();
		//selectone();
		//selectWhere();
	}
	
	
	
}
