# BackendAssessment

# Features

POST : http://localhost:8080/api/cardetail/register
  - You need to update Stub Values : VinSpecificationSearchService.createResponseEntity()
  
  - Request parameters

{ 

    "vin":"4F2YU09161KM33121", 

    "car_value":9999999, 

    "current_mileage":999999, 

    "vehicle_description":"This car has various features", 

    "vehicle_color":"Red", 

    "delete_flg":"0" 

} 

GET : http://localhost:8080/api/cardetail/find?id=1 

GET : http://localhost:8080/api/cardetail/findAll 

PUT: http://localhost:8080/api/cardetail/update 

  - Request parameters
  
{ 

    "id":1, 

    "vin":"4F2YU09161KM33177", 

    "car_value":9999977, 

    "current_mileage":999977, 

    "vehicle_description":"This car has various features7", 

    "vehicle_color":"Red7", 

    "delete_flg":"1" 

} 

DELETE : http://localhost:8080/api/cardetail/delete?id=1

# Database

Utilize car_shair.sql

# ISSUES
It is necessary to acquire authorization from ClearVin to access External API.



