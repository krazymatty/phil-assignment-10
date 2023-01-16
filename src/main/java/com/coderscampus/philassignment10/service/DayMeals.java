package com.coderscampus.philassignment10.service;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.philassignment10.config.ApplicationConfiguration;
import com.coderscampus.philassignment10.model.DayResponse;
import com.coderscampus.philassignment10.model.Meals;

@Service
public class DayMeals {
	@Autowired
	ApplicationConfiguration applicationConfiguration;
	String baseUrl;
	String mealPlan;
	String apiKey;
	List<Meals> printMeals = new ArrayList<>();

	@PostConstruct
	public void initialize() {
		baseUrl = applicationConfiguration.getBaseUrl();
		mealPlan = applicationConfiguration.getMealPlan();
		apiKey = applicationConfiguration.getApiKey();
	}

	public ResponseEntity<DayResponse> generateMeals(String timeFrame, Double targetCalories, String diet,
			String exclude) {
		if (timeFrame == null || timeFrame.isEmpty()) {
			timeFrame = "day";
		}
		if (targetCalories == null) {
			targetCalories = (double) 2000;
		}
		if (diet == null || diet.isEmpty()) {
			diet = "";
		}
		if (exclude == null || exclude.isEmpty()) {
			exclude = "";
		}

		RestTemplate rt = new RestTemplate();
		URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl + mealPlan).queryParam("timeFrame", timeFrame)
				.queryParam("targetCalories", targetCalories).queryParam("diet", diet).queryParam("exclude", exclude)
				.queryParam("apiKey", apiKey).build().toUri();
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);

		return response;

	}

}
