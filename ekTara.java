/*
 
Ek Tara - First Marathi OS interface (Prototype)on top of Windows
	by Thinker's Academy

** For more info. refer to README.md
** Successfully tested on Windows -7
** For communication/bug reporting, contact- thinkersacademy@gmail.com

Pre-requisite

1) Windows OS (7/XP/8)
2) JDK - 6/7
3) marathi-lekhani font - M-Lekhani.TTF 
	- download fonts.zip from any site below / from github repository
	1) http://www.oocities.org/sathaye3767/fonts.htm)  
	2) http://www.angelfire.com/pop/top4/fonts/

 
 */

package apple;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.*;

public class ekTara{

  final static int interval = 1000;
  int i;
  JLabel label;
  JLabel label_X;
  JLabel label_0;
  JProgressBar punjabi_kida;
  Timer timer;
  JButton  bhairavnath;
  JFrame mendel;

  JPasswordField passwordField;

  public ekTara() {

  final JFrame mendel = new JFrame("Ek Tara");
  	//mendel.setDefaultLookAndFeelDecorated(true);
  	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	mendel.setSize(dim.width, dim.height);
	mendel.setUndecorated(true);



	//setting layout for pane
  	GridBagLayout shravan=new GridBagLayout();
  	mendel.setLayout(shravan); //setting gridbag layout


  //setting marathi font for title
	JLabel jallad=new JLabel("0k Taara",JLabel.CENTER);
	jallad.setFont(new Font("Marathi-Lekhani",Font.BOLD,180));
	jallad.setForeground(Color.RED);
	shadi_juda(shravan,jallad,10,10,10,10,GridBagConstraints.BASELINE);  //drawing
	mendel.getContentPane().add(jallad);

	//for tag line
	JLabel aa_zara=new JLabel("xu@d mra#I kayaR.ivt p/`alI",JLabel.CENTER);
	aa_zara.setFont(new Font("Marathi-Lekhani",Font.PLAIN,60));
	aa_zara.setForeground(Color.YELLOW);
	shadi_juda(shravan,aa_zara,10,10,10,10,GridBagConstraints.CENTER);  //drawing
	mendel.getContentPane().add(aa_zara);


	//Starting button
  	bhairavnath = new JButton("&I g~oxa");
  	bhairavnath.setFont(new Font("Marathi-Lekhani",Font.PLAIN,20));
  	//bhairavnath.setForeground(Color.BLUE);
  	bhairavnath.addActionListener(new ButtonListener());
  	mendel.getContentPane().add(bhairavnath);
    shadi_juda(shravan,bhairavnath,13,15,200,5,GridBagConstraints.PAGE_END);  //drawing



  //progress Bar
  punjabi_kida = new JProgressBar(0, 20);
  punjabi_kida.setValue(0);
  punjabi_kida.setStringPainted(true);
  mendel.getContentPane().add(punjabi_kida);
  shadi_juda(shravan,punjabi_kida,13,15,150,5,GridBagConstraints.PAGE_END);  //drawing


//Label--0
  label_0 = new JLabel("");
  label_0.setForeground(Color.GREEN);
  mendel.getContentPane().add(label_0);
  shadi_juda(shravan,label_0,10,15,65,5,GridBagConstraints.PAGE_END);  //drawing



  //Label--1
  label = new JLabel("Thinker's Academy");
  label.setFont(new Font("Serif",Font.BOLD,35));
  label.setForeground(Color.BLACK);
  mendel.getContentPane().add(label);
  shadi_juda(shravan,label,10,15,65,25,GridBagConstraints.LAST_LINE_END);  //drawing

//Label--2
  label_X = new JLabel("We innovate Innovations");
  label_X.setFont(new Font("Serif",Font.BOLD,20));
  label_X.setForeground(Color.BLACK);
  mendel.getContentPane().add(label_X);
  shadi_juda(shravan,label_X,10,15,35,65,GridBagConstraints.LAST_LINE_END);  //drawing


  //setting everything visible true
  mendel.setVisible(true);
  mendel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  //Create a timer.
  timer = new Timer(interval, new ActionListener() {
  public void actionPerformed(ActionEvent evt) {
  if (i == 20){
  Toolkit.getDefaultToolkit().beep();
  timer.stop();
  bhairavnath.setEnabled(true);
  punjabi_kida.setValue(0);

 //prakshepan purna
  String str = "p/9eipt  purn";
  label_0.setFont(new Font("Marathi-Lekhani",Font.PLAIN,40));
  label_0.setForeground(Color.CYAN);
  label_0.setText(str);

    mendel.getContentPane().removeAll();
  //mendel.validate();
  //to password
    dil_main_khanjar();

 //mendel.removeAll();

  }
  i = i + 2;
  punjabi_kida.setValue(i);
  }
  });
  }

  class ButtonListener implements ActionListener {
  public void actionPerformed(ActionEvent ae) {
	  bhairavnath.setEnabled(false);
  i = 0;
  String str ="p/9eipt hot Aahe __ __ __ __ __ __ " ;
  label_0.setFont(new Font("Marathi-Lekhani",Font.PLAIN,40));
  label_0.setForeground(Color.green);
  label_0.setText(str);
  timer.start();
  }
  } //button listener


	//Layout method
	public void shadi_juda(GridBagLayout p, JComponent c,int top,int left,int bottom,int right,int anchoria){
		GridBagConstraints samual=new GridBagConstraints();  //GridBagConstraints
		samual.gridx=0; //column
		samual.gridy=0;  //row
		samual.gridheight=1;  //height of component
		samual.gridwidth=1;  //width of component
		samual.weightx=1.0;  //horizontal spacing between cells & edges of container
		samual.weighty=1.0;
		samual.insets=new Insets(top,left,bottom,right);  //top,left,bottom,right
		samual.anchor=anchoria; //location of component within the cell
		p.setConstraints(c,samual);

	}//method

  //password method

	public void dil_main_khanjar(){

		final JFrame darwin = new JFrame("Password Window");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		darwin.setSize(dim.width, dim.height);
		darwin.setUndecorated(true);
		darwin.setVisible(true);
		darwin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		//setting layout for pane
	  	GridBagLayout shravan=new GridBagLayout();
	  	darwin.setLayout(shravan); //setting gridbag layout

		final String OK = "ok";
	    //String HELP = "help";
	    final JPasswordField passwordField;
	    final JFrame controllingFrame = null; //needed for dialogs

	    //password field
	    passwordField = new JPasswordField(10);
        passwordField.setActionCommand(OK);

        passwordField.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();

		        if (OK.equals(cmd)) { //Process the password.
		            char[] input = passwordField.getPassword();
		            if (isPasswordCorrect(input)) {

		            	darwin.dispose();
		            	//calling third window
		            	third_window();

		            	//JOptionPane.showMessageDialog(controllingFrame,"Success! You typed the right password.");
		            	} else {
		                JOptionPane.showMessageDialog(controllingFrame,"Invalid password. Try again."+"\n"+"Password:-ektara","Error Message",
		                    JOptionPane.ERROR_MESSAGE);
		            }

		            //Zero out the possible password, for security.
		            Arrays.fill(input, '0');

		            passwordField.selectAll();
		            passwordField.requestFocusInWindow();

		        }
		    }


		});  //action finished

        JLabel delhi_6 = new JLabel("s.ketXaBd");
        delhi_6.setFont(new Font("Marathi-Lekhani",Font.PLAIN,40));
        delhi_6.setForeground(Color.BLUE);
        delhi_6.setLabelFor(passwordField);


        //Lay out everything.
        JPanel textPane = new JPanel(new FlowLayout(FlowLayout.TRAILING));
        textPane.add(delhi_6);
        textPane.add(passwordField);
        darwin.add(textPane);

	} //password ends

private static boolean isPasswordCorrect(char[] input) {
    boolean isCorrect = true;
    char[] correctPassword = { 'e', 'k', 't', 'a', 'r', 'a' };

    if (input.length != correctPassword.length) {
        isCorrect = false;
    } else {
        isCorrect = Arrays.equals (input, correctPassword);
    }

    //Zero out the password.
    Arrays.fill(correctPassword,'0');

    return isCorrect;
}  //is password correct





public void third_window(){
	//new third window
	JFrame newton = new JFrame("Explorer");
	Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
	newton.setSize(dim.width, dim.height);
	newton.setUndecorated(true);
	newton.setVisible(true);
	newton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	GridBagLayout python_assembly=new GridBagLayout();
	newton.setLayout(python_assembly);

	//My computer-maze sangnak
	JButton aadat=new JButton("maze s.g`k");
	aadat.setFont(new Font("Marathi-Lekhani",Font.PLAIN,20));
	aadat.setForeground(Color.BLUE);
	newton.getContentPane().add(aadat);
	shadi_juda(python_assembly,aadat,10,10,10,10,GridBagConstraints.FIRST_LINE_START);  //drawing
	//adding materials
	aadat.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			ProcessBuilder explorer=new ProcessBuilder("explorer.exe");
			try {explorer.start();} catch (IOException e1) {}	}});  // my computer action over

	//Mydocument - maze dastavaj
	JButton gulabi=new JButton("maZo dSt0vj");
	gulabi.setFont(new Font("Marathi-Lekhani",Font.PLAIN,20));
	gulabi.setForeground(Color.BLUE);
	newton.getContentPane().add(gulabi);
	shadi_juda(python_assembly,gulabi,10,10,10,10,GridBagConstraints.FIRST_LINE_END);  //drawing
	//adding materials
	gulabi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			ProcessBuilder allah=new ProcessBuilder("explorer.exe");
			try {allah.start();} catch (IOException e1) {}	}});  // my document action over



	//Notepad-tiptatra-notepad
	JButton say_ya=new JButton("i3pp5-Nao3PaD");
	say_ya.setFont(new Font("Marathi-Lekhani",Font.PLAIN,20));
	say_ya.setForeground(Color.BLUE);
	newton.getContentPane().add(say_ya);
	shadi_juda(python_assembly,say_ya,100,10,10,10,GridBagConstraints.FIRST_LINE_START);  //drawing
	//adding materials
	say_ya.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			ProcessBuilder rasiya=new ProcessBuilder("notepad.exe");
			try {rasiya.start();} catch (IOException e1) {}	}});  // my computer action over


	//Paint-pent
	JButton full_volume=new JButton("Po.3");
	full_volume.setFont(new Font("Marathi-Lekhani",Font.PLAIN,20));
	full_volume.setForeground(Color.BLUE);
	newton.getContentPane().add(full_volume);
	shadi_juda(python_assembly,full_volume,100,10,10,10,GridBagConstraints.FIRST_LINE_END);  //drawing
	//adding materials
	full_volume.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			ProcessBuilder uff=new ProcessBuilder("mspaint.exe");
			try {uff.start();} catch (IOException e1) {}	}});  // my computer action over


	//calculator- ganakYantra
	JButton c_kida=new JButton("g`ky.5");
	c_kida.setFont(new Font("Marathi-Lekhani",Font.PLAIN,20));
	c_kida.setForeground(Color.BLUE);
	newton.getContentPane().add(c_kida);
	shadi_juda(python_assembly,c_kida,10,10,10,10,GridBagConstraints.ABOVE_BASELINE_LEADING);  //drawing
	//adding materials
	c_kida.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			ProcessBuilder dhua=new ProcessBuilder("calc.exe");
			try {dhua.start();} catch (IOException e1) {}	}});  // my computer action over

	//run
	JButton gul_batti=new JButton("rn");
	gul_batti.setFont(new Font("Marathi-Lekhani",Font.PLAIN,20));
	gul_batti.setForeground(Color.BLUE);
	newton.getContentPane().add(gul_batti);
	shadi_juda(python_assembly,gul_batti,100,10,10,10,GridBagConstraints.ABOVE_BASELINE_LEADING);  //drawing
	//adding materials
	gul_batti.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			ProcessBuilder romance=new ProcessBuilder("run.exe");
			try {romance.start();} catch (IOException e1) {}	}});  // my computer action over

	//cmd
	JButton thank_u=new JButton("hukUmp5");
	thank_u.setFont(new Font("Marathi-Lekhani",Font.PLAIN,20));
	thank_u.setForeground(Color.BLUE);
	newton.getContentPane().add(thank_u);
	shadi_juda(python_assembly,thank_u,10,10,10,10,GridBagConstraints.LAST_LINE_START);  //drawing
	//adding materials
	thank_u.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			ProcessBuilder explorer=new ProcessBuilder("cmd.exe");
			try {explorer.start();} catch (IOException e1) {}	}});  // my computer action over

	//control panel  hukUmp5
	JButton rasila=new JButton("iny.5k flk");
	rasila.setFont(new Font("Marathi-Lekhani",Font.PLAIN,20));
	rasila.setForeground(Color.BLUE);
	newton.getContentPane().add(rasila);
	shadi_juda(python_assembly,rasila,10,10,10,10,GridBagConstraints.LAST_LINE_END);  //drawing
	//adding materials
	rasila.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			ProcessBuilder logitech=new ProcessBuilder("control.exe");
			try {logitech.start();} catch (IOException e1) {}	}});  // my computer action over

	//power point
	JButton dhol=new JButton("XaKtI ke.d/");
	dhol.setFont(new Font("Marathi-Lekhani",Font.PLAIN,20));
	dhol.setForeground(Color.BLUE);
	newton.getContentPane().add(dhol);
	shadi_juda(python_assembly,dhol,10,100,10,10,GridBagConstraints.LAST_LINE_START);  //drawing
	//adding materials
	dhol.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
			ProcessBuilder jor=new ProcessBuilder("powerpnt.exe");
			try {jor.start();} catch (IOException e1) {}	}});  // my computer action over



} //third_window ends



  public static void main(String[] args) {
  
	  new ekTara(); // calling main Apps

  } //main ends
} //class ends