

package com.tworks.controller;

import java.rmi.RemoteException;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.util.UriComponentsBuilder;

import com.tworks.dao.UserService;
import com.tworks.domain.User;

@RestController
@RequestMapping("/service/user/")
public class UserController {

	// UserService userService=new UserService();
	UserService _userService = new UserService();
	CityServiceImplProxy _saopCity = new CityServiceImplProxy();

	@RequestMapping(value = "{valids}", method = RequestMethod.GET, headers = "Accept=application/json")
	public User getUser1(@PathVariable String valids) {
		User user =null; //_userService.getUserById(id);
		System.out.println("////");
		return user;
	}

	
	@RequestMapping(method = RequestMethod.GET, headers = "Accept=application/json")
	public List<User> getAllUsers() throws RemoteException {
		User _User=new User();
		List<User> users = _userService.getAllUsers();
		/*_User.setTitle("SOAP");
		_User.setDescription("Soap Implementation at client");
		_User.setCircle_code(_saopCity.getCity(1).getCircle_code());
		_User.setState_name((_saopCity.getCity(1).getState_name()));
		_User.setCity_name((_saopCity.getCity(1).getCity_name()));
		_User.setCity_id((_saopCity.getCity(1).getId()));
*/
		users.add(_User);
	System.out.println(_saopCity.getAllCity().toString());

		return users;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> create(@RequestBody User user,
			UriComponentsBuilder ucBuilder) {
		System.out.printf("creating new user: {}", user);

		if (_userService.exists(user)) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		_userService.insertNotificy(user);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/user/{id}")
				.buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	
	@RequestMapping(value = "{valids}",method = RequestMethod.POST)
	public ResponseEntity<Void> validate(@RequestBody User user,
			UriComponentsBuilder ucBuilder) {
		System.out.printf("creating new user: {}", user);

		if (_userService.exists(user)) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		boolean valid=_userService.validate(user);
if (valid==true){
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/user/{id}")
				.buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.ACCEPTED);
		
	}else{
		HttpHeaders headers = new HttpHeaders();
	headers.setLocation(ucBuilder.path("/user/{id}")
			.buildAndExpand(user.getId()).toUri());
	return new ResponseEntity<Void>(headers, HttpStatus.UNAUTHORIZED);
		}
	}
	

}
