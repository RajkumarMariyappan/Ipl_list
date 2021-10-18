package reader;

import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConsoleReading {

	public static void main(String[] args) {
		try {
			// Class.forName("com.mysql.jdbc.Driver");
			String dbUrl = "jdbc:mysql://localhost:3306/poc";
			String user = "student";
			String pass = "student";
			Connection conn = DriverManager.getConnection(dbUrl, user, pass);
			ResultSet myRs = null;
			Statement sm = conn.createStatement();
//			 sm.executeUpdate("alter table ipl_teams add Player_Score Varchar(45)");
//			PreparedStatement stmt = conn.prepareStatement("update ipl_teams set Player_score=? where Player_id=?");
//			Scanner sc = new Scanner(System.in);
//			String a;
//			int i = 0, j = 0, z = 0;
//
//			while (z < 10) {
//				System.out.println("Enter the number");
//				a = sc.next();
//
//				
//				stmt.setString(++i, a);
//				stmt.setInt(++i, ++j);
//				i = 0;
//				stmt.executeUpdate();
//				System.out.println(i + " inserted into db");
//				z++;
//			}

			// myRs= sm.executeQuery("select * from ipl_teams");
			myRs = sm.executeQuery("select * from ipl_teams" + " ORDER BY Team_Name ASC,Player_Score ASC");
			FileWriter fw = new FileWriter("C:\\Users\\rajkumar.mariyappan\\Desktop\\IPL_LIST.txt");

			while (myRs.next()) {
				String Team_Id = myRs.getString("Team_Id");
				String Team_Name = myRs.getString("Team_Name");
				String Player_Name = myRs.getString("Player_Name");
				String Player_Id = myRs.getString("Player_Id");
				String Player_Score = myRs.getString("Player_Score");
				fw.write(Team_Name + "\t");
				fw.write(Team_Id + "\t");
				fw.write(Player_Name + "\t");
				fw.write(Player_Id + "\t");
				fw.write(Player_Score + "\n");

				System.out.println("Success...");
			}
			fw.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}