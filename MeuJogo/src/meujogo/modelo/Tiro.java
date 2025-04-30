package meujogo.modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Tiro {
	private Image imagem;
	private int x, y;
	private int largura, altura;
	private boolean isVisible;
	
	private static final int LARGURA = 938;
	private static int VELOCIDADE = 2;
	
	public Tiro(int x, int y) {
		this.x = x;
		this.y = y;
		isVisible = true;
	}
	
	public void load() {
		ImageIcon referencia = new ImageIcon("/home/luciano/eclipse-workspace/MeuJogo/resources/laser.png");
		imagem = referencia.getImage();
		this.largura = imagem.getWidth(null);
		this.altura = imagem.getHeight(null);
	}
	
	public void update() {
		this.x += VELOCIDADE;
		if (this.x > LARGURA) {
			isVisible =  false;
		}
	}

	public boolean isVisible() {
		return isVisible;
	}

	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	public static int getVELOCIDADE() {
		return VELOCIDADE;
	}

	public static void setVELOCIDADE(int vELOCIDADE) {
		VELOCIDADE = vELOCIDADE;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}
	
	
	
	
}
