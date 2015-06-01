package action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.FirstSpringService;

import com.opensymphony.xwork2.ActionSupport;

import entity.SshMasterTable;

//@Controller
public class FirstStrutsAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	
	@Resource
	private FirstSpringService firstSpringService;
	
	public String reExcute(){
		@SuppressWarnings("unused")
		List<SshMasterTable> SshMasterTableList = firstSpringService.querySSHMasterTable();
		
		return "firstStrutsPageA";
	};
}
