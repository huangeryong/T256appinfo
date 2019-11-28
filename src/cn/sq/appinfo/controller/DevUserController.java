package cn.sq.appinfo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sq.appinfo.entity.DevUser;
import cn.sq.appinfo.service.DevUserService;

/**
 * ǰ̨������
 * @author hey
 *
 */
@Controller
@RequestMapping("/dev")
public class DevUserController {
	
	@Resource
	private DevUserService ds;
	//��תȥ�����ߵ�¼ҳ��
	@RequestMapping("/beforeLogin")
	public String beforeLogin() {
		return "devlogin";
	}
	
	//��¼��֤
	@RequestMapping("/login")
	public String login(String devCode,String devPassword,Model mod,HttpSession session) {
		//���õ�¼��֤����
		DevUser du=ds.login(devCode, devPassword);
		if(du!=null) {
			session.setAttribute("devUserSession", du);
			return "/developer/main";
		}else {
			mod.addAttribute("error", "�û��������벻��ȷ�����������룡");
			return "devlogin";
		}
	}
	
	//ע����¼
	@RequestMapping("/logOut")
	public String logOut(HttpSession session) {
		//���session
		session.invalidate();
		return "devlogin";
	}
}
