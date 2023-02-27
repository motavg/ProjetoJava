/**
 * Criado para ser a tela principal
 * @author Vinícius Mota
 */

package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class loginGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtLogin;
	private JPasswordField txtSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					loginGUI frame = new loginGUI();
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
	public loginGUI() {
		setTitle("Tela de LoginGUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Login = new JLabel("Login");
		Login.setToolTipText("");
		Login.setHorizontalAlignment(SwingConstants.LEFT);
		Login.setBounds(128, 62, 86, 20);
		contentPane.add(Login);
		
		txtLogin = new JTextField();
		txtLogin.setToolTipText("");
		txtLogin.setHorizontalAlignment(SwingConstants.LEFT);
		txtLogin.setBounds(128, 87, 187, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel Senha = new JLabel("Senha");
		Senha.setToolTipText("");
		Senha.setHorizontalAlignment(SwingConstants.LEFT);
		Senha.setBounds(128, 110, 86, 20);
		contentPane.add(Senha);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(128, 130, 187, 20);
		contentPane.add(txtSenha);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String login = txtLogin.getText();
                String senha = new String(txtSenha.getPassword());
                /**
                 * Se o login e senha estiverem corretos
                 * ele envia para proxima dela
                 */
                if (login.equals("user") && senha.equals("12345")) {
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                    TelaCadastroGUI cadastro = new TelaCadastroGUI();
                    cadastro.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
                }
            }
        });
		btnEnviar.setBounds(226, 172, 89, 23);
		contentPane.add(btnEnviar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtLogin.setText("");
                txtSenha.setText("");
			}
		});
		btnLimpar.setBounds(128, 172, 89, 23);
		contentPane.add(btnLimpar);
	}
	
	
}
