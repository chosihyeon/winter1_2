package kr.ac.kopo.controller;

import java.util.List;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import kr.ac.kopo.dao.CommentDAO;
import kr.ac.kopo.vo.CommentVO;

public class CommentListController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		CommentDAO commentDAO = new CommentDAO();
		List<CommentVO> commentList= commentDAO.selectAll();
		request.setAttribute("commentList", commentList);

		return "/jsp/comment/list.jsp";
	}

}
