package kr.ac.kopo.vo;

public class LikeVO {
	private int like_no;
	private int user_no;
	private int movie_title;
	
	public LikeVO(int like_no, int user_no, int movie_title) {
		super();
		this.like_no = like_no;
		this.user_no = user_no;
		this.movie_title = movie_title;
	}

	public LikeVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getLike_no() {
		return like_no;
	}

	public void setLike_no(int like_no) {
		this.like_no = like_no;
	}

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public int getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(int movie_title) {
		this.movie_title = movie_title;
	}

	@Override
	public String toString() {
		return "LikeVO [like_no=" + like_no + ", user_no=" + user_no + ", movie_title=" + movie_title + "]";
	}
	
	
	
	
	
}
