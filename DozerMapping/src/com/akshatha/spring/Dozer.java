package com.akshatha.spring;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;

public class Dozer {
	
	 public static void main( String[] args )
	    {
	    	DozerBeanMapper mapper=new DozerBeanMapper();
	    	List myMappingFiles = new ArrayList();
	    	myMappingFiles.add("AddressMapping.xml");
	    	mapper.setMappingFiles(myMappingFiles);
	    	
	    	AddressType addrType=new AddressType();
	    	addrType.setAddrLine1("20,Lic pharm colony");
	    	addrType.setAddrLine2("Modi hospital");
			addrType.setCity("Bangalore");
			addrType.setState("India");
			addrType.setZipCode(500579);
	    	AddressBean destAddrBean=mapper.map(addrType, AddressBean.class);
	        System.out.println("Source Bean:"+addrType);
	    	System.out.println("Destination Bean:"+destAddrBean);	       
	    }
}
