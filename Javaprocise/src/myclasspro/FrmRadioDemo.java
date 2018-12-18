package myclasspro;
/**
 * ����һ����ѡ��ť���һ����ͨ��ť����ѡ��ť���а���������ѡ���ı�˵���ֱ�Ϊ"��ͨ"
 * "����"��"б��"��ѡ���ı���ǩΪ"��ͨ"�ĵ�ѡ��ťʱ����ͨ��ť�е�����Ϊ��ͨ����
 * ѡ���ı���ǩΪ"����"�ĵ�ѡ��ťʱ����ͨ��ť�е����ֵ�����Ϊ���壬ѡ���ı���ǩΪ
 * "б��"�ĵ�ѡ��ťʱ����ͨ��ť�е����ֵ�����Ϊб��
 * @version 1.0
 * @author С����
 * @2018��12��12�� ����3:48:36
 */

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class FrmRadioDemo extends JFrame{

	public static void main(String[] args) {
		new FrmRadioDemo("��ť��������ʾ");
	}
	
	private JPanel panel;
	private ButtonGroup bGroup;
	private JRadioButton jButtonCommon;
	private JRadioButton jButtonBlack;
	private JRadioButton jButtonItalic;
	private JButton jButton;
	private HandleFont handleFont;
	
	public FrmRadioDemo(String title) {
		super(title);
		init();
		this.setContentPane(panel);
		this.setSize(300, 200);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	private void init() {
		panel = new JPanel();
		bGroup = new ButtonGroup();
		jButton = new JButton("��ͨ��ť");
		jButtonCommon = new JRadioButton("��ͨ");
		jButtonBlack = new JRadioButton("����");
		jButtonItalic = new JRadioButton("б��");
		bGroup.add(jButtonCommon);
		bGroup.add(jButtonBlack);
		bGroup.add(jButtonItalic);
		panel.add(jButton);
		panel.add(jButtonCommon);
		panel.add(jButtonBlack);
		panel.add(jButtonItalic);
		handleFont = new HandleFont(jButton.getFont().getName(), jButton.getFont().getStyle());
		jButtonCommon.addActionListener(handleFont);
		handleFont = new HandleFont("����", 1);
		jButtonBlack.addActionListener(handleFont);
		handleFont = new HandleFont("����", Font.ITALIC);
		jButtonItalic.addActionListener(handleFont);
		
	}
	
	class HandleFont implements ActionListener{
		private String name;
		private int style;
		public HandleFont() {}
		public HandleFont(String name, int style) {
			this.name = name;
			this.style = style;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			jButton.setFont(new Font(name, style, 12));
		}
	}
}



































