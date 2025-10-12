package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class Database implements IDatabase {
    private String url;
    private String username;
    private String password;
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private Connection connessione;

    public Database(String schema){
        username = "root";
        password = "root";
        setUrl(schema);
    }

    private void setUrl(String schema) {
        // protocollo jdbc:mysql:
        // indirizzo ip 127.0.0.1:3306 
        //nome schema
        //timezone ?useSSL=false&serverTimezone=UTC
        url = "jdbc:mysql://127.0.0.1:3306/" + schema + "?useSSL=false&serverTimezone=UTC";
    }

    /*
     * public interface EssereUmano {
     *  caga();
     *  mangia();
     *  scopa();
     * }
     * 
     * public class Uomo implements EssereUmano {
     *  @Override
     *  caga() { }
     *  ...
     * }
     * 
     * Uomo u = new Uomo();
     * EssereUmano e = new Uomo();
     * 
     * Connection c = new [classe concreta JDBC che implments Connection]
     */

    private void openConnection(){
        // import "com.mysql.cj.jdbc.Driver
        try {
            Class.forName(driver);
        connessione = DriverManager.getConnection(url, username, password);
 
        } catch(SQLException e){
             System.out.println("Database non trovato");
        } catch(ClassNotFoundException c){
            System.out.println("Classe driver non trovata");
        };
       
    }

    private void closeConnection(){
        try {
            connessione.close();
        } catch(SQLException e){
            System.out.println("Errore durante la chiusura della connessione");
        }
        
    }

    // List<Map<String, String>>
    // List<Entity> // non va bene
    // Database -> Dao -> Service
    // principio di singola responsabilita'
    // Databse -> creare la connessione
    // Dao -> eseguire le query e gesitre i dati del database
    // Service -> trasformare i dati in modo tale che siano utilizzabili da Java
    //            trasforma le Map<String, String> in oggetti
    public Map<Integer, Map<String, String>> executeQuery() {

    }

    // insert -> ritorna la primary key dell'oggetto creato
    // update -> ritorna quello che vogliamo perche' e' un dato non utile
    // ad esempio potremmo far ritornare il numero di righe modificate
    // delete -> come update
    // insert into table (nome, cognome, sesso) values (luca, gialli, si);
    // executeUpdate("insert into table (nome, cognome, sesso) values (?, ?, ?)", "Luca", "Gialli", "si")

    // update table set nome = lorenzo where id = 1;
    public Integer executeUpdate(String comando, String...params) {
        Integer righeModificate = 0;
        openConnection();
        String[] colonne = {"id"};
        try(PreparedStatement ps = connessione.prepareStatement(comando, colonne)){
           
            for (int i = 0; i < params.length; i++){
                ps.setString(i+1, params[i]);
            }

            righeModificate = ps.executeUpdate();
            try(ResultSet rs = ps.getGeneratedKeys()) {
                if(rs != null && rs.next()) {
                    righeModificate = rs.getInt("id");
                }
            }

        } catch(SQLException e){
            System.out.println("Errore nella query");
        } finally {
             closeConnection();
        }
     

        return righeModificate;       
    }
}