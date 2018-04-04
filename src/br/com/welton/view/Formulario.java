package br.com.welton.view;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Formulario extends JFrame{

	private static final long serialVersionUID = 1L;


	/**
	 * Construtor
	 */
	public Formulario() {
		this.setLayout(new BorderLayout());
		this.setSize(800, 600);
		this.setTitle("Meu primeiro Form");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		
		JPanel p = new JPanel();
			p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
			//Adicionando ao jpanel
			p.add("prato",label("prato", JLabel.LEFT_ALIGNMENT));
//			p.add(Box.createRigidArea(new Dimension(10, 10)));
//			p.add(Box.createHorizontalGlue());
			Dimension minima = new Dimension(10, 10);
			Dimension preferida = new Dimension(30, 30);
			Dimension maxima = new Dimension(50, 50);
				
			p.add(new Box.Filler(minima, preferida, maxima));
			p.add("vista",label("tempero", JLabel.CENTER_ALIGNMENT));
//			p.add(Box.createRigidArea(new Dimension(10, 10)));
//			p.add(Box.createHorizontalGlue());
			p.add(new Box.Filler(minima, preferida, maxima));

			p.add("setembro",label("sabao", JLabel.RIGHT_ALIGNMENT));

		//Adicionando ao jframe
		this.add(p);
	}
	
	
	/**
	 * Método que cria uma descrição
	 * @param descricao - descrição escrita
	 * @param posicao - Posição do item
	 * @return JLabel - Retorna um label com as caracteristicas informadas.
	 */
	private JLabel label(String descricao, float posicao) {
		JLabel label = new JLabel(descricao);
		label.setAlignmentX(posicao);
		label.setPreferredSize(new Dimension(100, 100));
		return label;
	}
}
