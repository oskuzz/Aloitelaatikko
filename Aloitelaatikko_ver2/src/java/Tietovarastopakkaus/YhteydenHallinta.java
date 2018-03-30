package Tietovarastopakkaus;

import java.sql.*;

public class YhteydenHallinta {
    //metodi avaa tietokantayhteyden
    public static Connection avaaYhteys(String ajuri, String url, 
        String kayttajatunnus, String salasana) {
        try {
            Class.forName(ajuri).newInstance();
            return DriverManager.getConnection(url, kayttajatunnus, salasana);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    //metodi sulkee tietokantayhteyden
    public static void suljeYhteys(Connection suljettavaYhteys) {
        if (suljettavaYhteys != null) {
            try {
                suljettavaYhteys.close();
            } catch (Exception e) {
                //ei mitään tehtävissä
            }
        }
    }
    
    public static void suljeLause(Statement suljettavaLause) {
        if (suljettavaLause != null) {
            try {
                suljettavaLause.close();
            } catch (Exception e) {
                // ei mitään tehtävissä
            }
        }
    }
    
    public static void suljeTulosjoukko(ResultSet suljettavaTulosjoukko) {
        if (suljettavaTulosjoukko != null) {
            try {
                suljettavaTulosjoukko.close();
            } catch (Exception e) {
                //ei mitään tehtävissä
            }
        }
    }
}
