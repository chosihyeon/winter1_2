package kr.ac.kopo.controller;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.ac.kopo.dao.MovieDAO;
import kr.ac.kopo.vo.MovieVO;

public class MovieDetailController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String movieTitle = request.getParameter("movie_title");
		
		movieTitle = URLDecoder.decode(movieTitle,StandardCharsets.UTF_8);
		
		MovieDAO dao = new MovieDAO();
		MovieVO movie= dao.movieSelectOne(movieTitle);
		
		
		request.setAttribute("movie", movie);
		
		
		
		return "/jsp/movie/detail.jsp";
	}

}
