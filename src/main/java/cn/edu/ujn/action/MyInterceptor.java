package cn.edu.ujn.action;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class MyInterceptor extends AbstractInterceptor{

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		XsbAction xaction = (XsbAction) invocation.getAction();
		xaction.getXs();
		if ("wang".equals(xaction.getXs().getXm())) {
			return "error";
		}
		return invocation.invoke();
	}

}
