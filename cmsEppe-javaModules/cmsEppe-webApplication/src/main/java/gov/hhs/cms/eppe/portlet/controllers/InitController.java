package gov.hhs.cms.eppe.portlet.controllers;

import gov.hhs.cms.eppe.service.DataExchangeService;
import gov.hhs.cms.eppe.vo.UserVO;

import java.net.MalformedURLException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.PortletURL;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.ActionMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;


@Controller(value ="startUpController")
@RequestMapping("VIEW")
public class InitController {

	private DataExchangeService dataExchangeService;
	
	//private DuaVO duaVO;
	
	private UserVO userVO;
	
/*	@ModelAttribute("welcomeMessage")
	public String getWelcomeMessage() {
		return "Welcome to EPPE. This page is under construction.";
	}*/
	
	@ModelAttribute("userObject")
	public UserVO getUserObject() {
				
		return userVO;
	}
	
	@RenderMapping
	public String handleRenderRequest(RenderRequest request, RenderResponse response, Model model)
	    throws MalformedURLException {
		
		System.out.println("----------first render method-----------");	
		
		this.userVO = new UserVO();
		this.userVO.setUserId("EPPE NAME");
		model.addAttribute("userObject", this.userVO);
		System.out.println(this.userVO.toString());
		PortletURL saveActionUrl = response.createActionURL();
		saveActionUrl.setParameter("userAction", "saveUser");
		model.addAttribute("saveOrUpdateDuaUrl", saveActionUrl.toString());
		
		return "Userlogin";
	}
	
	@RenderMapping(params = "actionStatus=success")
	public String handleRenderRequest2(RenderRequest request, RenderResponse response, Model model)
	    throws MalformedURLException {
		
		System.out.println("-----------------second render method----------------");
		
		
		return "Success";
	}
	
	
	@ActionMapping(params = "userAction=saveUser")
	public void handleForm(@Valid @ModelAttribute(value = "userObject") UserVO userVO,
			BindingResult bindingResult, ActionRequest request, ActionResponse response, Model model)
	    throws MalformedURLException,PortletException {
		
		if (!bindingResult.hasErrors()) {
			
			System.out.println("-------------action phase----------");
			System.out.println(userVO.toString());
		}
		
		dataExchangeService.saveUser(userVO);
		
		System.out.println("-------------save success----------");
			
		response.setRenderParameter("actionStatus", "success");
	}
	
	
	public void setDataExchangeService(DataExchangeService dataExchangeService) {
		this.dataExchangeService = dataExchangeService;
	
	
	
	/*
	@ModelAttribute("duaObject")
	public DuaVO getDuaObject() {
				
		return duaVO;
	}
	
	@RenderMapping
	public String handleRenderRequest(RenderRequest request, RenderResponse response, Model model)
	    throws MalformedURLException {
		
		System.out.println("----------first render method-----------");	
		
		this.duaVO = new DuaVO();
		this.duaVO.setDuaName("EPPE NAME");
		model.addAttribute("duaObject", this.duaVO);
		System.out.println(this.duaVO.toString());
		PortletURL saveActionUrl = response.createActionURL();
		saveActionUrl.setParameter("userAction", "saveDua");
		model.addAttribute("saveDuaUrl", saveActionUrl.toString());
		
		return "Welcome";
	}
	
	@RenderMapping(params = "actionStatus=success")
	public String handleRenderRequest2(RenderRequest request, RenderResponse response, Model model)
	    throws MalformedURLException {
		
		System.out.println("-----------------second render method----------------");
		
		return "SuccessPage";
	}
	
	@ActionMapping(params = "userAction=saveDua")
	public void handleForm(@Valid @ModelAttribute(value = "duaObject") DuaVO duaVO,
			BindingResult bindingResult, ActionRequest request, ActionResponse response, Model model)
	    throws MalformedURLException,PortletException {
		
		if (!bindingResult.hasErrors()) {
			
			System.out.println("-------------action phase----------");
			System.out.println(duaVO.toString());
		}
		
		dataExchangeService.saveDua(duaVO);
		
		System.out.println("-------------save success----------");
			
		response.setRenderParameter("actionStatus", "success");
	}
	
	
	public void setDataExchangeService(DataExchangeService dataExchangeService) {
		this.dataExchangeService = dataExchangeService;
	}*/
	
	
	
	
	/*@ModelAttribute("testForm")
	public TestForm getTestForm() {
		return testService.getTestForm();
	}*/

}
}
