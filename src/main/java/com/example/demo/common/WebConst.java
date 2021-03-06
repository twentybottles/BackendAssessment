package com.example.demo.common;

public interface WebConst {
	
    /** ---- Rest API STATUS ---- **/
	
	public static final String GET = "GET"; 

	public static final String POST = "POST"; 
    
	public static final String OK = "ok"; 

	public static final String ERROR = "error"; 

    /** ---- Internal API ---- **/
	
	public static final String CARDETAIL_REGISTER_URL = "/api/cardetail/register";

	public static final String CARDETAIL_FIND_URL = "/api/cardetail/find";

	public static final String CARDETAIL_FINDALL_URL = "/api/cardetail/findAll";
	
	public static final String CARDETAIL_UPDATE_URL = "/api/cardetail/update";

	public static final String CARDETAIL_DELETE_URL = "/api/cardetail/delete";

	/** ---- External API ---- **/

	public static final String VIN_SPECIFICATION_LOGIN_URL = "https://www.clearvin.com/rest/vendor/login";

	public static final String VIN_SPECIFICATION_SEARCH_URL = "https://www.clearvin.com/rest/vendor/report?vin=";
	
	public static final String VIN_API_USERNAME = "riki.nakajima@gmail.com";

	public static final String VIN_API_PASSWORD = "B4tdSSi";
	
    /** ---- Defined Host ---- **/

	public static final String LOCAL_HOST_3000 = "http://localhost:3000";

}