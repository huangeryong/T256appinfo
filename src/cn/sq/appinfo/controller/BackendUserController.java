package cn.sq.appinfo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.sq.appinfo.entity.BackendUser;
import cn.sq.appinfo.service.BackendUserService;

/**
 * ��̨������
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/manager")
public class BackendUserController {
	
	@Resource
	private BackendUserService bs;
	//��תȥ��̨�����¼ҳ��
	@RequestMapping("/beforeLogin")
	public String beforeLogin() {
		return "backendlogin";
	}
	
	//��¼��֤
	@RequestMapping("/login")
	public String login(String userCode,String userPassword,Model mod,HttpSession session) {
		//���õ�¼��֤����
		BackendUser bu=bs.login(userCode, userPassword);
		if(bu!=null) {
			session.setAttribute("userSession", bu);
			return "/backend/main";
		}else {
			mod.addAttribute("error", "�û��������벻��ȷ�����������룡");
			return "backendlogin";
		}
	}
	
	//ע����¼
	@RequestMapping("/logOut")
	public String logOut(HttpSession session) {
		//���session
		session.invalidate();
		return "backendlogin";
	}
}
