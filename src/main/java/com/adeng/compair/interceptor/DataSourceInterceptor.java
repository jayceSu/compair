package com.adeng.compair.interceptor;

import org.aspectj.lang.JoinPoint;

import com.adeng.compair.dataSource.DataSourceTypeManager;
import com.adeng.compair.enums.DataSources;

//@Aspect    // for aop
//@Component // for auto scan
//@Order(0)  // execute before @Transactional
public class DataSourceInterceptor {

//	@Pointcut("execution(public * com.adeng.compair.multDao.oracleDao.OracleDao.*(..))")
    public void dataSourceOracle(){};
    
//    @Before("dataSourceOracle()")
    public void doAroundOracle(JoinPoint jp) throws Throwable {
    	System.out.println("oracle数据源");
    	DataSourceTypeManager.set(DataSources.ORACLE.name());
    }
    
//    @Pointcut("execution(public * com.adeng.compair.multDao.postDao.PostDao.*(..))")
    public void dataSourcePost(){};
    
//    @Before("dataSourcePost()")
    public void doAroundPost(JoinPoint jp) throws Throwable {
    	System.out.println("POSTGRES数据源");
    	DataSourceTypeManager.set(DataSources.POSTGRES.name());
    }
    
//    @Pointcut("execution(public * com.adeng.compair.multDao.sqlServerDao.SqlServerDao.*(..))")
    public void dataSourceSqlserver(){};
    
//    @Before("dataSourceSqlserver()")
    public void doAroundSqlserver(JoinPoint jp) throws Throwable {
    	System.out.println("SQLSERVER数据源");
    	DataSourceTypeManager.set(DataSources.SQLSERVER.name());
    }
}
