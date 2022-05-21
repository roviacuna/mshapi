package com.msh.mshapi.dao;


import com.msh.mshapi.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<User, String> {

}
