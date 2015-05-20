package service;

import java.util.List;

import javax.annotation.Resource;

import dao.FirstSpringDao;
import entity.SshMasterTable;

public class FirstSpringService {
	@Resource
	private FirstSpringDao<SshMasterTable> firstSpringDao;

	
	public List<SshMasterTable> querySSHMasterTable(){
		return firstSpringDao.query(new SshMasterTable());
	}
}
