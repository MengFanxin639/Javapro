package myclasspro;
/**
 * 包含一个单选按钮组和一个普通按钮，单选按钮组中包含三个单选，文本说明分别为"普通"
 * "黑体"和"斜体"。选择文本标签为"普通"的单选按钮时，普通按钮中的文字为普通字体
 * 选择文本标签为"黑体"的单选按钮时，普通按钮中的文字的字体为黑体，选择文本标签为
 * "斜体"的单选按钮时，普通按钮中的文字的字体为斜体
 * @version 1.0
 * @author 小新新
 * @2018年12月12日 下午3:48:36
 */

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;

public class FrmRadioDemo extends JFrame{

	public static void main(String[] args) {
		new FrmRadioDemo("按钮监听的演示");
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
		jButton = new JButton("普通按钮");
		jButtonCommon = new JRadioButton("普通");
		jButtonBlack = new JRadioButton("黑体");
		jButtonItalic = new JRadioButton("斜体");
		bGroup.add(jButtonCommon);
		bGroup.add(jButtonBlack);
		bGroup.add(jButtonItalic);
		panel.add(jButton);
		panel.add(jButtonCommon);
		panel.add(jButtonBlack);
		panel.add(jButtonItalic);
		handleFont = new HandleFont(jButton.getFont().getName(), jButton.getFont().getStyle());
		jButtonCommon.addActionListener(handleFont);
		handleFont = new HandleFont("黑体", 1);
		jButtonBlack.addActionListener(handleFont);
		handleFont = new HandleFont("黑体", Font.ITALIC);
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



































