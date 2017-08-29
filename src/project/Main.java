package project;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Main extends JComponent implements ActionListener {
	private JFrame frame = new JFrame();
	private JPanel buttons = new JPanel();
	private JPanel buttons2 = new JPanel();

	private BackGround bg = new BackGround();

	private JButton startDancing = new JButton("Start Dancing!");
	private JButton creatRobot1 = new JButton("Creat Mario");
	private JButton creatRobot2 = new JButton("Creat Luigi");
	private JButton stopDancing = new JButton("Stop!");
	private JButton r1jump = new JButton("Mario Jump!");
	private JButton r2jump = new JButton("Luigi Jump!");

	private JRadioButton music1 = new JRadioButton("Music1");
	private JRadioButton music3 = new JRadioButton("Music2");
	private JButton music4 = new JButton("Music start!");
	private JButton music2 = new JButton("Music stop!");

	ButtonGroup group = new ButtonGroup();

	private boolean r1Vissible = false;
	private boolean r2Vissible = false;
	private boolean r1Running = false;
	private boolean r2Running = false;
	private boolean isMusic1=false;
	private boolean isMusic2=false;

	private static Clip bgm = null;
	private static Clip coinsound = null;
	private static Clip jumpsound = null;

	public Main() {

		startDancing.addActionListener(this);
		startDancing.setActionCommand("Start Dancing");
		creatRobot1.addActionListener(this);
		creatRobot1.setActionCommand("Creat Robot1");
		creatRobot2.addActionListener(this);
		creatRobot2.setActionCommand("Creat Robot2");
		stopDancing.addActionListener(this);
		stopDancing.setActionCommand("Stop");
		r1jump.addActionListener(this);
		r1jump.setActionCommand("r1jump");
		r2jump.addActionListener(this);
		r2jump.setActionCommand("r2jump");

		music1.addActionListener(this);
		music1.setActionCommand("music1");
		music3.addActionListener(this);
		music3.setActionCommand("music3");
		music4.addActionListener(this);
		music4.setActionCommand("music4");
		music2.addActionListener(this);
		music2.setActionCommand("music2");

		buttons.setLayout(new GridLayout(2, 4));
		buttons2.setLayout(new GridLayout(4, 1,100,100));
		buttons.add(startDancing);
		buttons.add(creatRobot1);
		buttons.add(creatRobot2);
		buttons.add(stopDancing);
		buttons.add(r1jump);
		buttons.add(r2jump);

		buttons2.add(music1);
		buttons2.add(music3);
		buttons2.add(music4);
		buttons2.add(music2);

		group.add(music1);
		group.add(music3);

		frame.setSize(1100, 800);
		frame.setLayout(new BorderLayout());
		frame.setTitle("Dancing Robot!");
		frame.add(bg, BorderLayout.CENTER);
		frame.add(buttons, BorderLayout.SOUTH);
		frame.add(buttons2, BorderLayout.EAST);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

	static public void main(String[] args) {
		new Main();
	}

	public void actionPerformed(ActionEvent e) {

		File bgm = new File("수퍼마리오.wav");
		File bgm2 = new File("underground.wav");

		switch (e.getActionCommand()) {
		case "Start Dancing":

			if (r1Vissible && !r1Running) {
				r1Running = true;
				bg.getRobot1().setStop();
				bg.setGame();
			}

			if (r2Vissible && !r2Running) {
				r2Running = true;
				bg.getRobot2().setStop();
				bg.setGame();
			}

			break;
		case "Creat Robot1":
			if (bg.getRobot1().getVissible() != true) {
				r1Vissible = bg.r1Visible();
				bg.r1Start();
			}
			break;
		case "Creat Robot2":
			if (bg.getRobot2().getVissible() != true) {
				r2Vissible = bg.r2Visible();
				bg.r2Start();
			}
			break;
		case "Stop":
			bg.stop();
			r1Running = false;
			r2Running = false;
			break;
		case "r1jump":
			if (bg.getRobot1().getVissible())
				bg.getRobot1().setJump();

			break;

		case "r2jump":
			if (bg.getRobot2().getVissible())
				bg.getRobot2().setJump();
			break;

		case "music1":
			if(!isMusic1&&!isMusic2){
				PlaySound(bgm);
				isMusic1=true;
			}

			break;
		case "music3":
			if(!isMusic2&&!isMusic1){
				PlaySound(bgm2);
				isMusic2=true;
			}

			break;

		case "music2":
			
			this.bgm.close();
			isMusic1=false;
			isMusic2=false;

			break;

		case "music4":
			if(isMusic1||isMusic2)
				this.bgm.start();
			break;

		}

	}

	static void PlaySound(File Sound) {
		try {
			bgm = AudioSystem.getClip();
			bgm.open(AudioSystem.getAudioInputStream(Sound));

		} catch (Exception e) {

		}
	}

	static void jumpSound(File Sound) {
		try {
			jumpsound = AudioSystem.getClip();
			jumpsound.open(AudioSystem.getAudioInputStream(Sound));
			jumpsound.start();

		} catch (Exception e) {

		}
	}

	static void coinSound(File Sound) {
		try {
			coinsound = AudioSystem.getClip();
			coinsound.open(AudioSystem.getAudioInputStream(Sound));
			coinsound.start();

		} catch (Exception e) {

		}
	}

}
