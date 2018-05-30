package com.adeng.compair.dataSource;

import com.adeng.compair.enums.DataSources;

public class DataSourceTypeManager {
	 private static final ThreadLocal<String> dataSourceTypes = new ThreadLocal<String>();
	    
	    public static String get(){
	        return dataSourceTypes.get();
	    }
	    
	    public static void set(String dataSourceType){
	        dataSourceTypes.set(dataSourceType);
	    }
	    
	    public static void reset(){
	        dataSourceTypes.set(DataSources.ORACLE.name());
	    }
	    
	    public static void remove(){
	        dataSourceTypes.remove();
	    }
}
