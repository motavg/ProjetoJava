/**
 * Criado para representar o controller de cliente, com validações para o package view, na TelaCadastroGUI
 * @author Vinícius Mota
 */

package controller;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import view.TelaCadastroGUI;

public class ClienteController {
    private JTextField textCpf;
	private JTextField textNome;
	private JTextField textLogradouro;
	private JComboBox<String> comboBoxEstado;
	private JTextField textCidade;
	private JTextField textNumero;
	private JTextField textTelefone;
	DefaultTableModel modelo;

    
	
	/**
	 * Identifica os campos do Jframe. 
	 */
	
    public ClienteController(JTextField textCpf,  JTextField textNome, JTextField textLogradouro, JTextField textNumero, JTextField textCidade, JComboBox<String> comboBoxEstado, JTextField textTelefone) {
        this.textCpf = textCpf;
        this.comboBoxEstado = comboBoxEstado;
        this.textNome = textNome;
        this.textLogradouro = textLogradouro;
        this.textCidade = textCidade;
        this.textNumero = textNumero;
        this.textTelefone = textTelefone;
    }
    
    
	/**
	 * Limpa os campos da TelaCadastroGUI. 
	 */
    
    
    public void limparCampos() {
    	textCpf.setText("");
        textNome.setText("");
        textLogradouro.setText("");
        textNumero.setText("");
        textCidade.setText("");
        comboBoxEstado.setSelectedIndex(-1);
        textTelefone.setText("");
    }
    
    
	/**
	 * envia e depois limpa os campos da TelaCadastroGUI. 
	 */
    
    public void Enviar() {

    	 limparCampos();
    	}
    
	/**
	 * Validação do CPF (não de forma real, apenas a quantidade). 
	 */
    
    public void ValidarCpf() {
    	if (!textCpf.getText().isEmpty()) {
	    	if (textCpf.getText().length() != 11 || !textCpf.getText().matches("[0-9]+")) {
	    		  // Mostrar mensagem de erro
	    	      JOptionPane.showMessageDialog(null, "CPF inválido, por favor digite apenas números e 11 caracteres no campo CPF.");
	    	      // Limpar o campo
	    	      textCpf.setText("");
	    	}
    	}
    }
    
    
	/**
	 * Validação do nome, para obter o primeiro e segundo nome. 
	 */
    
    
    public void ValidarNome() {
    	if (!textNome.getText().isEmpty()) {
	    	if (!textNome.getText().matches("^[A-Za-zÀ-Úà-ú]{1,} [A-Za-zÀ-Úà-ú]{1,}")) {
	    		// Mostrar mensagem de erro
	    	    JOptionPane.showMessageDialog(null, "O campo nome deve conter pelo menos um primeiro nome e um segundo nome!");
	    	    // Limpar o campo
	    	    textNome.setText("");
	    	}
    	}
    }
    
	/**
	 * Conter apenas letras no logradouro. 
	 */
    
    
    public void ValidarLogradouro() {
    	if (!textLogradouro.getText().isEmpty()) {
    	    if (!textLogradouro.getText().matches("^[a-zA-Z\\s]*$")) {
    	    	// Mostrar mensagem de erro
    	        JOptionPane.showMessageDialog(null, "O campo Logradouro deve conter apenas letras!");
    	        // Limpar o campo
    	        textLogradouro.setText("");
    	    }
    	}
    }
    
	/**
	 * Conter apenas letras na cidade. 
	 */
    
    public void ValidarCidade() {
    	if (!textCidade.getText().isEmpty()) {
    	    if (!textCidade.getText().matches("^[a-zA-Z\\s]*$")) {
    	    	// Mostrar mensagem de erro
    	        JOptionPane.showMessageDialog(null, "O campo Cidade deve conter apenas letras!");
    	        // Limpar o campo
    	        textCidade.setText("");
    	    }
    	}
    	
    }
    
    
	/**
	 * valida o telefone (não de forma real, apenas a quantidade). 
	 */
    
    
    public void ValidarTelefone() {
    	if (!textTelefone.getText().isEmpty()) {
	    	if (textTelefone.getText().length() != 11 || !textTelefone.getText().matches("[0-9]+")) {
	    		  // Mostrar mensagem de erro
	    	      JOptionPane.showMessageDialog(null, "Número inválido, por favor digite com o DD.");
	    	      // Limpar o campo
	    	      textTelefone.setText("");
	    	}
    	}
    }
    
}
