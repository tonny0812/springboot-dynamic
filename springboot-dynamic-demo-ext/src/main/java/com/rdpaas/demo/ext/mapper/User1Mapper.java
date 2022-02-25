package com.rdpaas.demo.ext.mapper;

import com.rdpaas.demo.ext.entity.User1;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User1Mapper {

    User1 get(Long id);

    List<User1> selectList();
}
