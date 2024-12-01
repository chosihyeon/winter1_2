package kr.ac.kopo.test;



import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import kr.ac.kopo.mybatis.MyConfig;

public class MybatisTest {

	/*@Test
	public void 전체게시글조회테스트() {
		CommentDAO dao = new CommentDAO();
		List<CommentVO> commentList;
		try {
			commentList = dao.selectAll();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		for (CommentVO com ment : commentList) {
//			System.out.println(comment);
//
//		}
	}*/

	@Test
	public void test() {
		SqlSession session = new MyConfig().getInstance();
		System.out.println(session);
		assertNotNull(session);
	}
	
	
//	@Test 
//	public void mybatis테스트() throws Exception{
//		CommentDAO dao = new CommentDAO();
//		
//		dao.work();
//		
//		
//	}
	

}
