import javax.swing.*;
//import Zoo.Animal;

public class Lista extends JFrame{
	private JPanel panel = new JPanel();
	private JLabel label;
	
	public Lista() {
		setTitle("Lista de Animales");
		setLayout(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);
		panel.setLayout(null);
		setContentPane(panel);
		
		this.label=new JLabel("Lista de Animales del Zoo");
		this.label.setBounds(300, 300, 80, 50);
		this.label.setVisible(true);
		panel.add(label);
		//Mostrar(); <-Método de la clase Animal
	}
}
