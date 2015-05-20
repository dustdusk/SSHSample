package action;

import java.util.List;

import javax.annotation.Resource;

import service.FirstSpringService;

import com.opensymphony.xwork2.ActionSupport;

import entity.SshMasterTable;

public class FirstStrutsAction extends ActionSupport{

	@Resource
	private FirstSpringService firstSpringService;
	
	private static final long serialVersionUID = 1L;

	public String reExcute(){
		List<SshMasterTable> SshMasterTableList = firstSpringService.querySSHMasterTable();
		
		return "firstStrutsPageA";
	};
}
