package pack21;
import static pack2.Connector.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Queries {
		PreparedStatement pst;
	 public boolean insert(int id,String name,float sal) throws SQLException
	 {
		 pst=con.prepareStatement("insert into employee values (?,?,?)");
		 pst.setInt(1,id);
		 pst.setString(2,name);
		 pst.setFloat(3,sal);
		 int re =  pst.executeUpdate();
		 System.out.println("Rows Effected : " + re);
		 return re==1;
	 }
	 public boolean delete(int id) throws SQLException
	 {
		 pst=con.prepareStatement("delete from employee where id = ?;");
		 pst.setInt(1, id);
		 int re=  pst.executeUpdate();
		 System.out.println("Rows Deleted : " + re);
		 return re==1;
	 }
	 public boolean updateAll(int id,String name,float sal) throws SQLException
	 {
		 pst=con.prepareStatement("update employee set name=?,sal=? where id=? ;");
		 pst.setInt(3, id);
		 pst.setString(1, name);
		 pst.setFloat(2, sal);
		 int re=  pst.executeUpdate();
		 System.out.println("Rows Effected : " + re);
		 return re==1;
	 }
	 public String[] search(int id) throws SQLException
	 {
		 pst=con.prepareStatement("select * from employee where id =?;");
		 pst.setInt(1, id);
		 ResultSet rs=  pst.executeQuery();
		 String[] an =null	;
		 //System.out.println("Id\t|\tName\t|\tSalary");
		 if(rs.next())
		 {
			 an =new String[3];
			 an[0]=rs.getString(1);
			 an[1]=rs.getString(2);
			 an[2]=rs.getString(3);
		 }
		 return an;
	 }
	 public String[][] viewAll() throws SQLException
	 {
		 Statement st= con.createStatement();
		 ResultSet rs=  st.executeQuery("select count(*) from employee;");
		 rs.next();
		 String[][] an = new String[rs.getInt(1)][3];
		 rs=  st.executeQuery("select * from employee;");
		 System.out.println("Id\t|\tName\t|\tSalary");
		 int i=0;
		 while(rs.next())
		 {
			 an[i][0]=rs.getString(1);
			 an[i][1]=rs.getString(2);
			 an[i++][2]=rs.getString(3);
		 }
		 return an;
	 }
	 public boolean check(String id,String pwd) throws SQLException
	 {
		 
		 pst=con.prepareStatement("select * from login where user =?;");
		 pst.setString(1, id);
		 ResultSet rs=  pst.executeQuery();
		 while(rs.next())
		 {
			 if(rs.getString(3).equals(pwd))
			  return true;
		 }
		 return false;
	 }
}
