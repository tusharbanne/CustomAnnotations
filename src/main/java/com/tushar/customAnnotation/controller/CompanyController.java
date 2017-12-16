package com.tushar.customAnnotation.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import com.tushar.customAnnotation.dto.Department;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api
@Path("/services")
public class CompanyController {

	@Autowired
	CompanyControllerImpl companyControllerImpl;
	
	@POST
	@Produces({ MediaType.APPLICATION_JSON })
	@ApiOperation(value = "Responds with Discount Details", 
				notes = "Returns a JSON object with the requested data based on the action type",
				response = String.class)
	@ApiResponses(value = { @ApiResponse(code = 500, message = "yttftf") })
	public String getEmployeeDetails(@RequestBody Department department){
		return companyControllerImpl.getEmployeeDetails(department);
	}
	
}
