package com.sudha.tech;

public class Author {

	private String authorName;
	private String authorEmail;
	private Long authorPhn;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorEmail() {
		return authorEmail;
	}

	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}

	public Long getAuthorPhn() {
		return authorPhn;
	}

	public void setAuthorPhn(Long authorPhn) {
		this.authorPhn = authorPhn;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", authorEmail=" + authorEmail + ", authorPhn=" + authorPhn + "]";
	}

}
