package com.blog.cavalr.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.blog.cavalr.service.UserService;

public class UserRowMapper  implements RowMapper<User> {
	
	  @Autowired
	    private UserService userService;

        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        	User paiement = new User();
        	if(rs!=null)
        	{
paiement.setUserName(String.valueOf(rs.getString("userName")+"-updated"));
userService.saveUser(paiement);
        	}
                return paiement;
        
        }
        }