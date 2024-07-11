package com.rocketseat.planner.trip;

import java.util.List;

public record TripRequestPayLoad(String destination, String starts_at, String ends_at, List<String> emails_to_invited,String owner_email,String owner_name) {
}