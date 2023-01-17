// import java.awt.*;
// import java.awt.event.*;
// import java.applet.*;

// public class MouseEvents extends Applet implements MouseListener,MouseMotionListener {
//     String msg = "";
//     int mX = 0, mY=0;
    
//     public void init(){
//         addMouseListener(this);
//         addMouseMotionListener(this);
//     }
//     public void mouseClicked(MouseEvent me){
//         mX = 0;
//         mY = 10;
//         msg = "Mouse entered";
//         repaint();
//     }
//     public void mouseExcited(MouseEvent me){
//         mX = 0;
//         mY = 10;
//         msg = "Mouse excited";
//         repaint();
//     }
//     public void mousePressed(MouseEvent me){
//         mX = me.getX();
//         mY = me.getY();
//         msg = "Down";
//         repaint();
//     }
//     public void mouseReleased(MouseEvent me){
//         mX = me.getX();
//         mY = me.getY();
//         msg = "Up";
//         repaint();
//     }
//     public void mouseDragged(MouseEvent me){
//         mX = me.getX();
//         mY = me.getY();
//         msg = "*";
//         showStatus("Dragging mouse at "+mX+", "+mY);
//         repaint();
//     }
//     public void mouseMoved(MouseEvent me){
//         showStatus("Moving mouse at "+me.getX()+", "+me.getY());
//         repaint();
//     }
//     public void paint(Graphics g){
//         g.drawString(msg,mX,mY);
//     }
    
// }