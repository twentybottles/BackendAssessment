package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Table(name = "car_shair")
@Data
public class CarDetailEntity {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

	@Size(min = 17, max = 17)
	private String vin;

	@OneToOne
	private VinSpecificationEntity vinSpecification;

	@Min(0)
	@Max(9999999)
	private int car_value;

	@Min(0)
	@Max(999999)
	private int current_mileage;

	@Size(min = 0, max = 255)
	private String vehicle_description;

	@Size(min = 1, max = 10)
	private String vehicle_color;

	@Size(min = 1, max = 1)
	private String delete_flg;

	private String updated_timestamp;

	@Column(updatable = false)
	private String created_timestamp;

}