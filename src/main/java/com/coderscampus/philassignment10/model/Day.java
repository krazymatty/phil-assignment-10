package com.coderscampus.philassignment10.model;

import java.util.List;

public class Day {
	private List<Meals> meals;
	private Nutrients nutrients;

	public final List<Meals> getMeals() {
		return meals;
	}

	public final Nutrients getNutrients() {
		return nutrients;
	}

	public final void setMeals(List<Meals> meals) {
		this.meals = meals;
	}

	public final void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}

	@Override
	public String toString() {
		return "Day [meals=" + meals + ", nutrients=" + nutrients + "]";
	}

}
