package com.lti.mypack.service;

import java.util.List;



import com.lti.mypack.model.Application;


public interface ApplicationService {
	
	public List<Application> getApplication();
	public boolean addApplication(Application application);
	public boolean deleteApp(Application application);
	//public boolean updateApplication(Application application);

}
