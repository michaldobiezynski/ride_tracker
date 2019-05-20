package com.pluralsight.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.pluralsight.model.Ride;

import org.junit.Test;

public class RestControllerTest {

	@Test(timeout=90000)
	public void testCreateRide() {
		RestTemplate restTemplate = new RestTemplate();

		Ride ride = new Ride();
		ride.setName("Yellowfork Trail");
		ride.setDuration(33);

		//restTemplate.put("http://localhost:8080/ride_tracker_war/ride", ride);

		ride = restTemplate.postForObject("http://localhost:8080/ride_tracker_war/ride", ride, Ride.class);

		System.out.println("Ride: " + ride);
	}

	@Test(timeout=90000)
	public void testGetRides() {
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<List<Ride>> ridesResponse = restTemplate.exchange(
				"http://localhost:8080/ride_tracker_war/rides", HttpMethod.GET,
				null, new ParameterizedTypeReference<List<Ride>>() {
				});
		List<Ride> rides = ridesResponse.getBody();

		for (Ride ride : rides) {
			System.out.println("Ride name: " + ride.getName());
		}
	}

	@Test(timeout=90000)
	public void testGetRide() {
		RestTemplate restTemplate = new RestTemplate();

		Ride ride = restTemplate.getForObject("http://localhost:8080/ride_tracker_war/ride/1", Ride.class);

		System.out.println("Ride name: " + ride.getName());
	}

	@Test(timeout=90000)
	public void testUpdateRide() {
		RestTemplate restTemplate = new RestTemplate();

		Ride ride = restTemplate.getForObject("http://localhost:8080/ride_tracker_war/ride/1", Ride.class);

		ride.setDuration(ride.getDuration() + 1);

		restTemplate.put("http://localhost:8080/ride_tracker_war/ride/1", ride);

		System.out.println("Ride name: " + ride.getName());
	}

	@Test(timeout=90000)
	public void testBatchUpdate() {
		RestTemplate restTemplate = new RestTemplate();

		restTemplate.getForObject("http://localhost:8080/ride_tracker_war/batch", Object.class);

	}

	@Test(timeout=90000)
	public void testDelete() {
		RestTemplate restTemplate = new RestTemplate();

		restTemplate.delete("http://localhost:8080/ride_tracker_war/delete/11");
	}

	@Test(timeout=90000)
	public void testException() {
		RestTemplate restTemplate = new RestTemplate();

		restTemplate.getForObject("http://localhost:8080/ride_tracker_war/test", Ride.class);



	}
}
