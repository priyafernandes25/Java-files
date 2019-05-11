import java.applet.*;
import java.awt.*;

public class AppSmiley extends Applet{
	public void paint(Graphics g){
		g.drawOval(300,300,200,200);
		g.drawOval(340,350,40,40);
		g.drawOval(415,350,40,40);
		
		g.drawOval(300,230,50,100);
		g.drawOval(450,230,50,100);
		g.setColor(Color.yellow);
		g.fillOval(300,300,200,200);
		g.fillOval(300,230,50,100);
		g.fillOval(450,230,50,100);

		g.setColor(Color.black);
		g.drawLine(400,375,400,425);
		g.drawArc(300,250,200,200,245,50);
		g.fillOval(340,350,40,40);
		g.fillOval(415,350,40,40);



		//g.fillOval(300,300,200,200);
		
	} 
}


/*<applet code="AppSmiley.java" width="800" height="800">
</applet>*/