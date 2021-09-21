package com.javatechie.couchbase.api.model;

import lombok.*;
import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document
public class Beer{
	@Id private String id;
	@Field private String name;
	@Field private String city;
	@Field private String state;
	@Field private String code;
	@Field private String country;
	@Field private String phone;
	@Field private String website;
	@Field private String type;
	@Field private String updated;
	@Field private String description;
	@Field private List<String> address;
	@Field private Geo geo;
}

class Geo{
	@Field private String accuracy;
	@Field private double lat;
	@Field private double lon;
}
