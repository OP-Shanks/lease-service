package com.cooperation.controller;

import com.cooperation.model.UserVO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhoukai
 * @date 2018/6/6
 */
@RestController
@RequestMapping("/rest")
public class HelloController {

	@RequestMapping(value = "/user/{pid}", method = RequestMethod.GET)
	public UserVO name(@PathVariable("pid") String id) {
		UserVO userVO = new UserVO();
		userVO.setId(id);
		return userVO;
	}
}
