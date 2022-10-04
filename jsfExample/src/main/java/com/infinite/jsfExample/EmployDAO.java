package com.infinite.jsfExample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped

public class EmployDAO implements Serializable {
	public List<Employ> showEmploy() {
		List<Employ> employlist = new ArrayList<Employ>();
		employlist.add(new Employ(1, "mag", "java","dev",546464.454));
		employlist.add(new Employ(2, "masfgg", "java","dev",546464.454));
		employlist.add(new Employ(3, "masdgassdgg", "java","dev",546464.454));
		employlist.add(new Employ(4, "masfgwreywraegSDg", "java","dev",546464.454));
		employlist.add(new Employ(5, "msagwartwrwaefewqtag", "java","dev",546464.454));
		return employlist;
		
	}

}
