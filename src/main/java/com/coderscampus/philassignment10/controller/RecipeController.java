package com.coderscampus.philassignment10.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.philassignment10.model.DayResponse;
import com.coderscampus.philassignment10.model.WeekResponse;
import com.coderscampus.philassignment10.service.DayMeals;
import com.coderscampus.philassignment10.service.WeekMeals;

@RestController
public class RecipeController {
	@Autowired
	private WeekMeals weekMeals;
	@Autowired
	private DayMeals dayMeals;
	@GetMapping("/mealplanner/week")
	public ResponseEntity<WeekResponse> getWeekMeals(
			@RequestParam(value = "timeFrame", defaultValue = "week", required = false) String timeFrame,
			@RequestParam(value = "targetCalories", required = false) Double targetCalories,
			@RequestParam(value = "diet", required = false) String diet,
			@RequestParam(value = "exclude", required = false) String exclude) {
		ResponseEntity<WeekResponse> printMeals = weekMeals.generateMeals(timeFrame, targetCalories, diet, exclude);
		return printMeals;
	}

	@GetMapping("/mealplanner/day")
	public ResponseEntity<DayResponse> getDayMeals(@RequestParam(value = "timeFrame", defaultValue = "day") String timeFrame,
			@RequestParam(value = "targetCalories", required = false) Double targetCalories,
			@RequestParam(value = "diet", required = false) String diet,
			@RequestParam(value = "exclude", required = false) String exclude) {
		ResponseEntity<DayResponse> printMeals = dayMeals.generateMeals(timeFrame, targetCalories, diet, exclude);
		return printMeals;
	}
}
