import java.applet.*;
import java.awt.*;

public class App extends Applet{
	public void paint(Graphics g){
		g.drawOval(0,0,200,200);
		g.setColor(Color.yellow);
		g.fillOval(0,0,200,200);
		g.drawOval(50,50,10,30);
		g.setColor(Color.black);
		g.fillOval(50,50,10,30);
		g.drawOval(150,50,10,30);
		g.setColor(Color.black);
		g.fillOval(150,50,10,30);
		g.drawArc(50,75,100,70,210,120);
		

	}
} 

/*
<applet code="App.class" width="300" height="300">  
</applet> 
*/