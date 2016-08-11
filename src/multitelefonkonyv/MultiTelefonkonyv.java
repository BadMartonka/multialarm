/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitelefonkonyv;

import alaposztaly.Kontakt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Marci
 */
public class MultiTelefonkonyv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public Connection getConnection()
    {
        Connection con;
        
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            con = DriverManager.getConnection(url, "postgres", "Szmart91");
            return con;        
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public ArrayList<Kontakt> getKontaktLista()
    {
        ArrayList<Kontakt>kontaktLista = new ArrayList<>();
        Connection kapcsolat = getConnection();
        
        String query = "SELECt * FROM multialarm";
        Statement st;
        ResultSet rs;
        
        try {
            st = kapcsolat.createStatement();
            rs = st.executeQuery(query);
            
            Kontakt kontakt;
             while (rs.next()) {                
                kontakt = new Kontakt(rs.getString("nev"), rs.getString("varos"), rs.getString("szuletesnap"), rs.getInt("irszam"), rs.getInt("telefonszam"));
                kontaktLista.add(kontakt);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kontaktLista;
    }
    
    
            
    
    
}
