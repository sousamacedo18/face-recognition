/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Conexao.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Model.ModelPerson;

/**
 *
 * @author Carlos
 */
public class ControlPerson {
    ConexaoBanco conecta = new ConexaoBanco();
  

    public void inserir(ModelPerson mod) {
        try {
            conecta.conexao();
            PreparedStatement pst = conecta.conn.prepareStatement("INSERT INTO person(name)values(?)");
            pst.setString(1,mod.getName());
            pst.execute();
            System.out.println("Cadastro salvo com sucesso!!!!");
            conecta.desconecta();
        } catch (Exception e) {
            System.out.println("error"+e);
        }

        
      
}

    
}
