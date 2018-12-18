package ClassPro.registerdemo;

import java.awt.Image;

import javax.swing.*;
/**
 * ע��������ʾ
 * @version 1.0
 * @author С����
 * @2018��12��3�� ����12:19:13
 */
public class RegisterFrame extends JFrame {

	public static void main(String[] args) {
		RegisterFrame frame = new RegisterFrame("ע�����");
	}
	
	final Image jpg_ma = new ImageIcon("D:/javatext/Javaprocise/src/ClassPro/registerdemo/images/ma.jpg").getImage();
	
	//�������
	private JPanel jPanel;		//�������
	private JLabel label_user,	//�û���
		label_password,			//����
		label_confirmPassword,	//ȷ������
		label_desc,				//���˼��
		label_sex,				//�Ա�
		label_cardType,			//֤������
		label_cardId,			//֤������
		label_agreeItem;		//ͬ���������
	private JTextField jField_user;	//�û�����
	private JPasswordField jField_password;	//�����
	private JPasswordField jField_confirmPassword;	//ȷ�������
	private JTextArea jArea_desc;	//���˼��չʾ��
	private ButtonGroup group_sex;	//�Ա�ѡ��
	private JRadioButton jRadioButton_man;	//��ѡ����
	private JRadioButton jRadioButton_woman;	//��ѡ��Ů
	private JComboBox jComboBox_cardType;	//֤������	��	
	private JTextField jField_cardId;	//֤�����������
	private JCheckBox jCheckBox_agreeItem;	//ͬ��������ѡ��	
	
	String[] cardName = {"���֤","����","ѧ��֤","��ʻ֤","����֤","����"};
	
	public RegisterFrame(String title) {
		super(title);
		init();
		this.setIconImage(new ImageIcon(jpg_ma).getImage());
		//�������
		this.setVisible(true);
		this.setSize(320, 400);
		this.setLocationRelativeTo(null);
		this.setContentPane(jPanel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * ��ʼ�����
	 */
	private void init() {
		jPanel = new JPanel();
		//�ϲ��ִ������
		label_user = new JLabel("��  ��  ��:");
		label_password = new JLabel("��          ��:");
		label_confirmPassword = new JLabel("ȷ������:");
		jField_user = new JTextField(20);
		jField_password = new JPasswordField(20);
		jField_confirmPassword = new JPasswordField(20);
	
		//�ϲ���������
		jPanel.add(label_user);
		jPanel.add(jField_user);
		jPanel.add(label_password);
		jPanel.add(jField_password);
		jPanel.add(label_confirmPassword);
		jPanel.add(jField_confirmPassword);
		
		
		//�²��ִ������
		label_desc = new JLabel("���˼��:");
		jArea_desc = new JTextArea(10,20);
		label_sex = new JLabel("��       ��:");
		group_sex = new ButtonGroup();
		jRadioButton_man = new JRadioButton("��");
		jRadioButton_woman = new JRadioButton("Ů");
		label_cardType = new JLabel("֤������:");
		jComboBox_cardType = new JComboBox(cardName);
		label_cardId = new JLabel("֤������:");
		jField_cardId = new JTextField(20);
		label_agreeItem = new JLabel("ͬ���������:");
		jCheckBox_agreeItem = new JCheckBox("���Ѿ�������ͬ��ʹ��Э��");
		
		//�²���������
		jPanel.add(label_desc);
		jPanel.add(jArea_desc);
		jPanel.add(label_sex);
		group_sex.add(jRadioButton_man);
		group_sex.add(jRadioButton_woman);
		jPanel.add(jRadioButton_man);
		jPanel.add(jRadioButton_woman);
		jPanel.add(label_cardType);
		jPanel.add(jComboBox_cardType);
		jPanel.add(label_cardId);
		jPanel.add(jField_cardId);
		jPanel.add(label_agreeItem);
		jPanel.add(jCheckBox_agreeItem);
		
		
		
	}
	

}
