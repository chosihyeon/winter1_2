package kr.ac.kopo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.mybatis.MyConfig;
import kr.ac.kopo.vo.MovieVO;

public class MovieDAO {
	
	private SqlSession session;
	
	public MovieDAO() {
		session = new MyConfig().getInstance();
	}
	//전체게시글 조회 
	public List<MovieVO> movieSelectAll() throws Exception{
		List<MovieVO> movieList = session.selectList("kr.ac.kopo.dao.MovieDAO.movieSelectAll");
		System.out.println(movieList);
			return movieList;
	}
	public MovieVO movieSelectOne(String movie_title) throws Exception{
			/*MovieVO m = new MovieVO();
			m.setMovie_title("Movie_title");
			MovieVO movie =session.selectOne("kr.ac.kopo.MovieDAO.movieSelectOne",m.getMovie_title());
			*/
		System.out.println("DAO로 전달된 movie_title: " + movie_title);
		MovieVO movie= session.selectOne("kr.ac.kopo.MovieDAO.movieSelectOne",movie_title);
		System.out.println("DB에서 조회된 MovieVO: " + movie); 
		return movie;
		
	} 
	
	
	
	

	public void work() throws Exception {
		//mybatis 실행
	movieSelectAll();
	movieSelectOne("센과 치히로의 행방불명");
}
	
	
	
}
