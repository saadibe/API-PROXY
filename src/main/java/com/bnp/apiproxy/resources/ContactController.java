package com.bnp.apiproxy.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bnp.apiproxy.dto.ContactDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/apiproxy/contact")
@Api(value="contact",description="information of the contact")
public class ContactController {

	@ApiOperation(value = "returns all contact")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Sucess get all contact"),
							@ApiResponse(code = 400, message = "Bad Request "), 
							@ApiResponse(code = 403, message = "Forbidden "),
							@ApiResponse(code = 500, message = "Internal Server Error")})
	@GetMapping("/all")
	public List<ContactDTO> getAllContact() {
		
		return Arrays.asList(new ContactDTO(1L,"saadi","bechir","saadibechiring","0638396430"),
								new ContactDTO(2L,"saadi1","bechir1","saadibechiring1","06383964301"));

	}

	@ApiOperation(value = "add contact")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success add contact"),
			@ApiResponse(code = 400, message = "Bad Request "), 
			@ApiResponse(code = 403, message = "Forbidden "),
			@ApiResponse(code = 500, message = "Internal Server Error")})
	@PostMapping("/add")
	public String addContact(@RequestBody final String hello) {
		return "ADD";
	}

	@ApiOperation(value = "update contact")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success update contact"),
			@ApiResponse(code = 400, message = "Bad Request "), 
			@ApiResponse(code = 403, message = "Forbidden "),
			@ApiResponse(code = 500, message = "Internal Server Error")})
	@PostMapping("/update/{id}")
	public String updateContact(@RequestBody final String hello, @PathVariable String id) {
		return "update";
	}

	@ApiOperation(value = "delete contact")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success delete contact"),
			@ApiResponse(code = 400, message = "Bad Request "), 
			@ApiResponse(code = 403, message = "Forbidden "),
			@ApiResponse(code = 500, message = "Internal Server Error")})
	@GetMapping("/delete/{id}")
	public String deleteContact(@RequestBody final String hello) {
		return "delete";
	}
}
