package com.grade.web.daoimpls;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import com.grade.web.daos.GradeDao;
import com.grade.web.domains.GradeBean;
import com.grade.web.pool.Constant;

public class GradeDaoImpl implements GradeDao{
	
	

	@Override
	public void insertGrade(GradeBean param) {

		try {
			File file = new File(Constant.FILE_PATH+"grade.txt");
			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			System.out.println("doGet >>>"+param.toString());
			writer.write(param.toString());
			writer.newLine();
			writer.flush();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
