
package br.com.AsuperArts.BLL;

import br.com.AsuperArts.DAL.Conexao;
import br.com.AsuperArts.DTO.MedidasDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipe Senac 2017
 */
public class MedidasBLL {
    Connection con = new Conexao().abrirConexao();
    String sql;
    
    public void inserir(MedidasDTO m){
    sql = "INSERT INTO tb_medidas (largura,comprimento,tamanho,espessura,hora)VALUES(?,?,?,?,?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, m.getLargura());
            ps.setInt(2, m.getComprimento());
            ps.setInt(3, m.getTamanho());
            ps.setInt(4, m.getEspessura());
            ps.setInt(5, m.getHora());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(MedidasBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<MedidasDTO> listaMedidas(){
        sql = "SELECT * FROM tb_medidas;";
        List<MedidasDTO> medidas =new ArrayList<>();
        ResultSet rs;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                MedidasDTO medida = new MedidasDTO();
                medida.setId_medidas(rs.getInt("id_medida"));
                medida.setLargura(rs.getInt("largura"));
                medida.setComprimento(rs.getInt("comprimento"));
                medida.setTamanho(rs.getInt("tamanho"));
                medida.setEspessura(rs.getInt("espessura"));
                medida.setHora(rs.getInt("hora"));
                
                medidas.add(medida);
                
            }
            return medidas;
        } catch (SQLException ex) {
            Logger.getLogger(MedidasBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    return null;
    }
    public void Excluir(MedidasDTO m){
        sql = "DELETE FROM tb_medidas WHERE id_medida=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, m.getId_medidas());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(ClienteBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    public void Alterar(MedidasDTO m){
        sql = "UPDATE tb_medidas SET largura=?, comprimento=?, tamanho=?, espessura=?, hora=? WHERE id_medida=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, m.getLargura());     
            ps.setInt(2, m.getComprimento()); 
            ps.setInt(3, m.getTamanho());
            ps.setInt(4, m.getEspessura());
            ps.setInt(5, m.getHora());
            ps.setInt(6, m.getId_medidas());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MedidasBLL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
