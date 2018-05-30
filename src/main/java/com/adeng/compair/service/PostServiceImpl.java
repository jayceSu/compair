package com.adeng.compair.service;

import java.util.List;

import com.adeng.compair.entity.User;
import com.adeng.compair.multDao.postDao.PostDao;

//@Service("postService")
public class PostServiceImpl implements PostService{

//	@Autowired
	private PostDao dao;
	
	
	@Override
	public List<User> postTest() {
		List<User> value =  dao.postTest();
		return value;
	}
	


}
