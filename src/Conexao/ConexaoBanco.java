/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexao;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.Connection;




/**
 *
 * @author Carlos
 */
public class ConexaoBanco {
  public Statement stmt;
  public ResultSet rs;
  private String driver = "com.mysql.jdbc.Driver";

   
   public Connection conn;
   private  String root="jdbc:mysql://127.0.0.1:3306/facial_recognition";
   private  String user = "root";
   private  String pass = ""; 
   private  String caminho;
   public void conexao(){
       try {
       System.setProperty("jdbc.Drivers", driver);
       conn = DriverManager.getConnection(root,user,pass);
       System.out.println("Conexão com o banco com sucesso!!!");  
       } catch (Exception e) {
           System.out.println("Error:"+e);
       }

   }
   public void desconecta(){
       try {
           conn.close();
       } catch (Exception e) {
           System.out.println("Error: "+e);
       }
   }
   public void exectaSQL(String sql){
              try {
           stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
           rs = stmt.executeQuery(sql);
           
       } catch (Exception e) {
            System.out.println("Error: "+e);
       }
   }
//   public static void main(String[] args){;
//       ConexaoBanco conecta = new ConexaoBanco();
//       conecta.conexao();
//   }
}
