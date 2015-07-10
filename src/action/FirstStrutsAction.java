package action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import service.FirstSpringService;

import com.opensymphony.xwork2.ActionSupport;

import entity.SshMasterTable;

@Controller(value="firstStrutsAction")//設定bean Name 以防Struts 找不到
public class FirstStrutsAction extends ActionSupport{

	private static final long serialVersionUID = 1L;
	@Resource
	private FirstSpringService firstSpringService;

	private String user;
	private List<SshMasterTable> sshMasterTableList;
	
	@Override
	public String execute() throws Exception {
		setSshMasterTableList(firstSpringService.querySSHMasterTable());
		setUser("Dustdusk");
		return "firstStrutsPageA";
	}

	
	
//==Get/Set==================================================================================
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}


	public List<SshMasterTable> getSshMasterTableList() {
		return sshMasterTableList;
	}


	public void setSshMasterTableList(List<SshMasterTable> sshMasterTableList) {
		this.sshMasterTableList = sshMasterTableList;
	}
	
}
