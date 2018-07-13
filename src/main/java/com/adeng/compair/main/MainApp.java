package com.adeng.compair.main;

import java.io.File;
import java.io.FileNotFoundException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.adeng.compair.service.InvokeService;
import com.adeng.compair.util.ApplicationContextUtils;

public class MainApp {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
//        new ClassPathXmlApplicationContext("spring-mvc.xml");  
//        InvokeService service = (InvokeService) ApplicationContextUtils.getBean("invokeService");
//        service.dealOrder();
	}
	
//		deletefile("E:\\bussiness-workspace\\rabbish");
	public static boolean deletefile(String delpath) throws Exception {
        try {

            File file = new File(delpath);
            // 当且仅当此抽象路径名表示的文件存在且 是一个目录时，返回 true
            if (!file.isDirectory()) {
                file.delete();
            } else if (file.isDirectory()) {
                String[] filelist = file.list();
                for (int i = 0; i < filelist.length; i++) {
                    File delfile = new File(delpath + "\\" + filelist[i]);
                    if (!delfile.isDirectory()) {
                        delfile.delete();
                        System.out.println(delfile.getAbsolutePath() + "删除文件成功");
                    } else if (delfile.isDirectory()) {
                        deletefile(delpath + "\\" + filelist[i]);
                    }
                }
                System.out.println(file.getAbsolutePath() + "删除成功");
                file.delete();
            }

        } catch (FileNotFoundException e) {
            System.out.println("deletefile() Exception:" + e.getMessage());
        }
        return true;
    }
}
