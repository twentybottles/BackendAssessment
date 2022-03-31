package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "vin_specification")
@Data
public class VinSpecificationEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

	@Column(length = 17)
	private String vin;

	@Column(length = 4)
	private String year;

	@Column(length = 20)
	private String make;

	@Column(length = 20)
	private String model;

	@Column(length = 2)
	private String trim_level;

	@Column(length = 64)
	private String engine;

	@Column(length = 64)
	private String style;

	@Column(length = 20)
	private String made_in;

	@Column(length = 20)
	private String steering_type;

	@Column(length = 7)
	private String anti_brake_system;

	@Column(length = 17)
	private String tank_size;

	@Column(length = 2)
	private String overall_height;

	@Column(length = 8)
	private String overall_length;

	@Column(length = 10)
	private String overall_width;

	@Column(length = 10)
	private String standard_seating;

	@Column(length = 4)
	private String optional_seating;

	@Column(length = 20)
	private String highway_mileage;

	@Column(length = 20)
	private String city_mileage;

	@Column(length = 7)
    private String license_plate;

	@Column(length = 17)
    private String registration;

	@Column(length = 2)
    private String registration_state;

	@Column(length = 8)
    private String registration_expiration;

	@Column(length = 64)
    private String name_on_registration;

}