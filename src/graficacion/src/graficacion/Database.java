package graficacion;

/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
*/
import java.util.ArrayList;
//import java.sql.*;

public class Database {
	
	public ArrayList<Empleado> ObtenerFuenteDatosManual(){
		
		//creacion de instanciamientos de la clase tipo "Empleado"(prueba)
		Empleado empleado01 = new Empleado("Arturo", 33, 500000f); 	
		Empleado empleado02 = new Empleado("Taylor", 22, 130131f);
		Empleado empleado03 = new Empleado("Paola", 20, 5455f);
		Empleado empleado04 = new Empleado("Daniel", 55, 45513f);
		Empleado empleado05 = new Empleado("Harry", 28, 400000.13f);
		Empleado empleado06 = new Empleado("George", 35, 120300.25f);
		Empleado empleado07 = new Empleado("Charlotte", 39, 400001f);
		
		//creacion de la lista de la clase tipo "Empleado"
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(empleado01);
		empleados.add(empleado02);
		empleados.add(empleado03);
		empleados.add(empleado04);
		empleados.add(empleado05);
		empleados.add(empleado06);
		empleados.add(empleado07);
		
		return empleados;
		
	}
	
/*	public ArrayList<Empleado> ObtenerFuenteDatosMySQL(){
		
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
		 			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/whitetower","root","root");  
	  
			Statement stmt=con.createStatement();  
			ResultSet rs=stmt.executeQuery("select * from empleados");  
			while(rs.next())  {
				Empleado empleado = new Empleado(rs.getString("Nombre"), rs.getInt("Edad"), rs.getDouble("Sueldo")); 	
				System.out.println(rs.getInt(1)+"  "+rs.getString("Nombre")+"  "+rs.getInt(3)+"  "+rs.getBigDecimal(4));
				empleados.add(empleado);
			}
			con.close();  
					
			return empleados;

		}catch(Exception e){
			
			System.out.println(e);
			return empleados;
		}
		
	}*/
}