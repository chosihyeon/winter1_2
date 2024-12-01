package kr.ac.kopo.vo;

import java.sql.Date;

import oracle.sql.NUMBER;

public class CommentVO {
	private int comment_no;
	private String user_id;
	private String movie_title;
	private String reply;
	private float rating;
	private int parent_comment_id;
	private Date comment_create_date;
	private Date comment_update_date;
	private boolean comment_delete;
	
	public CommentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommentVO(int comment_no, String user_id, String movie_title, String reply, float rating,
			int parent_comment_id, Date comment_create_date, Date comment_update_date, boolean comment_delete) {
		super();
		this.comment_no = comment_no;
		this.user_id = user_id;
		this.movie_title = movie_title;
		this.reply = reply;
		this.rating = rating;
		this.parent_comment_id = parent_comment_id;
		this.comment_create_date = comment_create_date;
		this.comment_update_date = comment_update_date;
		this.comment_delete = comment_delete;
	}

	/**
	 * @return the comment_no
	 */
	public int getComment_no() {
		return comment_no;
	}

	/**
	 * @param comment_no the comment_no to set
	 */
	public void setComment_no(int comment_no) {
		this.comment_no = comment_no;
	}

	/**
	 * @return the user_id
	 */
	public String getUser_id() {
		return user_id;
	}

	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	/**
	 * @return the movie_title
	 */
	public String getMovie_title() {
		return movie_title;
	}

	/**
	 * @param movie_title the movie_title to set
	 */
	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	/**
	 * @return the reply
	 */
	public String getReply() {
		return reply;
	}

	/**
	 * @param reply the reply to set
	 */
	public void setReply(String reply) {
		this.reply = reply;
	}

	/**
	 * @return the rating
	 */
	public float getRating() {
		return rating;
	}

	/**
	 * @param rating the rating to set
	 */
	public void setRating(float rating) {
		this.rating = rating;
	}

	/**
	 * @return the parent_comment_id
	 */
	public int getParent_comment_id() {
		return parent_comment_id;
	}

	/**
	 * @param parent_comment_id the parent_comment_id to set
	 */
	public void setParent_comment_id(int parent_comment_id) {
		this.parent_comment_id = parent_comment_id;
	}

	/**
	 * @return the comment_create_date
	 */
	public Date getComment_create_date() {
		return comment_create_date;
	}

	/**
	 * @param comment_create_date the comment_create_date to set
	 */
	public void setComment_create_date(Date comment_create_date) {
		this.comment_create_date = comment_create_date;
	}

	/**
	 * @return the comment_update_date
	 */
	public Date getComment_update_date() {
		return comment_update_date;
	}

	/**
	 * @param comment_update_date the comment_update_date to set
	 */
	public void setComment_update_date(Date comment_update_date) {
		this.comment_update_date = comment_update_date;
	}

	/**
	 * @return the comment_delete
	 */
	public boolean isComment_delete() {
		return comment_delete;
	}

	/**
	 * @param comment_delete the comment_delete to set
	 */
	public void setComment_delete(boolean comment_delete) {
		this.comment_delete = comment_delete;
	}

	@Override
	public String toString() {
		return "CommentVO [comment_no=" + comment_no + ", user_id=" + user_id + ", movie_title=" + movie_title
				+ ", reply=" + reply + ", rating=" + rating + ", parent_comment_id=" + parent_comment_id
				+ ", comment_create_date=" + comment_create_date + ", comment_update_date=" + comment_update_date
				+ ", comment_delete=" + comment_delete + "]";
	}
	
	 


}