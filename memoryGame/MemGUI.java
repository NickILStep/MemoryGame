package memoryGame;

/*
Code written by Nicholas Stephenson
Final project - CS 1400 @ Weber State University
November-December 2020
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MemGUI extends JPanel
{
   //Declare variables
   private JFrame window = new JFrame("Memory Game");
   private JPanel tableCloth = new JPanel();
   private JTextArea output = new JTextArea("");
   private JEditorPane scoreboard = new JEditorPane("text/html", "");
   private JTextField playerName = new JTextField("");
   private JButton toggleSound = new JButton("Turn Sound Off");
   private JButton restart = new JButton("Restart");
   private JButton addScore = new JButton("Submit");
   private JLabel currentScore = new JLabel("Turns:   0", SwingConstants.RIGHT);
   private final JLabel creator = new JLabel("Made By: Nick Stephenson");
   
   //Code found on https://www.quora.com/How-can-I-add-a-scrollbar-to-a-text-area-in-Java, inspired by Jo�o Henrique Viana Oliveira
   JScrollPane toScroll = new JScrollPane(scoreboard);
   
   private int choice = 0;
   private int score = 0;
   private int match = 0;
   private boolean soundYN = true;
   
   //Links to other document
   MemCards MemCards = new MemCards();
   
   //FOR TESTING SCOREBOARD CODE--------------------------------------------------
   // String test = MemCards.scoresToString();
   //-----------------------------------------------------------------------------
   
   //Variables to make card selection
   private int genX;
   private int genY;
   private int selectX1;
   private int selectX2;
   private int selectY1;
   private int selectY2;
   private int cardSelect;
   private int cardChoice1;
   private int cardChoice2;
   
   //Cards
   //Images for cards found on http://acbl.mybigcommerce.com/52-playing-cards/
   private JLabel card0;
   private JLabel card1;
   private JLabel card2;
   private JLabel card3;
   private JLabel card4;
   private JLabel card5;
   private JLabel card6;
   private JLabel card7;
   private JLabel card8;
   private JLabel card9;
   private JLabel card10;
   private JLabel card11;
   private JLabel card12;
   
   private JLabel card13;
   private JLabel card14;
   private JLabel card15;
   private JLabel card16;
   private JLabel card17;
   private JLabel card18;
   private JLabel card19;
   private JLabel card20;
   private JLabel card21;
   private JLabel card22;
   private JLabel card23;
   private JLabel card24;
   private JLabel card25;
   
   private JLabel card26;
   private JLabel card27;
   private JLabel card28;
   private JLabel card29;
   private JLabel card30;
   private JLabel card31;
   private JLabel card32;
   private JLabel card33;
   private JLabel card34;
   private JLabel card35;
   private JLabel card36;
   private JLabel card37;
   private JLabel card38;
   
   private JLabel card39;
   private JLabel card40;
   private JLabel card41;
   private JLabel card42;
   private JLabel card43;
   private JLabel card44;
   private JLabel card45;
   private JLabel card46;
   private JLabel card47;
   private JLabel card48;
   private JLabel card49;
   private JLabel card50;
   private JLabel card51;
   
   //Card backs
   private JLabel back0 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back1 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back2 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back3 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back4 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back5 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back6 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back7 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back8 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back9 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back10 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back11 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back12 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   
   private JLabel back13 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back14 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back15 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back16 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back17 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back18 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back19 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back20 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back21 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back22 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back23 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back24 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back25 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   
   private JLabel back26 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back27 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back28 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back29 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back30 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back31 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back32 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back33 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back34 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back35 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back36 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back37 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back38 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   
   private JLabel back39 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back40 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back41 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back42 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back43 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back44 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back45 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back46 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back47 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back48 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back49 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back50 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   private JLabel back51 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/blue_back.jpg")));
   
   //Card selection buttons
   private JButton pos0 = new JButton("^");
   private JButton pos1 = new JButton("^");
   private JButton pos2 = new JButton("^");
   private JButton pos3 = new JButton("^");
   private JButton pos4 = new JButton("^");
   private JButton pos5 = new JButton("^");
   private JButton pos6 = new JButton("^");
   private JButton pos7 = new JButton("^");
   private JButton pos8 = new JButton("^");
   private JButton pos9 = new JButton("^");
   private JButton pos10 = new JButton("^");
   private JButton pos11 = new JButton("^");
   private JButton pos12 = new JButton("^");
   
   private JButton pos13 = new JButton("^");
   private JButton pos14 = new JButton("^");
   private JButton pos15 = new JButton("^");
   private JButton pos16 = new JButton("^");
   private JButton pos17 = new JButton("^");
   private JButton pos18 = new JButton("^");
   private JButton pos19 = new JButton("^");
   private JButton pos20 = new JButton("^");
   private JButton pos21 = new JButton("^");
   private JButton pos22 = new JButton("^");
   private JButton pos23 = new JButton("^");
   private JButton pos24 = new JButton("^");
   private JButton pos25 = new JButton("^");
   
   private JButton pos26 = new JButton("^");
   private JButton pos27 = new JButton("^");
   private JButton pos28 = new JButton("^");
   private JButton pos29 = new JButton("^");
   private JButton pos30 = new JButton("^");
   private JButton pos31 = new JButton("^");
   private JButton pos32 = new JButton("^");
   private JButton pos33 = new JButton("^");
   private JButton pos34 = new JButton("^");
   private JButton pos35 = new JButton("^");
   private JButton pos36 = new JButton("^");
   private JButton pos37 = new JButton("^");
   private JButton pos38 = new JButton("^");
   
   private JButton pos39 = new JButton("^");
   private JButton pos40 = new JButton("^");
   private JButton pos41 = new JButton("^");
   private JButton pos42 = new JButton("^");
   private JButton pos43 = new JButton("^");
   private JButton pos44 = new JButton("^");
   private JButton pos45 = new JButton("^");
   private JButton pos46 = new JButton("^");
   private JButton pos47 = new JButton("^");
   private JButton pos48 = new JButton("^");
   private JButton pos49 = new JButton("^");
   private JButton pos50 = new JButton("^");
   private JButton pos51 = new JButton("^");
   
   public MemGUI()
   {
      setLayout(null);
      
      //Set up cards
      cardBacks();
      cardValues();
      cardPositions();
      buttons();
      
      //Output formatting
      output.setText("Welcome to Memory! Choose two cards and see if they match. Cards of the same color and face value will match. Once matched, a pair will be removed. You will win once all cards are removed.");
      output.setFont(output.getFont().deriveFont(18.0f));
      output.setWrapStyleWord(true);
      output.setLineWrap(true);
      output.setOpaque(false);
      output.setEditable(false);
      
      //Scoreboard formatting
      scoreboard.setText("");
      scoreboard.setFont(output.getFont().deriveFont(18.0f));
      scoreboard.setOpaque(false);
      scoreboard.setEditable(false);
      
      //Set output position
      output.setBounds(10, 510, 660, 100);
      restart.setBounds(150, 615, 100, 20);
      toScroll.setBounds(10, 20, 662, 580);
      playerName.setBounds(216, 265, 200, 20);
      addScore.setBounds(266, 290, 100, 20);
      currentScore.setBounds(537, 615, 125, 20);
      toggleSound.setBounds(10, 615, 125, 20);
      creator.setBounds(300, 615, 200, 20);
      
      //Add output
      add(output);
      add(restart);
      add(toScroll);
      add(playerName);
      add(addScore);
      add(currentScore);
      add(toggleSound);
      add(creator);
      
      //Make toScroll, playerName and addScore invisible until later
      toScroll.setVisible(false);
      playerName.setVisible(false);
      addScore.setVisible(false);
      
      //Background formatting
      tableCloth.setBackground(Color.decode("#0abd0a"));
      tableCloth.setSize(697, 690);
      add(tableCloth);
      
      //Set window size
      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      window.setSize(697, 690);
      window.setResizable(false);
      window.setLocationRelativeTo(null);
      window.add(this);
      window.setVisible(true);
   }
   
   //Assign each position a random card face
   public void cardValues()
   {
      int randFace;
      
      //Card0
      randFace = MemCards.getPosition(0, 0);
      card0 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card1
      randFace = MemCards.getPosition(0, 1);
      card1 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card2
      randFace = MemCards.getPosition(0, 2);
      card2 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card3
      randFace = MemCards.getPosition(0, 3);
      card3 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card4
      randFace = MemCards.getPosition(0, 4);
      card4 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card5
      randFace = MemCards.getPosition(0, 5);
      card5 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card6
      randFace = MemCards.getPosition(0, 6);
      card6 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card7
      randFace = MemCards.getPosition(0, 7);
      card7 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card8
      randFace = MemCards.getPosition(0, 8);
      card8 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card9
      randFace = MemCards.getPosition(0, 9);
      card9 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card10
      randFace = MemCards.getPosition(0, 10);
      card10 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card11
      randFace = MemCards.getPosition(0, 11);
      card11 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card12
      randFace = MemCards.getPosition(0, 12);
      card12 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      
      //Card13
      randFace = MemCards.getPosition(1, 0);
      card13 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card14
      randFace = MemCards.getPosition(1, 1);
      card14 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card15
      randFace = MemCards.getPosition(1, 2);
      card15 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card16
      randFace = MemCards.getPosition(1, 3);
      card16 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card17
      randFace = MemCards.getPosition(1, 4);
      card17 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card18
      randFace = MemCards.getPosition(1, 5);
      card18 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card19
      randFace = MemCards.getPosition(1, 6);
      card19 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card20
      randFace = MemCards.getPosition(1, 7);
      card20 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card21
      randFace = MemCards.getPosition(1, 8);
      card21 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card22
      randFace = MemCards.getPosition(1, 9);
      card22 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card23
      randFace = MemCards.getPosition(1, 10);
      card23 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card24
      randFace = MemCards.getPosition(1, 11);
      card24 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card25
      randFace = MemCards.getPosition(1, 12);
      card25 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      
      //Card26
      randFace = MemCards.getPosition(2, 0);
      card26 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card27
      randFace = MemCards.getPosition(2, 1);
      card27 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card28
      randFace = MemCards.getPosition(2, 2);
      card28 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card29
      randFace = MemCards.getPosition(2, 3);
      card29 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card30
      randFace = MemCards.getPosition(2, 4);
      card30 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card31
      randFace = MemCards.getPosition(2, 5);
      card31 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card32
      randFace = MemCards.getPosition(2, 6);
      card32 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card33
      randFace = MemCards.getPosition(2, 7);
      card33 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card34
      randFace = MemCards.getPosition(2, 8);
      card34 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card35
      randFace = MemCards.getPosition(2, 9);
      card35 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card36
      randFace = MemCards.getPosition(2, 10);
      card36 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card37
      randFace = MemCards.getPosition(2, 11);
      card37 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card38
      randFace = MemCards.getPosition(2, 12);
      card38 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      
      //Card39
      randFace = MemCards.getPosition(3, 0);
      card39 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card40
      randFace = MemCards.getPosition(3, 1);
      card40 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card41
      randFace = MemCards.getPosition(3, 2);
      card41 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card42
      randFace = MemCards.getPosition(3, 3);
      card42 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card43
      randFace = MemCards.getPosition(3, 4);
      card43 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card44
      randFace = MemCards.getPosition(3, 5);
      card44 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card45
      randFace = MemCards.getPosition(3, 6);
      card45 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card46
      randFace = MemCards.getPosition(3, 7);
      card46 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card47
      randFace = MemCards.getPosition(3, 8);
      card47 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card48
      randFace = MemCards.getPosition(3, 9);
      card48 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card49
      randFace = MemCards.getPosition(3, 10);
      card49 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card50
      randFace = MemCards.getPosition(3, 11);
      card50 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
      //Card51
      randFace = MemCards.getPosition(3, 12);
      card51 = new JLabel(new ImageIcon(getClass().getResource("Assets/Cards/Card"+randFace+".jpg")));
   }
   
   public void cardPositions()
   {
      //Set card positions
      card0.setBounds(10, 10, 50, 75);
      card1.setBounds(61, 10, 50, 75);
      card2.setBounds(112, 10, 50, 75);
      card3.setBounds(163, 10, 50, 75);
      card4.setBounds(214, 10, 50, 75);
      card5.setBounds(265, 10, 50, 75);
      card6.setBounds(316, 10, 50, 75);
      card7.setBounds(367, 10, 50, 75);
      card8.setBounds(418, 10, 50, 75);
      card9.setBounds(469, 10, 50, 75);
      card10.setBounds(520, 10, 50, 75);
      card11.setBounds(571, 10, 50, 75);
      card12.setBounds(622, 10, 50, 75);
      
      card13.setBounds(10, 130, 50, 75);
      card14.setBounds(61, 130, 50, 75);
      card15.setBounds(112, 130, 50, 75);
      card16.setBounds(163, 130, 50, 75);
      card17.setBounds(214, 130, 50, 75);
      card18.setBounds(265, 130, 50, 75);
      card19.setBounds(316, 130, 50, 75);
      card20.setBounds(367, 130, 50, 75);
      card21.setBounds(418, 130, 50, 75);
      card22.setBounds(469, 130, 50, 75);
      card23.setBounds(520, 130, 50, 75);
      card24.setBounds(571, 130, 50, 75);
      card25.setBounds(622, 130, 50, 75);
      
      card26.setBounds(10, 250, 50, 75);
      card27.setBounds(61, 250, 50, 75);
      card28.setBounds(112, 250, 50, 75);
      card29.setBounds(163, 250, 50, 75);
      card30.setBounds(214, 250, 50, 75);
      card31.setBounds(265, 250, 50, 75);
      card32.setBounds(316, 250, 50, 75);
      card33.setBounds(367, 250, 50, 75);
      card34.setBounds(418, 250, 50, 75);
      card35.setBounds(469, 250, 50, 75);
      card36.setBounds(520, 250, 50, 75);
      card37.setBounds(571, 250, 50, 75);
      card38.setBounds(622, 250, 50, 75);
      
      card39.setBounds(10, 370, 50, 75);
      card40.setBounds(61, 370, 50, 75);
      card41.setBounds(112, 370, 50, 75);
      card42.setBounds(163, 370, 50, 75);
      card43.setBounds(214, 370, 50, 75);
      card44.setBounds(265, 370, 50, 75);
      card45.setBounds(316, 370, 50, 75);
      card46.setBounds(367, 370, 50, 75);
      card47.setBounds(418, 370, 50, 75);
      card48.setBounds(469, 370, 50, 75);
      card49.setBounds(520, 370, 50, 75);
      card50.setBounds(571, 370, 50, 75);
      card51.setBounds(622, 370, 50, 75);
      
      //Play opening sound
      MemCards.playSound("shuffle.wav", soundYN);
      
      //Add cards to window
      add(card0);
      add(card1);
      add(card2);
      add(card3);
      add(card4);
      add(card5);
      add(card6);
      add(card7);
      add(card8);
      add(card9);
      add(card10);
      add(card11);
      add(card12);
      
      add(card13);
      add(card14);
      add(card15);
      add(card16);
      add(card17);
      add(card18);
      add(card19);
      add(card20);
      add(card21);
      add(card22);
      add(card23);
      add(card24);
      add(card25);
      
      add(card26);
      add(card27);
      add(card28);
      add(card29);
      add(card30);
      add(card31);
      add(card32);
      add(card33);
      add(card34);
      add(card35);
      add(card36);
      add(card37);
      add(card38);
      
      add(card39);
      add(card40);
      add(card41);
      add(card42);
      add(card43);
      add(card44);
      add(card45);
      add(card46);
      add(card47);
      add(card48);
      add(card49);
      add(card50);
      add(card51);

   }
   
   public void cardBacks()
   {
      //Set card back positions
      back0.setBounds(10, 10, 50, 75);
      back1.setBounds(61, 10, 50, 75);
      back2.setBounds(112, 10, 50, 75);
      back3.setBounds(163, 10, 50, 75);
      back4.setBounds(214, 10, 50, 75);
      back5.setBounds(265, 10, 50, 75);
      back6.setBounds(316, 10, 50, 75);
      back7.setBounds(367, 10, 50, 75);
      back8.setBounds(418, 10, 50, 75);
      back9.setBounds(469, 10, 50, 75);
      back10.setBounds(520, 10, 50, 75);
      back11.setBounds(571, 10, 50, 75);
      back12.setBounds(622, 10, 50, 75);
      
      back13.setBounds(10, 130, 50, 75);
      back14.setBounds(61, 130, 50, 75);
      back15.setBounds(112, 130, 50, 75);
      back16.setBounds(163, 130, 50, 75);
      back17.setBounds(214, 130, 50, 75);
      back18.setBounds(265, 130, 50, 75);
      back19.setBounds(316, 130, 50, 75);
      back20.setBounds(367, 130, 50, 75);
      back21.setBounds(418, 130, 50, 75);
      back22.setBounds(469, 130, 50, 75);
      back23.setBounds(520, 130, 50, 75);
      back24.setBounds(571, 130, 50, 75);
      back25.setBounds(622, 130, 50, 75);
      
      back26.setBounds(10, 250, 50, 75);
      back27.setBounds(61, 250, 50, 75);
      back28.setBounds(112, 250, 50, 75);
      back29.setBounds(163, 250, 50, 75);
      back30.setBounds(214, 250, 50, 75);
      back31.setBounds(265, 250, 50, 75);
      back32.setBounds(316, 250, 50, 75);
      back33.setBounds(367, 250, 50, 75);
      back34.setBounds(418, 250, 50, 75);
      back35.setBounds(469, 250, 50, 75);
      back36.setBounds(520, 250, 50, 75);
      back37.setBounds(571, 250, 50, 75);
      back38.setBounds(622, 250, 50, 75);
      
      back39.setBounds(10, 370, 50, 75);
      back40.setBounds(61, 370, 50, 75);
      back41.setBounds(112, 370, 50, 75);
      back42.setBounds(163, 370, 50, 75);
      back43.setBounds(214, 370, 50, 75);
      back44.setBounds(265, 370, 50, 75);
      back45.setBounds(316, 370, 50, 75);
      back46.setBounds(367, 370, 50, 75);
      back47.setBounds(418, 370, 50, 75);
      back48.setBounds(469, 370, 50, 75);
      back49.setBounds(520, 370, 50, 75);
      back50.setBounds(571, 370, 50, 75);
      back51.setBounds(622, 370, 50, 75);
            
      //Add card backs to window
      add(back0);
      add(back1);
      add(back2);
      add(back3);
      add(back4);
      add(back5);
      add(back6);
      add(back7);
      add(back8);
      add(back9);
      add(back10);
      add(back11);
      add(back12);
      
      add(back13);
      add(back14);
      add(back15);
      add(back16);
      add(back17);
      add(back18);
      add(back19);
      add(back20);
      add(back21);
      add(back22);
      add(back23);
      add(back24);
      add(back25);
      
      add(back26);
      add(back27);
      add(back28);
      add(back29);
      add(back30);
      add(back31);
      add(back32);
      add(back33);
      add(back34);
      add(back35);
      add(back36);
      add(back37);
      add(back38);
      
      add(back39);
      add(back40);
      add(back41);
      add(back42);
      add(back43);
      add(back44);
      add(back45);
      add(back46);
      add(back47);
      add(back48);
      add(back49);
      add(back50);
      add(back51);
   }
   
   public void buttons()
   {
      //Set button positions
      pos0.setBounds(10, 90, 50, 30);
      pos1.setBounds(61, 90, 50, 30);
      pos2.setBounds(112, 90, 50, 30);
      pos3.setBounds(163, 90, 50, 30);
      pos4.setBounds(214, 90, 50, 30);
      pos5.setBounds(265, 90, 50, 30);
      pos6.setBounds(316, 90, 50, 30);
      pos7.setBounds(367, 90, 50, 30);
      pos8.setBounds(418, 90, 50, 30);
      pos9.setBounds(469, 90, 50, 30);
      pos10.setBounds(520, 90, 50, 30);
      pos11.setBounds(571, 90, 50, 30);
      pos12.setBounds(622, 90, 50, 30);
      
      pos13.setBounds(10, 210, 50, 30);
      pos14.setBounds(61, 210, 50, 30);
      pos15.setBounds(112, 210, 50, 30);
      pos16.setBounds(163, 210, 50, 30);
      pos17.setBounds(214, 210, 50, 30);
      pos18.setBounds(265, 210, 50, 30);
      pos19.setBounds(316, 210, 50, 30);
      pos20.setBounds(367, 210, 50, 30);
      pos21.setBounds(418, 210, 50, 30);
      pos22.setBounds(469, 210, 50, 30);
      pos23.setBounds(520, 210, 50, 30);
      pos24.setBounds(571, 210, 50, 30);
      pos25.setBounds(622, 210, 50, 30);
      
      pos26.setBounds(10, 330, 50, 30);
      pos27.setBounds(61, 330, 50, 30);
      pos28.setBounds(112, 330, 50, 30);
      pos29.setBounds(163, 330, 50, 30);
      pos30.setBounds(214, 330, 50, 30);
      pos31.setBounds(265, 330, 50, 30);
      pos32.setBounds(316, 330, 50, 30);
      pos33.setBounds(367, 330, 50, 30);
      pos34.setBounds(418, 330, 50, 30);
      pos35.setBounds(469, 330, 50, 30);
      pos36.setBounds(520, 330, 50, 30);
      pos37.setBounds(571, 330, 50, 30);
      pos38.setBounds(622, 330, 50, 30);
      
      pos39.setBounds(10, 450, 50, 30);
      pos40.setBounds(61, 450, 50, 30);
      pos41.setBounds(112, 450, 50, 30);
      pos42.setBounds(163, 450, 50, 30);
      pos43.setBounds(214, 450, 50, 30);
      pos44.setBounds(265, 450, 50, 30);
      pos45.setBounds(316, 450, 50, 30);
      pos46.setBounds(367, 450, 50, 30);
      pos47.setBounds(418, 450, 50, 30);
      pos48.setBounds(469, 450, 50, 30);
      pos49.setBounds(520, 450, 50, 30);
      pos50.setBounds(571, 450, 50, 30);
      pos51.setBounds(622, 450, 50, 30);
      
      //Add buttons to window
      add(pos0);
      add(pos1);
      add(pos2);
      add(pos3);
      add(pos4);
      add(pos5);
      add(pos6);
      add(pos7);
      add(pos8);
      add(pos9);
      add(pos10);
      add(pos11);
      add(pos12);
      
      add(pos13);
      add(pos14);
      add(pos15);
      add(pos16);
      add(pos17);
      add(pos18);
      add(pos19);
      add(pos20);
      add(pos21);
      add(pos22);
      add(pos23);
      add(pos24);
      add(pos25);
      
      add(pos26);
      add(pos27);
      add(pos28);
      add(pos29);
      add(pos30);
      add(pos31);
      add(pos32);
      add(pos33);
      add(pos34);
      add(pos35);
      add(pos36);
      add(pos37);
      add(pos38);
      
      add(pos39);
      add(pos40);
      add(pos41);
      add(pos42);
      add(pos43);
      add(pos44);
      add(pos45);
      add(pos46);
      add(pos47);
      add(pos48);
      add(pos49);
      add(pos50);
      add(pos51);
      
      //Action listener for sound toggle
      toggleSound.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            if(soundYN)
            {
               soundYN = false;
               toggleSound.setText("Turn Sound On");
            }
            else
            {
               soundYN = true;
               toggleSound.setText("Turn Sound Off");
            }
         }
      });
      
      //Action listener for restart
      restart.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            restart();
         }
      });
      
      //Action listeners
      pos0.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back0.setVisible(false);
            pos0.setEnabled(false);
            genX = 0;
            genY = 0;
            cardSelect = 0;
            choiceMade();
         }
      });
      pos1.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back1.setVisible(false);
            pos1.setEnabled(false);
            genX = 1;
            genY = 0;
            cardSelect = 1;
            choiceMade();
         }
      });
      pos2.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back2.setVisible(false);
            pos2.setEnabled(false);
            genX = 2;
            genY = 0;
            cardSelect = 2;
            choiceMade();
         }
      });
      pos3.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back3.setVisible(false);
            pos3.setEnabled(false);
            genX = 3;
            genY = 0;
            cardSelect = 3;
            choiceMade();
         }
      });
      pos4.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back4.setVisible(false);
            pos4.setEnabled(false);
            genX = 4;
            genY = 0;
            cardSelect = 4;
            choiceMade();
         }
      });
      pos5.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back5.setVisible(false);
            pos5.setEnabled(false);
            genX = 5;
            genY = 0;
            cardSelect = 5;
            choiceMade();
         }
      });
      pos6.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back6.setVisible(false);
            pos6.setEnabled(false);
            genX = 6;
            genY = 0;
            cardSelect = 6;
            choiceMade();
         }
      });
      pos7.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back7.setVisible(false);
            pos7.setEnabled(false);
            genX = 7;
            genY = 0;
            cardSelect = 7;
            choiceMade();
         }
      });
      pos8.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back8.setVisible(false);
            pos8.setEnabled(false);
            genX = 8;
            genY = 0;
            cardSelect = 8;
            choiceMade();
         }
      });
      pos9.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back9.setVisible(false);
            pos9.setEnabled(false);
            genX = 9;
            genY = 0;
            cardSelect = 9;
            choiceMade();
         }
      });
      pos10.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back10.setVisible(false);
            pos10.setEnabled(false);
            genX = 10;
            genY = 0;
            cardSelect = 10;
            choiceMade();
         }
      });
      pos11.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back11.setVisible(false);
            pos11.setEnabled(false);
            genX = 11;
            genY = 0;
            cardSelect = 11;
            choiceMade();
         }
      });
      pos12.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back12.setVisible(false);
            pos12.setEnabled(false);
            genX = 12;
            genY = 0;
            cardSelect = 12;
            choiceMade();
         }
      });
      
      pos13.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back13.setVisible(false);
            pos13.setEnabled(false);
            genX = 0;
            genY = 1;
            cardSelect = 13;
            choiceMade();
         }
      });
      pos14.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back14.setVisible(false);
            pos14.setEnabled(false);
            genX = 1;
            genY = 1;
            cardSelect = 14;
            choiceMade();
         }
      });
      pos15.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back15.setVisible(false);
            pos15.setEnabled(false);
            genX = 2;
            genY = 1;
            cardSelect = 15;
            choiceMade();
         }
      });
      pos16.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back16.setVisible(false);
            pos16.setEnabled(false);
            genX = 3;
            genY = 1;
            cardSelect = 16;
            choiceMade();
         }
      });
      pos17.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back17.setVisible(false);
            pos17.setEnabled(false);
            genX = 4;
            genY = 1;
            cardSelect = 17;
            choiceMade();
         }
      });
      pos18.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back18.setVisible(false);
            pos18.setEnabled(false);
            genX = 5;
            genY = 1;
            cardSelect = 18;
            choiceMade();
         }
      });
      pos19.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back19.setVisible(false);
            pos19.setEnabled(false);
            genX = 6;
            genY = 1;
            cardSelect = 19;
            choiceMade();
         }
      });
      pos20.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back20.setVisible(false);
            pos20.setEnabled(false);
            genX = 7;
            genY = 1;
            cardSelect = 20;
            choiceMade();
         }
      });
      pos21.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back21.setVisible(false);
            pos21.setEnabled(false);
            genX = 8;
            genY = 1;
            cardSelect = 21;
            choiceMade();
         }
      });
      pos22.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back22.setVisible(false);
            pos22.setEnabled(false);
            genX = 9;
            genY = 1;
            cardSelect = 22;
            choiceMade();
         }
      });
      pos23.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back23.setVisible(false);
            pos23.setEnabled(false);
            genX = 10;
            genY = 1;
            cardSelect = 23;
            choiceMade();
         }
      });
      pos24.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back24.setVisible(false);
            pos24.setEnabled(false);
            genX = 11;
            genY = 1;
            cardSelect = 24;
            choiceMade();
         }
      });
      pos25.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back25.setVisible(false);
            pos25.setEnabled(false);
            genX = 12;
            genY = 1;
            cardSelect = 25;
            choiceMade();
         }
      });
      
      pos26.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back26.setVisible(false);
            pos26.setEnabled(false);
            genX = 0;
            genY = 2;
            cardSelect = 26;
            choiceMade();
         }
      });
      pos27.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back27.setVisible(false);
            pos27.setEnabled(false);
            genX = 1;
            genY = 2;
            cardSelect = 27;
            choiceMade();
         }
      });
      pos28.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back28.setVisible(false);
            pos28.setEnabled(false);
            genX = 2;
            genY = 2;
            cardSelect = 28;
            choiceMade();
         }
      });
      pos29.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back29.setVisible(false);
            pos29.setEnabled(false);
            genX = 3;
            genY = 2;
            cardSelect = 29;
            choiceMade();
         }
      });
      pos30.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back30.setVisible(false);
            pos30.setEnabled(false);
            genX = 4;
            genY = 2;
            cardSelect = 30;
            choiceMade();
         }
      });
      pos31.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back31.setVisible(false);
            pos31.setEnabled(false);
            genX = 5;
            genY = 2;
            cardSelect = 31;
            choiceMade();
         }
      });
      pos32.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back32.setVisible(false);
            pos32.setEnabled(false);
            genX = 6;
            genY = 2;
            cardSelect = 32;
            choiceMade();
         }
      });
      pos33.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back33.setVisible(false);
            pos33.setEnabled(false);
            genX = 7;
            genY = 2;
            cardSelect = 33;
            choiceMade();
         }
      });
      pos34.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back34.setVisible(false);
            pos34.setEnabled(false);
            genX = 8;
            genY = 2;
            cardSelect = 34;
            choiceMade();
         }
      });
      pos35.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back35.setVisible(false);
            pos35.setEnabled(false);
            genX = 9;
            genY = 2;
            cardSelect = 35;
            choiceMade();
         }
      });
      pos36.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back36.setVisible(false);
            pos36.setEnabled(false);
            genX = 10;
            genY = 2;
            cardSelect = 36;
            choiceMade();
         }
      });
      pos37.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back37.setVisible(false);
            pos37.setEnabled(false);
            genX = 11;
            genY = 2;
            cardSelect = 37;
            choiceMade();
         }
      });
      pos38.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back38.setVisible(false);
            pos38.setEnabled(false);
            genX = 12;
            genY = 2;
            cardSelect = 38;
            choiceMade();
         }
      });
      
      pos39.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back39.setVisible(false);
            pos39.setEnabled(false);
            genX = 0;
            genY = 3;
            cardSelect = 39;
            choiceMade();
         }
      });
      pos40.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back40.setVisible(false);
            pos40.setEnabled(false);
            genX = 1;
            genY = 3;
            cardSelect = 40;
            choiceMade();
         }
      });
      pos41.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back41.setVisible(false);
            pos41.setEnabled(false);
            genX = 2;
            genY = 3;
            cardSelect = 41;
            choiceMade();
         }
      });
      pos42.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back42.setVisible(false);
            pos42.setEnabled(false);
            genX = 3;
            genY = 3;
            cardSelect = 42;
            choiceMade();
         }
      });
      pos43.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back43.setVisible(false);
            pos43.setEnabled(false);
            genX = 4;
            genY = 3;
            cardSelect = 43;
            choiceMade();
         }
      });
      pos44.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back44.setVisible(false);
            pos44.setEnabled(false);
            genX = 5;
            genY = 3;
            cardSelect = 44;
            choiceMade();
         }
      });
      pos45.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back45.setVisible(false);
            pos45.setEnabled(false);
            genX = 6;
            genY = 3;
            cardSelect = 45;
            choiceMade();
         }
      });
      pos46.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back46.setVisible(false);
            pos46.setEnabled(false);
            genX = 7;
            genY = 3;
            cardSelect = 46;
            choiceMade();
         }
      });
      pos47.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back47.setVisible(false);
            pos47.setEnabled(false);
            genX = 8;
            genY = 3;
            cardSelect = 47;
            choiceMade();
         }
      });
      pos48.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back48.setVisible(false);
            pos48.setEnabled(false);
            genX = 9;
            genY = 3;
            cardSelect = 48;
            choiceMade();
         }
      });
      pos49.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back49.setVisible(false);
            pos49.setEnabled(false);
            genX = 10;
            genY = 3;
            cardSelect = 49;
            choiceMade();
         }
      });
      pos50.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back50.setVisible(false);
            pos50.setEnabled(false);
            genX = 11;
            genY = 3;
            cardSelect = 50;
            choiceMade();
         }
      });
      pos51.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            back51.setVisible(false);
            pos51.setEnabled(false);
            genX = 12;
            genY = 3;
            cardSelect = 51;
            choiceMade();
         }
      });
   }
   
   public void choiceMade()
   {
      //Play flip sound
      MemCards.playSound("cardflip1.wav", soundYN);
      
      //If the user hasn't made a choice yet
      if(choice == 0)
      {
         selectX1 = genX;
         selectY1 = genY;
         cardChoice1 = cardSelect;
         choice++;
      }
      //If the user has already made their first choice
      else if(choice == 1)
      {
         selectX2 = genX;
         selectY2 = genY;
         cardChoice2 = cardSelect;
         choice++;
         
         //Increment score
         score++;
      }
      //If the user has made two choices
      if(choice == 2)
      {
         //Disables buttons
         disableButtons();
         
         boolean isMatch;
         
         //Prevents a card from matching with itself
         if(selectX1 == selectX2 && selectY1 == selectY2)
         {
            isMatch = false;
         }
         else
         {
            //Checks if pair matches
            isMatch = MemCards.isMatch(selectX1, selectY1, selectX2, selectY2);
         }
         
         //Gives delay before flipping the cards back over after second selection
         Timer timer = new Timer(0, new ActionListener()
         {
            @Override
            public void actionPerformed(ActionEvent e)
            {
               if(isMatch == true)
               {
                  //Remove matched pairs
                  removeMatch(cardChoice1, cardChoice2);
                  match++;
                  if(match > 25)
                  {
                     win();
                  }
               }
               
               //Returns backs to visible
               resetBacks();
               
               //Reenables buttons
               enableButtons();
            }
         });
         
         //Starts timer
         timer.setRepeats(false);
         timer.setInitialDelay(1500);
         timer.start();
         
         //Reset card selection variables
         genX = 0;
         genY = 0;
         selectX1 = 0;
         selectX2 = 0;
         selectY1 = 0;
         selectY2 = 0;
         cardSelect = 0;
         
         choice = 0;
      }
      
      currentScore.setText("Turns:   " + String.valueOf(score));
   }
   
   //Removes cards that have been matched
   public void removeMatch(int c1, int c2)
   {
      if(c1 == 0 || c2 == 0)
      {
         card0.setVisible(false);
         remove(back0);
         pos0.setVisible(false);
      }
      if(c1 == 1 || c2 == 1)
      {
         card1.setVisible(false);
         remove(back1);
         pos1.setVisible(false);
      }
      if(c1 == 2 || c2 == 2)
      {
         card2.setVisible(false);
         remove(back2);
         pos2.setVisible(false);
      }
      if(c1 == 3 || c2 == 3)
      {
         card3.setVisible(false);
         remove(back3);
         pos3.setVisible(false);
      }
      if(c1 == 4 || c2 == 4)
      {
         card4.setVisible(false);
         remove(back4);
         pos4.setVisible(false);
      }
      if(c1 == 5 || c2 == 5)
      {
         card5.setVisible(false);
         remove(back5);
         pos5.setVisible(false);
      }
      if(c1 == 6 || c2 == 6)
      {
         card6.setVisible(false);
         remove(back6);
         pos6.setVisible(false);
      }
      if(c1 == 7 || c2 == 7)
      {
         card7.setVisible(false);
         remove(back7);
         pos7.setVisible(false);
      }
      if(c1 == 8 || c2 == 8)
      {
         card8.setVisible(false);
         remove(back8);
         pos8.setVisible(false);
      }
      if(c1 == 9 || c2 == 9)
      {
         card9.setVisible(false);
         remove(back9);
         pos9.setVisible(false);
      }
      if(c1 == 10 || c2 == 10)
      {
         card10.setVisible(false);
         remove(back10);
         pos10.setVisible(false);
      }
      if(c1 == 11 || c2 == 11)
      {
         card11.setVisible(false);
         remove(back11);
         pos11.setVisible(false);
      }
      if(c1 == 12 || c2 == 12)
      {
         card12.setVisible(false);
         remove(back12);
         pos12.setVisible(false);
      }
      
      if(c1 == 13 || c2 == 13)
      {
         card13.setVisible(false);
         remove(back13);
         pos13.setVisible(false);
      }
      if(c1 == 14 || c2 == 14)
      {
         card14.setVisible(false);
         remove(back14);
         pos14.setVisible(false);
      }
      if(c1 == 15 || c2 == 15)
      {
         card15.setVisible(false);
         remove(back15);
         pos15.setVisible(false);
      }
      if(c1 == 16 || c2 == 16)
      {
         card16.setVisible(false);
         remove(back16);
         pos16.setVisible(false);
      }
      if(c1 == 17 || c2 == 17)
      {
         card17.setVisible(false);
         remove(back17);
         pos17.setVisible(false);
      }
      if(c1 == 18 || c2 == 18)
      {
         card18.setVisible(false);
         remove(back18);
         pos18.setVisible(false);
      }
      if(c1 == 19 || c2 == 19)
      {
         card19.setVisible(false);
         remove(back19);
         pos19.setVisible(false);
      }
      if(c1 == 20 || c2 == 20)
      {
         card20.setVisible(false);
         remove(back20);
         pos20.setVisible(false);
      }
      if(c1 == 21 || c2 == 21)
      {
         card21.setVisible(false);
         remove(back21);
         pos21.setVisible(false);
      }
      if(c1 == 22 || c2 == 22)
      {
         card22.setVisible(false);
         remove(back22);
         pos22.setVisible(false);
      }
      if(c1 == 23 || c2 == 23)
      {
         card23.setVisible(false);
         remove(back23);
         pos23.setVisible(false);
      }
      if(c1 == 24 || c2 == 24)
      {
         card24.setVisible(false);
         remove(back24);
         pos24.setVisible(false);
      }
      if(c1 == 25 || c2 == 25)
      {
         card25.setVisible(false);
         remove(back25);
         pos25.setVisible(false);
      }
      
      if(c1 == 26 || c2 == 26)
      {
         card26.setVisible(false);
         remove(back26);
         pos26.setVisible(false);
      }
      if(c1 == 27 || c2 == 27)
      {
         card27.setVisible(false);
         remove(back27);
         pos27.setVisible(false);
      }
      if(c1 == 28 || c2 == 28)
      {
         card28.setVisible(false);
         remove(back28);
         pos28.setVisible(false);
      }
      if(c1 == 29 || c2 == 29)
      {
         card29.setVisible(false);
         remove(back29);
         pos29.setVisible(false);
      }
      if(c1 == 30 || c2 == 30)
      {
         card30.setVisible(false);
         remove(back30);
         pos30.setVisible(false);
      }
      if(c1 == 31 || c2 == 31)
      {
         card31.setVisible(false);
         remove(back31);
         pos31.setVisible(false);
      }
      if(c1 == 32 || c2 == 32)
      {
         card32.setVisible(false);
         remove(back32);
         pos32.setVisible(false);
      }
      if(c1 == 33 || c2 == 33)
      {
         card33.setVisible(false);
         remove(back33);
         pos33.setVisible(false);
      }
      if(c1 == 34 || c2 == 34)
      {
         card34.setVisible(false);
         remove(back34);
         pos34.setVisible(false);
      }
      if(c1 == 35 || c2 == 35)
      {
         card35.setVisible(false);
         remove(back35);
         pos35.setVisible(false);
      }
      if(c1 == 36 || c2 == 36)
      {
         card36.setVisible(false);
         remove(back36);
         pos36.setVisible(false);
      }
      if(c1 == 37 || c2 == 37)
      {
         card37.setVisible(false);
         remove(back37);
         pos37.setVisible(false);
      }
      if(c1 == 38 || c2 == 38)
      {
         card38.setVisible(false);
         remove(back38);
         pos38.setVisible(false);
      }
      
      if(c1 == 39 || c2 == 39)
      {
         card39.setVisible(false);
         remove(back39);
         pos39.setVisible(false);
      }
      if(c1 == 40 || c2 == 40)
      {
         card40.setVisible(false);
         remove(back40);
         pos40.setVisible(false);
      }
      if(c1 == 41 || c2 == 41)
      {
         card41.setVisible(false);
         remove(back41);
         pos41.setVisible(false);
      }
      if(c1 == 42 || c2 == 42)
      {
         card42.setVisible(false);
         remove(back42);
         pos42.setVisible(false);
      }
      if(c1 == 43 || c2 == 43)
      {
         card43.setVisible(false);
         remove(back43);
         pos43.setVisible(false);
      }
      if(c1 == 44 || c2 == 44)
      {
         card44.setVisible(false);
         remove(back44);
         pos44.setVisible(false);
      }
      if(c1 == 45 || c2 == 45)
      {
         card45.setVisible(false);
         remove(back45);
         pos45.setVisible(false);
      }
      if(c1 == 46 || c2 == 46)
      {
         card46.setVisible(false);
         remove(back46);
         pos46.setVisible(false);
      }
      if(c1 == 47 || c2 == 47)
      {
         card47.setVisible(false);
         remove(back47);
         pos47.setVisible(false);
      }
      if(c1 == 48 || c2 == 48)
      {
         card48.setVisible(false);
         remove(back48);
         pos48.setVisible(false);
      }
      if(c1 == 49 || c2 == 49)
      {
         card49.setVisible(false);
         remove(back49);
         pos49.setVisible(false);
      }
      if(c1 == 50 || c2 == 50)
      {
         card50.setVisible(false);
         remove(back50);
         pos50.setVisible(false);
      }
      if(c1 == 51 || c2 == 51)
      {
         card51.setVisible(false);
         remove(back51);
         pos51.setVisible(false);
      }
   }
   
   //Returns all unmatched backs to visible
   public void resetBacks()
   {
      //Play flip sound
      MemCards.playSound("cardflip2.wav", soundYN);
      
      back0.setVisible(true);
      back1.setVisible(true);
      back2.setVisible(true);
      back3.setVisible(true);
      back4.setVisible(true);
      back5.setVisible(true);
      back6.setVisible(true);
      back7.setVisible(true);
      back8.setVisible(true);
      back9.setVisible(true);
      back10.setVisible(true);
      back11.setVisible(true);
      back12.setVisible(true);
      
      back13.setVisible(true);
      back14.setVisible(true);
      back15.setVisible(true);
      back16.setVisible(true);
      back17.setVisible(true);
      back18.setVisible(true);
      back19.setVisible(true);
      back20.setVisible(true);
      back21.setVisible(true);
      back22.setVisible(true);
      back23.setVisible(true);
      back24.setVisible(true);
      back25.setVisible(true);
      
      back26.setVisible(true);
      back27.setVisible(true);
      back28.setVisible(true);
      back29.setVisible(true);
      back30.setVisible(true);
      back31.setVisible(true);
      back32.setVisible(true);
      back33.setVisible(true);
      back34.setVisible(true);
      back35.setVisible(true);
      back36.setVisible(true);
      back37.setVisible(true);
      back38.setVisible(true);
      
      back39.setVisible(true);
      back40.setVisible(true);
      back41.setVisible(true);
      back42.setVisible(true);
      back43.setVisible(true);
      back44.setVisible(true);
      back45.setVisible(true);
      back46.setVisible(true);
      back47.setVisible(true);
      back48.setVisible(true);
      back49.setVisible(true);
      back50.setVisible(true);
      back51.setVisible(true);
   }
   
   //Disable buttons to prevent making more than 2 selections at a time
   public void disableButtons()
   {
      pos0.setEnabled(false);
      pos1.setEnabled(false);
      pos2.setEnabled(false);
      pos3.setEnabled(false);
      pos4.setEnabled(false);
      pos5.setEnabled(false);
      pos6.setEnabled(false);
      pos7.setEnabled(false);
      pos8.setEnabled(false);
      pos9.setEnabled(false);
      pos10.setEnabled(false);
      pos11.setEnabled(false);
      pos12.setEnabled(false);
      
      pos13.setEnabled(false);
      pos14.setEnabled(false);
      pos15.setEnabled(false);
      pos16.setEnabled(false);
      pos17.setEnabled(false);
      pos18.setEnabled(false);
      pos19.setEnabled(false);
      pos20.setEnabled(false);
      pos21.setEnabled(false);
      pos22.setEnabled(false);
      pos23.setEnabled(false);
      pos24.setEnabled(false);
      pos25.setEnabled(false);
      
      pos26.setEnabled(false);
      pos27.setEnabled(false);
      pos28.setEnabled(false);
      pos29.setEnabled(false);
      pos30.setEnabled(false);
      pos31.setEnabled(false);
      pos32.setEnabled(false);
      pos33.setEnabled(false);
      pos34.setEnabled(false);
      pos35.setEnabled(false);
      pos36.setEnabled(false);
      pos37.setEnabled(false);
      pos38.setEnabled(false);
      
      pos39.setEnabled(false);
      pos40.setEnabled(false);
      pos41.setEnabled(false);
      pos42.setEnabled(false);
      pos43.setEnabled(false);
      pos44.setEnabled(false);
      pos45.setEnabled(false);
      pos46.setEnabled(false);
      pos47.setEnabled(false);
      pos48.setEnabled(false);
      pos49.setEnabled(false);
      pos50.setEnabled(false);
      pos51.setEnabled(false);
   }
   
   //Reenable buttons
   public void enableButtons()
   {
      pos0.setEnabled(true);
      pos1.setEnabled(true);
      pos2.setEnabled(true);
      pos3.setEnabled(true);
      pos4.setEnabled(true);
      pos5.setEnabled(true);
      pos6.setEnabled(true);
      pos7.setEnabled(true);
      pos8.setEnabled(true);
      pos9.setEnabled(true);
      pos10.setEnabled(true);
      pos11.setEnabled(true);
      pos12.setEnabled(true);
      
      pos13.setEnabled(true);
      pos14.setEnabled(true);
      pos15.setEnabled(true);
      pos16.setEnabled(true);
      pos17.setEnabled(true);
      pos18.setEnabled(true);
      pos19.setEnabled(true);
      pos20.setEnabled(true);
      pos21.setEnabled(true);
      pos22.setEnabled(true);
      pos23.setEnabled(true);
      pos24.setEnabled(true);
      pos25.setEnabled(true);
      
      pos26.setEnabled(true);
      pos27.setEnabled(true);
      pos28.setEnabled(true);
      pos29.setEnabled(true);
      pos30.setEnabled(true);
      pos31.setEnabled(true);
      pos32.setEnabled(true);
      pos33.setEnabled(true);
      pos34.setEnabled(true);
      pos35.setEnabled(true);
      pos36.setEnabled(true);
      pos37.setEnabled(true);
      pos38.setEnabled(true);
      
      pos39.setEnabled(true);
      pos40.setEnabled(true);
      pos41.setEnabled(true);
      pos42.setEnabled(true);
      pos43.setEnabled(true);
      pos44.setEnabled(true);
      pos45.setEnabled(true);
      pos46.setEnabled(true);
      pos47.setEnabled(true);
      pos48.setEnabled(true);
      pos49.setEnabled(true);
      pos50.setEnabled(true);
      pos51.setEnabled(true);
   }
   
   //Once the user has won
   public void win()
   {
      //Play win sound
      MemCards.playSound("win.wav", soundYN);
      
      //Popup congratulating the player
      JOptionPane.showMessageDialog(window, "You Won After " + score + " Total Turns");
      
      //Get user's name for scoreboard
      toggleSound.setVisible(false);
      restart.setVisible(false);
      output.setBounds(216, 230, 150, 20);
      output.setText("Enter your name:");
      playerName.setVisible(true);
      addScore.setVisible(true);
      creator.setBounds(15, 615, 150, 20);
      
      //If user hits enter in text box it will still work
      playerName.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            showScores();
         }
      });
      
      //Once button is pressed, adds user's score to scoreboard
      addScore.addActionListener(new ActionListener()
      {
         public void actionPerformed(ActionEvent e)
         {
            showScores();
         }
      });
   }
   
   public void showScores()
   {
      MemCards.addScore(playerName.getText(), score);
      toScroll.setVisible(true);
      scoreboard.setText(MemCards.scoresToString());
      restart.setBounds(256, 615, 150, 20);
      restart.setText("Play Again?");
      restart.setVisible(true);
      
      //Hides the area where you enter your name
      output.setVisible(false);
      playerName.setVisible(false);
      addScore.setVisible(false);
      currentScore.setVisible(false);
   }
   
   private void restart()
   {
      window.dispose();
      MemGUI MemGUI = new MemGUI();
      MemGUI.setVisible(true);
   }
   
   public static void main(String args[])
   {
      new MemGUI();
   }
}