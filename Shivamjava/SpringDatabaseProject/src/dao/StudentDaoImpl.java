package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import data.Student;

public class StudentDaoImpl implements IStudentDao {
   
	JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate ) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	@Override
	public void create(Student student) {
		// TODO Auto-generated method stub
        String query="insert into student values('"+student.getId()+"',"
        		+ "'"+student.getName()+"','"+student.getAge()+"')";
        int result=jdbcTemplate.update(query);
        System.out.println(result+"  Record inserted....");
        
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> listStudents() {
		String sql="select * from student";
	 return jdbcTemplate.query(sql, new ResultSetExtractor<List<Student>>() {

		@Override
		public List<Student> extractData(ResultSet rs) throws SQLException, 
		DataAccessException {
			// TODO Auto-generated method stub
			List<Student> list=new ArrayList<Student>();			
			while(rs.next()) {
				Student e=new Student();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setAge(rs.getInt(3));
				list.add(e);
				
			}
			return list;
		}		 
	 });
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		int did=id;
      String sql="delete from student where id="+did;
      int result=jdbcTemplate.update(sql);
      System.out.println(result+" record is successfully deleted...");

	}

	@Override
	public void update(Student student) {
		// TODO Auto-generated method stub
         String sql="update student set name='"+student.getName()+"',"
		 + "age='"+student.getAge()+"' where id='"+student.getId()+"'";
	      int result= jdbcTemplate.update(sql);
	      System.out.println(result+" record is updated");
	      
	}

	@Override
	public boolean saveStudentByPst(Student e) {
		// TODO Auto-generated method stub
		
		
		String query="insert into student values(?,?,?)";
		return jdbcTemplate.execute(query,new PreparedStatementCallback<Boolean>()
				
				{

					@Override
					public Boolean doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						ps.setInt(1, e.getId());
						ps.setString(2, e.getName());
						ps.setInt(3, e.getAge());
						return ps.execute();
					}
			
				});
	}
	

}
