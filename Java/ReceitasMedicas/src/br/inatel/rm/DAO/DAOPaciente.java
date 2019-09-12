package br.inatel.rm.DAO;

import br.inatel.rm.controller.ConexaoMySql;
import br.inatel.rm.model.Paciente;

/**
 *
 * @author Samuel
 */
public class DAOPaciente extends ConexaoMySql {

    /**
     * Salva os dados do paciente
     *
     * @param p
     * @return
     */
    public int salvarPacienteDAO(Paciente p) {
        try {
            this.conectar();
            return this.insertSQL(
                    "INSERT INTO tbl_paciente ("
                    + "p_nome,"
                    + "p_id,"
                    + "p_dataNasc,"
                    + "p_cpf,"
                    + "p_remedio,"
                    + "p_dosagem,"
                    + ") VALUES ("
                    + "'" + p.getNome() + "',"
                    + "'" + p.getID() + "',"
                    + "'" + p.getDataNasc() + "',"
                    + "'" + p.getCPF() + "',"
                    + "'" + p.getRemedio() + "',"
                    + "'" + p.getDosagem() + "',"
                    + ");"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Recupera os dados do cliente
     *
     * @param IDCartao
     * @return
     */
    public Paciente getPacienteDAO(int IDCartao) {
        Paciente p = new Paciente();
        try {
            this.conectar();
            this.executarSQL(
                    "SELECT "
                    + "p_id,"
                    + "p_nome,"
                    + "p_dataNasc,"
                    + "p_cpf,"
                    + "p_remedio,"
                    + "p_dosagem,"
                    + " FROM"
                    + " tbl_paciente"
                    + " WHERE"
                    + " p_id = '" + IDCartao + "'"
                    + ";"
            );

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        return p;
    }

    /**
     * Editar os dados do paciente
     *
     * @param p
     * @return
     */
    public boolean editarPacienteDAO(Paciente p) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "UPDATE tbl_paciente SET "
                    + "p_id = '" + p.getID()+ "',"
                    + "p_nome = '" + p.getNome() + "',"
                    + "p_dataNasc = '" + p.getDataNasc() + "',"
                    + "p_cpf = '" + p.getCPF() + "',"
                    + "p_remedio = '" + p.getRemedio() + "',"
                    + "p_dosagem = '" + p.getDosagem() + "',"
                    + " WHERE "
                    + "p_id = '" + p.getID() + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }

    /**
     * Excluir paciente
     * @param IDCartao
     * @return 
     */
    public boolean excluirPacienteDAO(int IDCartao) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_paciente "
                    + " WHERE "
                    + "p_id = '" + IDCartao + "'"
                    + ";"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }
    }
}
