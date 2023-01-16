package com.coderscampus.philassignment10.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meals {
	@JsonProperty("id")
	private int id;
	@JsonProperty("imageType")
	private String imageType;
	@JsonProperty("title")
	private String title;
	@JsonProperty("readyInMinutes")
	private Integer readyInMinutes;
	@JsonProperty("servings")
	private Integer servings;
	@JsonProperty("sourceUrl")
	private String sourceUrl;

	public final int getId() {
		return id;
	}

	public final String getImageType() {
		return imageType;
	}

	public final String getTitle() {
		return title;
	}

	public final Integer getReadyInMinutes() {
		return readyInMinutes;
	}

	public final Integer getServings() {
		return servings;
	}

	public final String getSourceUrl() {
		return sourceUrl;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final void setImageType(String imageType) {
		this.imageType = imageType;
	}

	public final void setTitle(String title) {
		this.title = title;
	}

	public final void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}

	public final void setServings(Integer servings) {
		this.servings = servings;
	}

	public final void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}

	@Override
	public String toString() {
		return "Meals [id=" + id + ", imageType=" + imageType + ", title=" + title + ", readyInMinutes="
				+ readyInMinutes + ", servings=" + servings + ", sourceUrl=" + sourceUrl + "]";
	}

}
