
import java.sql.*;

public  class ConnectionUtil {
    static Connection con = null;
    ConnectionUtil(){};

    public static Connection getConnection()
    {

        try {
           // Class.forName("com.mysql.jdbc.Driver");
             con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/zadanie", "root", "");
            System.out.println("dobrze");
            return con;
        } catch (SQLException e ) {
            System.out.println("jnhdud");
            return null;
        }





    }
  static  Statement   st ;
    public  void ada()  {
     //   Statement st = null;
        String sql = "SELECT imie,nazwisko,data_wypozyczenia, COUNT(Wypozyczenia.id_osoby) AS Policzks\n" +
                "FROM osoby\n" +
                "INNER JOIN ( ksiazki INNER JOIN Wypozyczenia ON ksiazki.id_ksiazki = Wypozyczenia.id_ksiazki) ON osoby.id_osoby=Wypozyczenia.id_osoby\n" +
                "GROUP BY osoby.nazwisko, osoby.imie;";
        try {
          st = con.createStatement();

            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {

                System.out.println(rs.getString("imie"));
                System.out.println(rs.getInt("Policzks"));
            }
        }

        catch (SQLException e) {

            e.printStackTrace();
        }
    }
}
