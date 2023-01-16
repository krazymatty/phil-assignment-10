package com.coderscampus.philassignment10.model;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {
	@JsonProperty("meals")
	private ArrayList<Meals> meals;

	@JsonProperty("nutrients")
	private Nutrients nutrients;

	@JsonProperty("day")
	private Day day;

	@JsonProperty("week")
	private Week week;

	public final ArrayList<Meals> getMeals() {
		return meals;
	}

	public final Nutrients getNutrients() {
		return nutrients;
	}

	public final Day getDay() {
		return day;
	}

	public final Week getWeek() {
		return week;
	}

	public final void setMeals(ArrayList<Meals> meals) {
		this.meals = meals;
	}

	public final void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

	public final void setDay(Day day) {
		this.day = day;
	}

	public final void setWeek(Week week) {
		this.week = week;
	}

}
