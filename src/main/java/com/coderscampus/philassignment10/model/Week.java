package com.coderscampus.philassignment10.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Week {
	@JsonProperty("monday")
	private Day monday;

	@JsonProperty("tuesday")
	private Day tuesday;

	@JsonProperty("wednesday")
	private Day wednesday;

	@JsonProperty("thursday")
	private Day thursday;

	@JsonProperty("friday")
	private Day friday;

	@JsonProperty("saturday")
	private Day saturday;

	@JsonProperty("sunday")
	private Day sunday;

	public final Day getMonday() {
		return monday;
	}

	public final Day getTuesday() {
		return tuesday;
	}

	public final Day getWednesday() {
		return wednesday;
	}

	public final Day getThursday() {
		return thursday;
	}

	public final Day getFriday() {
		return friday;
	}

	public final Day getSaturday() {
		return saturday;
	}

	public final Day getSunday() {
		return sunday;
	}

	public final void setMonday(Day monday) {
		this.monday = monday;
	}

	public final void setTuesday(Day tuesday) {
		this.tuesday = tuesday;
	}

	public final void setWednesday(Day wednesday) {
		this.wednesday = wednesday;
	}

	public final void setThursday(Day thursday) {
		this.thursday = thursday;
	}

	public final void setFriday(Day friday) {
		this.friday = friday;
	}

	public final void setSaturday(Day saturday) {
		this.saturday = saturday;
	}

	public final void setSunday(Day sunday) {
		this.sunday = sunday;
	}

}
