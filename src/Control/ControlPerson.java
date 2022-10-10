/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Conexao.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Carlos
 */
public class ControlPerson {
    ConexaoBanco conecta = new ConexaoBanco();
    public void inserir(Model.ModelPerson mod) throws SQLException{
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO person(id,name)values(?,?)");
            pst.setInt(1, mod.getId());
            pst.setString(2,mod.getName());
            pst.executeUpdate();
            System.out.println("Cadastro salvo com sucesso!!!!");
            conecta.desconecta();
        
    }
    
}
