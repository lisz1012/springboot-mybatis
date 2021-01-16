package com.lisz.controller;

import com.lisz.entity.User;
import com.lisz.mapper.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
	@Autowired
	private UserDao userDao;

	@GetMapping("/user/{id}")
	public User getById(@PathVariable("id") int id){
		return userDao.getById(id);
	}

	@GetMapping("/user/selectAll")
	public List<User> selecttAll(){
		return userDao.selecttAll();
	}

	@PostMapping("/user/add")
	public void addUser(User user){
		userDao.addUser(user);
	}

	@PutMapping("/user/update")
	public void updateUser(User user){
		userDao.updateUser(user);
	}

	@DeleteMapping("/user/delete/{id}")
	public void deleteById(@PathVariable("id") int id) {
		userDao.deleteById(id);
	}
}
