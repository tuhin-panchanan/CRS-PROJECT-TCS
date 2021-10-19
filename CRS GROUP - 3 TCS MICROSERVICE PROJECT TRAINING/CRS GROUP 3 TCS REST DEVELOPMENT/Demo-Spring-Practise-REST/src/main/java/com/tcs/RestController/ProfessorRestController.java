/**
 * 
 */
package com.tcs.RestController;

import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.bean.Professor;

/**
 * @author ASUS
 *
 */

@RestController
public class ProfessorRestController {
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.GET, value="/viewEnrolledStudents")
	@ResponseBody
	public Professor viewEnrolledStudents() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@RequestMapping(produces = MediaType.APPLICATION_JSON, method = RequestMethod.POST, value="/addGrades")
	@ResponseBody
	public Professor addGrades() {
		// TODO Auto-generated method stub
		return null;
	}

}
