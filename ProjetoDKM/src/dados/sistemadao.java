package dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class sistemadao {

    private Connection conectado;
    private PreparedStatement st;
    private ResultSet resultado;

    private void conectar() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conectado = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemabd", "root", "");
        st = conectado.prepareStatement("SELECT * FROM usuario WHERE usuario = ? AND senha = ?");
    }

    public ResultSet validarUsusario(String usuario, String senha) throws SQLException, ClassNotFoundException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario WHERE usuario = ? AND senha = ?");
        st.setString(1, usuario);
        st.setString(2, senha);
        resultado = st.executeQuery();
        return resultado;

    }

    public ResultSet adicionarRemessa(String codProd, String quantidadeAtual) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM produto WHERE codProd = ?");
        st.setString(1, codProd);
        resultado = st.executeQuery();
        return resultado;

    }

    public ResultSet cadastrarProduto(String quantidade, String codProd) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("UPDATE produto SET quantidade = ? WHERE codProd = ?;");
        st.setString(1, quantidade);
        st.setString(2, codProd);
        resultado = st.executeQuery();
        return resultado;

    }

    public void editarUsuario(String u, String s, String n, String c) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("UPDATE usuario SET senha = ? , nome = ?, cargo = ? WHERE usuario = ?;");
        st.setString(1, s);
        st.setString(2, n);
        st.setString(3, c);
        st.setString(4, u);

    }

    public void cadastrarUsuario(String u, String s, String n, String c) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("INSERT INTO usuario VALUES(?,?,?,?)");
        st.setString(1, u);
        st.setString(2, s);
        st.setString(3, n);
        st.setString(4, c);
    }

    public void excluirUsuario(String usuario) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("DELETE FROM usuario WHERE usuario = ?;");
        st.setString(1, usuario);
    }

    public void cadastrodeProdutos(String codigo, String nome, String quantidade, String valor) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("INSERT INTO produto VALUES(?,?,?,?)");
        st.setString(1, codigo);
        st.setString(2, nome);
        st.setString(3, quantidade);
        st.setString(4, valor);

    }

    public ResultSet adicionarCaixa(String codProd) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM produto WHERE codProd = ?");
        st.setString(1, codProd);
        resultado = st.executeQuery();
        return resultado;
    }

    public void tabelaCaixa(String quantidadeFinal, String codProd) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("UPDATE produto SET quantidade = ? WHERE codProd = ?;");
        st.setString(1, quantidadeFinal);
        st.setString(2, codProd);
    }

    public void editarProduto(String nome, String quantidade, String valor, String codProd) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("UPDATE produto SET nome = ? , quantidade = ?, valor = ? WHERE codProd = ?;");
        st.setString(1, nome);
        st.setString(2, quantidade);
        st.setString(3, valor);
        st.setString(4, codProd);
    }

    public void excluirProduto(String codProd) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("DELETE FROM produto WHERE codProd = ?;");
        st.setString(1, codProd);
    }

    public ResultSet telaGerente() throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario");
        resultado = st.executeQuery();
        return resultado;

    }

    public ResultSet telaprodutos() throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM produto");
        ResultSet resultado = st.executeQuery();
        return resultado;

    }

    public ResultSet botaopesquisarprodutos(String nome) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM produto WhERE codProd LIKE ?");
        st.setString(1, nome);
        ResultSet resultado = st.executeQuery();
        return resultado;
    }

    public ResultSet botaoAtualizar() throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM produto");
        ResultSet resultado = st.executeQuery();
        return resultado;
    }

    public ResultSet preechertabela() throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario");
        ResultSet resultado = st.executeQuery();
        return resultado;
    }

    public ResultSet btnAtualizar() throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario");
        ResultSet resultado = st.executeQuery();
        return resultado;

    }

    public ResultSet cmbCargo(String cargo) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario WhERE cargo LIKE ? ");
        st.setString(1, cargo);
        ResultSet resultado = st.executeQuery();
        return resultado;

    }

    public ResultSet pesquisar(String nome) throws ClassNotFoundException, SQLException {
        conectar();
        st = conectado.prepareStatement("SELECT * FROM usuario WhERE nome LIKE ?");
        st.setString(1, nome);
        ResultSet resultado = st.executeQuery();
        return resultado;
    }

}
