package cn.sq.appinfo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sq.appinfo.entity.DevUser;
import cn.sq.appinfo.service.DevUserService;

/**
 * 前台控制器
 * @author hey
 *
 */
@Controller
@RequestMapping("/dev")
public class DevUserController {
	
	@Resource
	private DevUserService ds;
	//跳转去开发者登录页面
	@RequestMapping("/beforeLogin")
	public String beforeLogin() {
		return "devlogin";
	}
	
	//登录验证
	@RequestMapping("/login")
	public String login(String devCode,String devPassword,Model mod,HttpSession session) {
		//调用登录验证方法
		DevUser du=ds.login(devCode, devPassword);
		if(du!=null) {
			session.setAttribute("devUserSession", du);
			return "/developer/main";
		}else {
			mod.addAttribute("error", "用户名或密码不正确，请重新输入！");
			return "devlogin";
		}
	}
	
	//注销登录
	@RequestMapping("/logOut")
	public String logOut(HttpSession session) {
		//清空session
		session.invalidate();
		return "devlogin";
	}
}
