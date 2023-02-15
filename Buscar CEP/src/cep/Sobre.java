package cep;

import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Sobre extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sobre dialog = new Sobre();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public Sobre() {
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		setModal(true);
		getContentPane().setBackground(SystemColor.control);
		getContentPane().setEnabled(false);
		setResizable(false);
		setTitle("Sobre");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Sobre.class.getResource("/img/home.png")));
		setBounds(150, 150, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Buscar CEP - Ver 1.0");
		lblNewLabel.setBounds(62, 59, 161, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("@Autor Fernando Fraz\u00E3o");
		lblNewLabel_1.setBounds(62, 101, 161, 14);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("WEB Service: ");
		lblNewLabel_2.setBounds(62, 146, 88, 14);
		getContentPane().add(lblNewLabel_2);
		
		JLabel IblWebService = new JLabel("https://www.republicavirtual.com.br/");
		IblWebService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				link("https://www.republicavirtual.com.br/");
				
			}
		});
		IblWebService.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		IblWebService.setForeground(SystemColor.textHighlight);
		IblWebService.setBounds(148, 146, 197, 14);
		getContentPane().add(IblWebService);
		
		JButton btnLinkd = new JButton("");
		btnLinkd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				link("https://www.linkedin.com/in/fernandofrazao/");
			}
		});
		btnLinkd.setBorder(null);
		btnLinkd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLinkd.setBackground(SystemColor.control);
		btnLinkd.setIcon(new ImageIcon(Sobre.class.getResource("/img/logo LinkedIn.png")));
		btnLinkd.setBounds(127, 182, 48, 48);
		getContentPane().add(btnLinkd);
		
		JButton btnGit = new JButton("");
		btnGit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnGit.setBorder(null);
		btnGit.setBackground(SystemColor.control);
		btnGit.setToolTipText("git");
		btnGit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				link("https://github.com/fernandofrazao");
			}
			
				
		});
		btnGit.setIcon(new ImageIcon(Sobre.class.getResource("/img/logogit.png")));
		btnGit.setBounds(62, 182, 48, 48);
		getContentPane().add(btnGit);

	}
	// Esse � um m�todo respons�vel por abrir um site externo no navegador no padr�o do usu�rio
	
	private void link(String site) {
		Desktop desktop = Desktop.getDesktop();
		try {
			URI uri = new URI(site);
			desktop.browse(uri);
			
		}catch (Exception e) {
			System.out.print(e);
		}
	}
	

}
