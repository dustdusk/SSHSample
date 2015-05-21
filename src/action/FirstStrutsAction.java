package action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import service.FirstSpringService;

import com.opensymphony.xwork2.ActionSupport;

import entity.SshMasterTable;

public class FirstStrutsAction extends ActionSupport{

	@Resource
	private FirstSpringService firstSpringService;
	
	private static final long serialVersionUID = 1L;

	public String reExcute(){
		@SuppressWarnings("unused")
		List<SshMasterTable> SshMasterTableList = firstSpringService.querySSHMasterTable();
		
		return "firstStrutsPageA";
	};
}
