package reader;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;

public class Project {
	public static void main(String[] args) {
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/poc";
			String user = "student";
			String pass = "student";
			Connection conn = DriverManager.getConnection(dbUrl, user, pass);
			ResultSet myRs = null;
			Statement stmt = conn.createStatement();
			FileReader fr = new FileReader("C:\\Users\\rajkumar.mariyappan\\eclipse-workspace\\reader\\bin\\input.txt");
			BufferedReader br = new BufferedReader(fr);
			String strLine;
			ArrayList list = new ArrayList();
			while ((strLine = br.readLine()) != null) {
				list.add(strLine);
			}
			Iterator itr = list.iterator();
			while (itr.hasNext()) {
				String str = itr.next().toString();
				String[] input = str.split("\t");
				myRs = stmt.executeQuery("select * from ipl_teams");
				int k = stmt.executeUpdate("insert into ipl_teams(Team_Id,Team_Name,Player_Name) values('" + input[0]
						+ "','" + input[1] + "','" + input[2] + "')");
				System.out.println(input[0] + " inserted into db");

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
