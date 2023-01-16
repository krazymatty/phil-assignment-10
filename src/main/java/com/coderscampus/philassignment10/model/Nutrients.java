package com.coderscampus.philassignment10.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Nutrients {
	@JsonProperty("calories")
	private Long calories;
	@JsonProperty("protein")
	private Long protein;
	@JsonProperty("fat")
	private Long fat;
	@JsonProperty("carbohydreates")
	private Long carbohydreates;

	public final Long getCalories() {
		return calories;
	}

	public final Long getProtein() {
		return protein;
	}

	public final Long getFat() {
		return fat;
	}

	public final Long getCarbohydreates() {
		return carbohydreates;
	}

	public final void setCalories(Long calories) {
		this.calories = calories;
	}

	public final void setProtein(Long protein) {
		this.protein = protein;
	}

	public final void setFat(Long fat) {
		this.fat = fat;
	}

	public final void setCarbohydreates(Long carbohydreates) {
		this.carbohydreates = carbohydreates;
	}

	@Override
	public String toString() {
		return "Nutrients [calories=" + calories + ", protein=" + protein + ", fat=" + fat + ", carbohydreates="
				+ carbohydreates + "]";
	}

}
