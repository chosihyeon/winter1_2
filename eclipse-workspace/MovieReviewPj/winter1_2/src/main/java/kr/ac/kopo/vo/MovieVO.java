package kr.ac.kopo.vo;

import java.sql.Date;

public class MovieVO {

	private String movie_title;
	private String movie_posterImage;
	private int movie_runtime;
	private String movie_platform;
	private Date release_date;
	private float rating_avg;
	
	
	public MovieVO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public MovieVO(String movie_title, String movie_posterImage, int movie_runtime, String movie_platform,
			Date release_date, float rating_avg) {
		super();
		this.movie_title = movie_title;
		this.movie_posterImage = movie_posterImage;
		this.movie_runtime = movie_runtime;
		this.movie_platform = movie_platform;
		this.release_date = release_date;
		this.rating_avg = rating_avg;
	}


	public String getMovie_title() {
		return movie_title;
	}


	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}


	public String getMovie_posterImage() {
		return movie_posterImage;
	}


	public void setMovie_posterImage(String movie_posterImage) {
		this.movie_posterImage = movie_posterImage;
	}


	public int getMovie_runtime() {
		return movie_runtime;
	}


	public void setMovie_runtime(int movie_runtime) {
		this.movie_runtime = movie_runtime;
	}


	public String getMovie_platform() {
		return movie_platform;
	}


	public void setMovie_platform(String movie_platform) {
		this.movie_platform = movie_platform;
	}


	public Date getRelease_date() {
		return release_date;
	}


	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}


	public float getRating_avg() {
		return rating_avg;
	}


	public void setRating_avg(float rating_avg) {
		this.rating_avg = rating_avg;
	}


	@Override
	public String toString() {
		return "MovieVO [movie_title=" + movie_title + ", movie_posterImage=" + movie_posterImage + ", movie_runtime="
				+ movie_runtime + ", movie_platform=" + movie_platform + ", release_date=" + release_date
				+ ", rating_avg=" + rating_avg + "]";
	}
	
	
	
}
