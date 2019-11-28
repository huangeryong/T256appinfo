package cn.sq.appinfo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sq.appinfo.entity.BackendUser;
import cn.sq.appinfo.service.BackendUserService;

/**
 * 后台控制器
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/manager")
public class BackendUserController {
	
	@Resource
	private BackendUserService bs;
	//跳转去后台管理登录页面
	@RequestMapping("/beforeLogin")
	public String beforeLogin() {
		return "backendlogin";
	}
	
	//登录验证
	@RequestMapping("/login")
	public String login(String userCode,String userPassword,Model mod,HttpSession session) {
		//调用登录验证方法
		BackendUser bu=bs.login(userCode, userPassword);
		if(bu!=null) {
			session.setAttribute("userSession", bu);
			return "/backend/main";
		}else {
			mod.addAttribute("error", "用户名或密码不正确，请重新输入！");
			return "backendlogin";
		}
	}
	
	//注销登录
	@RequestMapping("/logOut")
	public String logOut(HttpSession session) {
		//清空session
		session.invalidate();
		return "backendlogin";
	}
}
