package kr.ac.kopo.vo;

import java.sql.Date;

public class UserVO {
	private String user_id;
	private String user_nm;
	private String user_em;
	private String user_pwd;
	private String user_ph;
	private String user_im;
	private Date user_create_date;
	
	public UserVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserVO(String user_id, String user_nm, String user_em, String user_pwd, String user_ph, String user_im,
			Date user_create_date) {
		super();
		this.user_id = user_id;
		this.user_nm = user_nm;
		this.user_em = user_em;
		this.user_pwd = user_pwd;
		this.user_ph = user_ph;
		this.user_im = user_im;
		this.user_create_date = user_create_date;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_nm() {
		return user_nm;
	}

	public void setUser_nm(String user_nm) {
		this.user_nm = user_nm;
	}

	public String getUser_em() {
		return user_em;
	}

	public void setUser_em(String user_em) {
		this.user_em = user_em;
	}

	public String getUser_pwd() {
		return user_pwd;
	}

	public void setUser_pwd(String user_pwd) {
		this.user_pwd = user_pwd;
	}

	public String getUser_ph() {
		return user_ph;
	}

	public void setUser_ph(String user_ph) {
		this.user_ph = user_ph;
	}

	public String getUser_im() {
		return user_im;
	}

	public void setUser_im(String user_im) {
		this.user_im = user_im;
	}

	public Date getUser_create_date() {
		return user_create_date;
	}

	public void setUser_create_date(Date user_create_date) {
		this.user_create_date = user_create_date;
	}

	@Override
	public String toString() {
		return "UserVO [user_id=" + user_id + ", user_nm=" + user_nm + ", user_em=" + user_em + ", user_pwd=" + user_pwd
				+ ", user_ph=" + user_ph + ", user_im=" + user_im + ", user_create_date=" + user_create_date + "]";
	}
	
}
