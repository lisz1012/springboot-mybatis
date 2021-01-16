package com.lisz.mapper;

import com.lisz.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao {
	public User getById(@Param("id") int id);
	public List<User> selecttAll();
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteById(@Param("id") int id);
}
