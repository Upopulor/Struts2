package cn.wyc.banReSubmit;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Éú³ÉÍ¼Ïñ
 */
@WebServlet("/ImageServlet")
public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int width = 200;
		int height = 35;
		BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = image.getGraphics();
		g.setColor(Color.GRAY);
		g.fillRect(1, 1, width-2, height-2);
		g.setColor(Color.BLUE);
		g.drawRect(0, 0, width, height);
		g.setColor(Color.WHITE);
		Random r = new Random();
		for(int i = 0 ; i < 10 ; i++) {
			g.drawLine(r.nextInt(width), r.nextInt(height), r.nextInt(width), r.nextInt(height));
		}
		Font f = new Font("ËÎÌå", Font.BOLD, 30);
		g.setFont(f);
		g.setColor(Color.RED);
		int x=30;
		for (int i = 0; i < 4; i++) {
			g.drawString(String.valueOf(r.nextInt(10)), x, 25);
			x+=30;
		}
		ImageIO.write(image, "jpg", response.getOutputStream());
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
