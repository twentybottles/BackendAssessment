package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "test7")
@Data
public class CarDetailEntity {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
//    @Column(name = "id")
    private Long id;

//	@Column(name = "vin")
	private String vin;

//	//	@JsonProperty("year")
//	@Column(name = "year")
//	private String year;
//
////	@JsonProperty("make")
//	@Column(name = "make")
//	private String make;
//
////	@JsonProperty("model")
//	@Column(name = "model")
//	private String model;
//
////	@JsonProperty("trim_level")
//	@Column(name = "trim_level")
//	private String trim_level;
//
////	@JsonProperty("engine")
//	@Column(name = "engine")
//	private String engine;
//
////	@JsonProperty("style")
//	@Column(name = "style")
//	private String style;
//
////	@JsonProperty("made_in")
//	@Column(name = "made_in")
//	private String made_in;
//
////	@JsonProperty("steering_type")
//	@Column(name = "steering_type")
//	private String steering_type;
//
////	@JsonProperty("anti_brake_system")
//	@Column(name = "anti_brake_system")
//	private String anti_brake_system;
//
////	@JsonProperty("tank_size")
//	@Column(name = "tank_size")
//	private String tank_size;
//
////	@JsonProperty("overall_height")
//	@Column(name = "overall_height")
//	private String overall_height;
//
////	@JsonProperty("overall_length")
//	@Column(name = "overall_length")
//	private String overall_length;
//
////	@JsonProperty("overall_width")
//	@Column(name = "overall_width")
//	private String overall_width;
//
////	@JsonProperty("standard_seating")
//	@Column(name = "standard_seating")
//	private String standard_seating;
//
////	@JsonProperty("optional_seating")
//	@Column(name = "optional_seating")
//	private String optional_seating;
//
////	@JsonProperty("highway_mileage")
//	@Column(name = "highway_mileage")
//	private String highway_mileage;
//
////	@JsonProperty("city_mileage")
//	@Column(name = "city_mileage")
//	private String city_mileage;
//
//
////    @Column(name = "license_plate")
//	@Column(name = "license_plate")
//    private String license_plate;
//
////    @Column(name = "registration")
//	@Column(name = "registration")
//    private String registration;
//
////    @Column(name = "registration_state")
//	@Column(name = "registration_state")
//    private String registration_state;
//
////	@Column(name = "registration_expiration")
//	@Column(name = "registration_expiration")
//    private String registration_expiration;
//
////    @Column(name = "name_on_registration")
//	@Column(name = "name_on_registration")
//    private boolean name_on_registration;
//
////	@Column(name = "vin_specification")
////	private VinSpecificationEntity vinSpecification;
//
////	@Column(name = "car_value")
//	@Column(name = "car_value")
//	private int car_value;
//
////	@Column(name = "current_mileage")
//	@Column(name = "current_mileage")
//	private int current_mileage;
//
////	@Column(name = "vehicle_description")
//	@Column(name = "vehicle_description")
//	private String vehicle_description;
//
////	@Column(name = "vehicle_color")
//	@Column(name = "vehicle_color")
//	private String vehicle_color;
//
////	@Column(name = "delete_flg")
//	@Column(name = "delete_flg")
//	private String delete_flg;
//
////	@Column(name = "updated_timestamp")
//	@Column(name = "updated_timestamp")
//	private String updated_timestamp;
//
////	@Column(name = "created_timestamp")
//	@Column(name = "created_timestamp")
//	private String created_timestamp;

}