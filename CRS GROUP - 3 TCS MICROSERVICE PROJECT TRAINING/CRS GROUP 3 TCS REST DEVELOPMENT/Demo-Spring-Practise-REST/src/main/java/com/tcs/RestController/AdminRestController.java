/**
 * 
 */
package com.tcs.RestController;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Admin;

/**
 * @author ASUS
 *
 */
@RestController
public class AdminRestController {
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value="/addProfessor")
	@ResponseBody
	public Admin addProfessor() {
		// TODO Auto-generated method stub
		return null;
	}
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value="/approveStudent")
	@ResponseBody
	public Admin approveStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value="/assignCourse")
	@ResponseBody
	public Admin assignCourse() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value="/deleteCourse")
	@ResponseBody
	public Admin deleteCourse() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
