import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {
   //autowiring ?????
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
		
	}
	
	public int saveEmployee(Employee e)
	{
		String query="insert into employee(name,dept,desg,comp,mobile,email)"
				
				+ "values('"+e.getName()+"','"+e.getDept()+"','"+e.getDesg()+"','"+e.getComp()+"','"+e.getMobile()+"','"+e.getEmail()+"')";
		return jdbcTemplate.update(query);
	}
	
	public int updateEmployee(Employee e) {
		String query="update employee set name='"+e.getName()+"',desg='"+e.getDesg()+"'where name=null ";
		return jdbcTemplate.update(query);
		
	}
	
}
