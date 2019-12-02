package cn.sq.appinfo.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sq.appinfo.entity.AppInfo;
import cn.sq.appinfo.entity.Category;
import cn.sq.appinfo.entity.DevUser;
import cn.sq.appinfo.entity.Dictionary;
import cn.sq.appinfo.service.AppInfoService;
import cn.sq.appinfo.service.CategoryService;
import cn.sq.appinfo.service.DevUserService;
import cn.sq.appinfo.service.DictionaryService;

/**
 * 前台控制器
 * 
 * @author hey
 *
 */
@Controller
@RequestMapping("/dev")
public class DevUserController {

	@Resource
	private DevUserService ds;

	@Resource
	private CategoryService cs;

	@Resource
	private DictionaryService dicetionService;
	
	@Resource
	private AppInfoService appService;

	// 跳转去登录页面
	@RequestMapping("/beforeLogin")
	public String beforeLogin() {
		return "devlogin";
	}

	// 登录方法֤
	@RequestMapping("/login")
	public String login(String devCode, String devPassword, Model mod, HttpSession session) {
		// 调用登录方法
		DevUser du = ds.login(devCode, devPassword);
		if (du != null) {
			session.setAttribute("devUserSession", du);
			return "/developer/main";
		} else {
			mod.addAttribute("error", "用户名或密码错误，请重新输入！");
			return "devlogin";
		}
	}

	// 注销
	@RequestMapping("/logOut")
	public String logOut(HttpSession session) {
		// 清空session
		session.invalidate();
		return "devlogin";
	}

	// 跳转去信息查询页面
	@RequestMapping("/list")
	public String list(Model mod) {
		// 查询AAP状态信息
		List<Dictionary> statusList = dicetionService.getFainAllDictionary("APP_STATUS");
		mod.addAttribute("statusList", statusList);
		// 查询所属平台
		List<Dictionary> flatFormList = dicetionService.getFainAllDictionary("APP_FLATFORM");
		mod.addAttribute("flatFormList", flatFormList);
		// 查询一级菜单
		List<Category> categoryList = cs.getFindCategory(null);
		mod.addAttribute("categoryLevel1List", categoryList);
		// 查询所有基础信息
	    List<AppInfo> appList=appService.getFindIfInfo(null,null,null,null,null,null,null);
		mod.addAttribute("appInfoList", appList);
		 
		return "developer/appinfolist";
	}

	// ajax联动查询二，三级菜单
	@RequestMapping("/categoryLinkage")
	@ResponseBody
	public Object categoryLinkage(String pid) {
		if (pid=="") {
			pid=null;
		}
		// 查询二，三级菜单
		List<Category> categoryList = cs.getFindCategory(pid == null ? null : Integer.parseInt(pid));
		return categoryList;
	}
	
	//ajax查询所属平台填充到添加页面
	@RequestMapping("/findFlatFormList")
	@ResponseBody
	public Object findFlatFormList() {
		// 查询所属平台
		List<Dictionary> flatFormList = dicetionService.getFainAllDictionary("APP_FLATFORM");
		return flatFormList;
	}

	// 跳转去添加页面
	@RequestMapping("/appAdd")
	public String appAdd(String pid, String tcode, Model mod) {
		return "developer/appinfoadd";
	}
	
	//添加基础信息
	@RequestMapping("/insertAppAdd")
	public String insertAppAdd(AppInfo appInfo) {
		
		//调用添加方法
		Integer row=appService.getAddInfo(appInfo);
		if (row>0) {
			return "redirect:list.do";
		}
		return "developer/appinfoadd";
	}
	
	//ajax验证APKName
	@RequestMapping("/checkAPKName")
	@ResponseBody
	public Object checkAPKName(String APKName) {
		AppInfo appInfo =appService.checkName(APKName);
		
		if (appInfo!=null) {
			return "exist";
		}
		return "noexist";
	}
	
	
}
