<%--
��վ: <a href="http://www.crazyit.org">���Java����</a>
author  yeeku.H.lee kongyeeku@163.com
version  1.0
Copyright (C), 2001-2012, yeeku.H.Lee
This program is protected by copyright laws.
Program Name:
Date: 
--%>

<%-- ͨ��contentType����ָ����Ӧ������ͼƬ --%>
<%@ page contentType="image/jpeg" language="java"%>
<%@ page import="java.awt.image.*,javax.imageio.*,java.io.*,java.awt.*"%>
<%
//����BufferedImage����
BufferedImage image = new BufferedImage(340 , 
	160, BufferedImage.TYPE_INT_RGB);
//��Image�����ȡGraphics����
Graphics g = image.getGraphics();
//ʹ��Graphics��ͼ��������ͼ�񽫻������image������
g.fillRect(0,0,400,400);
//������ɫ����
g.setColor(new Color(255,0,0));
//����һ�λ�
g.fillArc(20, 20, 100,100, 30, 120);
//������ɫ����
g.setColor(new Color(0 , 255, 0));
//����һ�λ�
g.fillArc(20, 20, 100,100, 150, 120);
//������ɫ����
g.setColor(new Color(0 , 0, 255));
//����һ�λ�
g.fillArc(20, 20, 100,100, 270, 120);
//������ɫ����
g.setColor(new Color(0,0,0));
g.setFont(new Font("Arial Black", Font.PLAIN, 16));
//���������ַ���
g.drawString("red:climb" , 200 , 60);
g.drawString("green:swim" , 200 , 100);
g.drawString("blue:jump" , 200 , 140);
g.dispose();
//��ͼ�������ҳ�����Ӧ
ImageIO.write(image , "jpg" , response.getOutputStream());
%>
