package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;

import controller.ClienteController;

import javax.swing.JComboBox;
import javax.print.attribute.AttributeSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TelaCadastroGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textCpf;
	private JTextField textNome;
	private JTextField textLogradouro;
	private JComboBox<String> comboEstado;
	private JTextField textCidade;
	private JTextField textNumero;
	private JTextField textTelefone;
	
	private JButton btnLimpar;
    private JButton btnEnviar;
    
    private JTable tableUsuario;
    DefaultTableModel modelo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroGUI frame = new TelaCadastroGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadastroGUI() {
		setTitle("Tela de Cadastro (GUI)");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 822, 740);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Adicionar os itens através de uma string
		JComboBox<String> comboBoxEstado = new JComboBox<>();
		// Adicionando vários itens de uma vez
		String[] estados = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};
		comboBoxEstado.setModel(new DefaultComboBoxModel<>(estados));
		comboBoxEstado.setSelectedIndex(-1);
		comboBoxEstado.setBounds(184, 160, 200, 25);
		contentPane.add(comboBoxEstado);
		
		

		JLabel lblNewLabel = new JLabel("CPF");
		lblNewLabel.setBounds(33, 54, 60, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(184, 52, 60, 25);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Logradouro");
		lblNewLabel_2.setBounds(427, 55, 200, 25);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Número");
		lblNewLabel_3.setBounds(689, 54, 60, 25);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Cidade");
		lblNewLabel_4.setBounds(33, 136, 60, 25);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Estado");
		lblNewLabel_5.setBounds(184, 136, 60, 25);
		contentPane.add(lblNewLabel_5);
		
		textCpf = new JTextField();
		/**
		 * Só deixar digitar 11 números no campo cpf
		 */
		textCpf.setDocument(new DefaultStyledDocument() {
		    public void insertString(int offs, String str, javax.swing.text.AttributeSet a) throws BadLocationException {
		        if (getLength() + str.length() <= 11) {
		            super.insertString(offs, str, a);
		        }
		    }
		});
		textCpf.setBounds(33, 79, 100, 25);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Telefone");
		lblNewLabel_6.setBounds(427, 137, 60, 25);
		contentPane.add(lblNewLabel_6);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(184, 79, 200, 25);
		contentPane.add(textNome);
		
		textLogradouro = new JTextField();
		textLogradouro.setColumns(10);
		textLogradouro.setBounds(427, 79, 213, 25);
		contentPane.add(textLogradouro);
		
		textCidade = new JTextField();
		textCidade.setColumns(10);
		textCidade.setBounds(33, 160, 118, 25);
		contentPane.add(textCidade);
		
		textNumero = new JTextField();
		textNumero.setColumns(10);
		textNumero.setBounds(689, 78, 80, 25);
		contentPane.add(textNumero);
		
		textTelefone = new JTextField();
		/**
		 * Só deixar digitar 2 do DD + 9 números
		 */
		textTelefone.setDocument(new DefaultStyledDocument() {
		    public void insertString(int offs, String str, javax.swing.text.AttributeSet a) throws BadLocationException {
		        if (getLength() + str.length() <= 11) {
		            super.insertString(offs, str, a);
		        }
		    }
		});
		textTelefone.setColumns(10);
		textTelefone.setBounds(427, 160, 100, 25);
		contentPane.add(textTelefone);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setActionCommand("New buttons");
		ClienteController clienteController = new ClienteController(textCpf, textNome, textLogradouro, textNumero, textCidade, comboBoxEstado, textTelefone);
		btnLimpar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        clienteController.limparCampos();
		    }
		});
		
		JScrollPane scrollPaneUsuario = new JScrollPane();
		scrollPaneUsuario.setBounds(33, 293, 736, 391);
		contentPane.add(scrollPaneUsuario);
		
		/**
		 * Tabela que aparece na tela de cadastro
		 */
		tableUsuario = new JTable();
		tableUsuario.addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e) {
				int i = tableUsuario.getSelectedRow();
				textCpf.setText(modelo.getValueAt(i, 0).toString());
				textNome.setText(modelo.getValueAt(i, 1).toString());
				textLogradouro.setText(modelo.getValueAt(i, 2).toString());
				textNumero.setText(modelo.getValueAt(i, 3).toString());
				textCidade.setText(modelo.getValueAt(i, 4).toString());
				comboBoxEstado.setSelectedItem(modelo.getValueAt(i, 5).toString());
				textTelefone.setText(modelo.getValueAt(i, 6).toString());
			}
		});
		modelo = new DefaultTableModel();
		Object[] column = {"CPF", "Nome", "Logradouro", "Número", "Cidade", "Estado", "Telefone"};
		final Object[] row = new Object[7];
		modelo.setColumnIdentifiers(column);
		tableUsuario.setModel(modelo);
		tableUsuario.setBackground(new Color(255, 255, 255));
		scrollPaneUsuario.setViewportView(tableUsuario);
		
		JSeparator separator = new JSeparator();
		scrollPaneUsuario.setColumnHeaderView(separator);
		
		btnLimpar.setBounds(33, 221, 90, 30);
		contentPane.add(btnLimpar);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				clienteController.ValidarCpf();
				clienteController.ValidarNome();
				clienteController.ValidarLogradouro();
				clienteController.ValidarCidade();
				clienteController.ValidarTelefone();
				
			if(comboBoxEstado.getSelectedItem() == null ||
			 	   textNome.getText().equals("") ||
			   	   textNumero.getText().equals("") ||
			  	   textLogradouro.getText().equals("") ||
			   	   textCidade.getText().equals("") ||
			   	   textTelefone.getText().equals("") ||
			   	   textCpf.getText().equals("")){
				JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos");
		   } else {
		  		row[0]=textCpf.getText();
		  		row[1]=textNome.getText();
		  		row[2]=textLogradouro.getText();
		  		row[3]=textNumero.getText();
		  		row[4]=textCidade.getText();
		  		row[5]=comboBoxEstado.getSelectedItem();
		  		row[6]=textTelefone.getText();
		  		modelo.addRow(row);
		  		JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!");
		  		clienteController.Enviar();
		   }
			
			}
		});
		btnEnviar.setActionCommand("New buttons");
		btnEnviar.setBounds(397, 221, 90, 30);
		contentPane.add(btnEnviar);
		
		
		// Ele atualizar os campos enviados para tabela
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clienteController.ValidarCpf();
				clienteController.ValidarNome();
				clienteController.ValidarLogradouro();
				clienteController.ValidarCidade();
				clienteController.ValidarTelefone();
				if(comboBoxEstado.getSelectedItem() == null ||
					 	   textNome.getText().equals("") ||
					   	   textNumero.getText().equals("") ||
					  	   textLogradouro.getText().equals("") ||
					   	   textCidade.getText().equals("") ||
					   	   textTelefone.getText().equals("") ||
					   	   textCpf.getText().equals("")){
						JOptionPane.showMessageDialog(null, "Por favor preencha todos os campos");
				} else {
				
				int i = tableUsuario.getSelectedRow();
				modelo.setValueAt(textCpf.getText(), i, 0);
				modelo.setValueAt(textNome.getText(), i, 1);
				modelo.setValueAt(textLogradouro.getText(), i, 2);
				modelo.setValueAt(textNumero.getText(), i, 3);
				modelo.setValueAt(textCidade.getText(), i, 4);
				modelo.setValueAt(comboBoxEstado.getSelectedItem(), i, 5);
				modelo.setValueAt(textTelefone.getText(), i, 6);
				}
			}
		});
		btnAlterar.setActionCommand("New buttons");
		btnAlterar.setBounds(154, 221, 90, 30);
		contentPane.add(btnAlterar);
		
		JButton btnDeletar = new JButton("Deletar");
		btnDeletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = tableUsuario.getSelectedRow();
				if (i >= 0) {
					modelo.removeRow(i);
					
				} else {
					JOptionPane.showMessageDialog(null, "Selecione pelo menos um dado para ser deletado");
				}
				
			}
		});
		btnDeletar.setActionCommand("New buttons");
		btnDeletar.setBounds(273, 221, 90, 30);
		contentPane.add(btnDeletar);
		
	}
		
	public JTextField getTextCpf() {
        return textCpf;
    }

    public JTextField getTextNome() {
        return textNome;
    }
    
    public JTextField getTextLogradour() {
        return textLogradouro;
    }
    
    public JTextField getTextNumero() {
        return textNumero;
    }
    
    public JTextField getTextCidade() {
        return textCidade;
    }

    public JComboBox<String> getComboEstado() {
        return comboEstado;
    }
    
    public JTextField getTextTelefone() {
        return textTelefone;
    }

    public JButton getBtnLimpar() {
        return btnLimpar;
    }

    public JButton getBtnEnviar() {
        return btnEnviar;
    }
}
