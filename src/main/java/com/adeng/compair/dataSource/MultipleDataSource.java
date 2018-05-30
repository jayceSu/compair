package com.adeng.compair.dataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MultipleDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
    	System.out.println(DataSourceTypeManager.get());
        return DataSourceTypeManager.get();
    }

}
