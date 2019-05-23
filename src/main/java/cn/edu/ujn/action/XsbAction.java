package cn.edu.ujn.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.opensymphony.xwork2.ActionSupport;

import cn.edu.ujn.db.DBConn;
import cn.edu.ujn.m.Xsb;

public class XsbAction extends ActionSupport{
	private Xsb xs;
	private File zpfile;
	private String zpfileFileName;
	

	public File getZpfile() {
		return zpfile;
	}

	public void setZpfile(File zpfile) {
		this.zpfile = zpfile;
	}

	public String getZpfileFileName() {
		return zpfileFileName;
	}

	public void setZpfileFileName(String zpfileFileName) {
		this.zpfileFileName = zpfileFileName;
	}

	public Xsb getXs() {
		return xs;
	}

	public void setXs(Xsb xs) {
		this.xs = xs;
	}
	
	
	public String addXs() {
		
		try {
			FileInputStream fis = new FileInputStream(this.zpfile);
			FileOutputStream fos = new FileOutputStream("d:\\"+this.getZpfileFileName());
			byte buffer[] =new byte[102400];
			int count=0;
			while((count=fis.read(buffer))!=-1) {
				fos.write(buffer,0,count);
			}
			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(xs);
		DBConn dbConn = new DBConn();
		boolean save = dbConn.save(xs);
		if (save) {
			return "ok";
		}else {
			return "error";
		}
	}

}
