package com.yash.yota.web;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.yota.command.LoginCommand;
import com.yash.yota.domain.User;
import com.yash.yota.exception.InvalidLoginNameAndPassword;
import com.yash.yota.service.MapValidationErrorService;
import com.yash.yota.service.UserService;

@RestController
@RequestMapping("/login")
@CrossOrigin
public class LoginController {

	@Autowired
	private UserService userService;

	@Autowired
	private MapValidationErrorService validationService;

	@PostMapping("")
	public ResponseEntity<?> createTestSetting(@Valid @RequestBody LoginCommand loginCommand, BindingResult result) {
		User user;
		ResponseEntity<?> mapError = validationService.mapValdiationRrror(result);
		if (mapError != null) {
			return mapError;
		}
		try {
			user = userService.authenticate(loginCommand);
			return new ResponseEntity<User>(user, HttpStatus.FOUND);
		} catch (InvalidLoginNameAndPassword ex) {
			Map<String, String> errorMap = new HashMap<>();
			errorMap.put("error", ex.getMessage());
			return new ResponseEntity<Map>(errorMap, HttpStatus.BAD_REQUEST);
		}

	}

	/*
	 * @PostMapping("") public ResponseEntity<?>
	 * createTestSetting(@Valid @RequestBody TestSetting testSetting,BindingResult
	 * result) { ResponseEntity<?> mapError =
	 * validationService.mapValdiationRrror(result); if(mapError!=null) { return
	 * mapError; } return new ResponseEntity<TestSetting>(
	 * testSettingService.saveOrUpdate(testSetting),HttpStatus.CREATED); }
	 * 
	 * @GetMapping("/{id}") public ResponseEntity<TestSetting>
	 * getTestSettingByid(@PathVariable int id) { return new
	 * ResponseEntity<TestSetting>(testSettingService.findByid(id),HttpStatus.FOUND)
	 * ; }
	 * 
	 * @GetMapping("") public ResponseEntity<?> getAllTestSetting() { return new
	 * ResponseEntity<Iterable<TestSetting>>(testSettingService.findAll(),HttpStatus
	 * .FOUND); }
	 * 
	 * 
	 * @DeleteMapping("/{id}") public ResponseEntity<?>
	 * deleteTestSettingByTestSettingIdentifier(@PathVariable int id) { return new
	 * ResponseEntity<TestSetting>(testSettingService.deleteTestSetting(id),
	 * HttpStatus.OK); }
	 * 
	 * @PutMapping("") public ResponseEntity<?>
	 * updateTestSetting(@Valid @RequestBody TestSetting testSetting,BindingResult
	 * result) { return createTestSetting(testSetting, result); }
	 */
}
