package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "vin")
@Data
public class VinSpecificationEntity {

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
	
	private String status;
	
	private String message;
	
	@Column(name = "report_id")
	private String ReportId;
	
	@Column(name = "report_vin")
	private String ReportVin;
	
	@Column(name = "report_report")
	private String ReportReport;
	
	private String year;

	private String make;

	private String model;

	private String trim_level;

	private String engine;

	private String style;

	private String made_in;

	private String steering_type;

	private String anti_brake_system;

	private String tank_size;

	private String overall_height;

	private String overall_length;

	private String overall_width;

	private String standard_seating;

	private String optional_seating;

	private String highway_mileage;

	private String city_mileage;

    private String license_plate;

    private String registration;

    private String registration_state;

    private String registration_expiration;

    private String name_on_registration;

}