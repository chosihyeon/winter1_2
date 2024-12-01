package kr.ac.kopo.vo;

import java.sql.Date;

public class MovieVO {

	private String movie_title;
	private String movie_poster;
	private int movie_runtime;
	private String movie_platform;
	private Date release_date;
	private float rating_avg;
	public MovieVO(String movie_title, String movie_poster, int movie_runtime, String movie_platform, Date release_date,
			float rating_avg) {
		super();
		this.movie_title = movie_title;
		this.movie_poster = movie_poster;
		this.movie_runtime = movie_runtime;
		this.movie_platform = movie_platform;
		this.release_date = release_date;
		this.rating_avg = rating_avg;
	}
	public MovieVO() {
		super();
		// TODO Auto-generated constructor stub
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
	 * @return the movie_poster
	 */
	public String getMovie_poster() {
		return movie_poster;
	}
	/**
	 * @param movie_poster the movie_poster to set
	 */
	public void setMovie_poster(String movie_poster) {
		this.movie_poster = movie_poster;
	}
	/**
	 * @return the movie_runtime
	 */
	public int getMovie_runtime() {
		return movie_runtime;
	}
	/**
	 * @param movie_runtime the movie_runtime to set
	 */
	public void setMovie_runtime(int movie_runtime) {
		this.movie_runtime = movie_runtime;
	}
	/**
	 * @return the movie_platform
	 */
	public String getMovie_platform() {
		return movie_platform;
	}
	/**
	 * @param movie_platform the movie_platform to set
	 */
	public void setMovie_platform(String movie_platform) {
		this.movie_platform = movie_platform;
	}
	/**
	 * @return the release_date
	 */
	public Date getRelease_date() {
		return release_date;
	}
	/**
	 * @param release_date the release_date to set
	 */
	public void setRelease_date(Date release_date) {
		this.release_date = release_date;
	}
	/**
	 * @return the rating_avg
	 */
	public float getRating_avg() {
		return rating_avg;
	}
	/**
	 * @param rating_avg the rating_avg to set
	 */
	public void setRating_avg(float rating_avg) {
		this.rating_avg = rating_avg;
	}
	@Override
	public String toString() {
		return "MovieVO [movie_title=" + movie_title + ", movie_poster=" + movie_poster + ", movie_runtime="
				+ movie_runtime + ", movie_platform=" + movie_platform + ", release_date=" + release_date
				+ ", rating_avg=" + rating_avg + "]";
	}
	
	
	
}
