package memoryGame;

/*
Code written by Nicholas Stephenson
Final project - CS 1400 @ Weber State University
November-December 2020
*/

import java.util.*;
import java.io.*;

import javax.sound.sampled.*;

class MemCards
{
   private int [][] layout = new int [4][13];
   private int [][] values = new int [4][13];
   private ArrayList <Integer> possible = new ArrayList<>();
   private ArrayList <String> playerNames = new ArrayList<>();
   private ArrayList <Integer> playerScores = new ArrayList<>();
   private ArrayList <Boolean> newestScore = new ArrayList<>();
   private static Random rand = new Random();
   
   public MemCards()
   {
      //Make a list of possible values
      for(int i = 0; i < 52; i++)
      {
         possible.add(i);
      }
      
      //Shuffle possible values in the list
      for(int i = 0; i < 2000; i++)
      {
         int rnd1 = rand.nextInt(possible.size());
         int rnd2 = rand.nextInt(possible.size());
         swap(rnd1, rnd2);
      }
      
      //Assign each possible value a random position in the layout list
      setup();
      
      //Set the values for matching cards
      setValues();
   }
   
   public void swap(int pos1, int pos2)
   {
      int temp = possible.get(pos1);
      possible.set(pos1, possible.get(pos2));
      possible.set(pos2, temp);
   }
   
   //Assign each possible value a random position in the layout list
   public void setup()
   {
      for(int i = 0; i < layout[0].length; i++)
      {
         for(int j = 0; j < layout.length; j++)
         {
            int posInList = rand.nextInt(possible.size());
            layout[j][i] = possible.get(posInList);
            possible.remove(posInList);
         }
      }
   }
   
   //Set the values for matching cards
   public void setValues()
   {
      for(int i = 0; i < values[0].length; i++)
      {
         for(int j = 0; j < values.length; j++)
         {
            if(layout[j][i] == 0 || layout[j][i] == 13)
            {
               values[j][i] = 0;
            }
            else if(layout[j][i] == 1 || layout[j][i] == 14)
            {
               values[j][i] = 1;
            }
            else if(layout[j][i] == 2 || layout[j][i] == 15)
            {
               values[j][i] = 2;
            }
            else if(layout[j][i] == 3 || layout[j][i] == 16)
            {
               values[j][i] = 3;
            }
            else if(layout[j][i] == 4 || layout[j][i] == 17)
            {
               values[j][i] = 4;
            }
            else if(layout[j][i] == 5 || layout[j][i] == 18)
            {
               values[j][i] = 5;
            }
            else if(layout[j][i] == 6 || layout[j][i] == 19)
            {
               values[j][i] = 6;
            }
            else if(layout[j][i] == 7 || layout[j][i] == 20)
            {
               values[j][i] = 7;
            }
            else if(layout[j][i] == 8 || layout[j][i] == 21)
            {
               values[j][i] = 8;
            }
            else if(layout[j][i] == 9 || layout[j][i] == 22)
            {
               values[j][i] = 9;
            }
            else if(layout[j][i] == 10 || layout[j][i] == 23)
            {
               values[j][i] = 10;
            }
            else if(layout[j][i] == 11 || layout[j][i] == 24)
            {
               values[j][i] = 11;
            }
            else if(layout[j][i] == 12 || layout[j][i] == 25)
            {
               values[j][i] = 12;
            }
            else if(layout[j][i] == 26 || layout[j][i] == 39)
            {
               values[j][i] = 13;
            }
            else if(layout[j][i] == 27 || layout[j][i] == 40)
            {
               values[j][i] = 14;
            }
            else if(layout[j][i] == 28 || layout[j][i] == 41)
            {
               values[j][i] = 15;
            }
            else if(layout[j][i] == 29 || layout[j][i] == 42)
            {
               values[j][i] = 16;
            }
            else if(layout[j][i] == 30 || layout[j][i] == 43)
            {
               values[j][i] = 17;
            }
            else if(layout[j][i] == 31 || layout[j][i] == 44)
            {
               values[j][i] = 18;
            }
            else if(layout[j][i] == 32 || layout[j][i] == 45)
            {
               values[j][i] = 19;
            }
            else if(layout[j][i] == 33 || layout[j][i] == 46)
            {
               values[j][i] = 20;
            }
            else if(layout[j][i] == 34 || layout[j][i] == 47)
            {
               values[j][i] = 21;
            }
            else if(layout[j][i] == 35 || layout[j][i] == 48)
            {
               values[j][i] = 22;
            }
            else if(layout[j][i] == 36 || layout[j][i] == 49)
            {
               values[j][i] = 23;
            }
            else if(layout[j][i] == 37 || layout[j][i] == 50)
            {
               values[j][i] = 24;
            }
            else if(layout[j][i] == 38 || layout[j][i] == 51)
            {
               values[j][i] = 25;
            }
         }
      }
   }
   
   //Returns card positions
   public int getPosition(int val1, int val2)
   {
      return layout[val1][val2];
   }
   
   //Checks if two chosen cards match
   public boolean isMatch(int X1, int Y1, int X2, int Y2)
   {
      int val1 = values[Y1][X1];
      int val2 = values[Y2][X2];
      
      if(val1 == val2)
      {
         return true;
      }
      return false;
   }
   
   //Adds name and score to the scorelog.txt document
   public void addScore(String name, int score)
   {
      try
      {
         PrintWriter fileOut = new PrintWriter(new FileWriter("memoryGame/Assets/scorelog.txt", true));
         fileOut.println(name + ":");
         fileOut.println(score);
         fileOut.close();
      }
      catch(Exception e)
      {
         System.out.println("Add Score Error: " + e.getMessage());
      }
   }
   
   //Converts the scorelog.txt document into a string and returns to main program
   public String scoresToString()
   {
      String scoreList = "";
      try
      {
         File scoreFile = new File("memoryGame/Assets/scorelog.txt");
         if(scoreFile.exists())
         {
            Scanner fileIn = new Scanner(scoreFile);
            while(fileIn.hasNextLine())
            {
               //scoreList += "\s" + fileIn.nextLine() + "\n";
               playerNames.add(fileIn.nextLine());
               playerScores.add(fileIn.nextInt());
               fileIn.nextLine();
            }
            fileIn.close();
            
            //Record the newest score
            for(int i = 0; i < playerNames.size() - 1; i++)
            {
               newestScore.add(false);
            }
            newestScore.add(true);
            
            //Sort the scores in descending order
            sortScores();
         }
         
         //Create the file if none is found
         else
         {
            scoreFile.createNewFile();
         }
      }
      catch(Exception e)
      {
         System.out.println("Score Error: " + e.getMessage());
      }
      
      scoreList += "<html><p style=\"font-size: 15px\">&emsp;Scoreboard:<br><br>";
      for(int i = 0; i < playerNames.size(); i++)
      {
         if(newestScore.get(i))
         {
            scoreList += "<b>";
            scoreList += "&emsp;" + playerNames.get(i);
            scoreList += "&nbsp;" + playerScores.get(i);
            scoreList += "</b>";
            i++;
         }
         else
         {
            scoreList += "&emsp;" + playerNames.get(i);
            scoreList += "&nbsp;" + playerScores.get(i);
         }
         scoreList += "<br>";
      }
      scoreList += "<br></p></html>";
      
      return scoreList;
   }
   
   public void sortScores()
   {
      int tempScore1;
      int tempScore2;
      for(int i = 0; i < playerScores.size(); i++)
      {
         for(int j = 0; j < playerScores.size() - 1; j++)
         {
            tempScore1 = playerScores.get(j);
            tempScore2 = playerScores.get(j + 1);
            if(tempScore1 > tempScore2)
            {
               swapScores(j, j + 1);
            }
         }
      }
   }
   
   public void swapScores(int score1, int score2)
   {
      int tempScore = playerScores.get(score1);
      String tempName = playerNames.get(score1);
      boolean tempNew = newestScore.get(score1);
      playerScores.set(score1, playerScores.get(score2));
      playerNames.set(score1, playerNames.get(score2));
      newestScore.set(score1, newestScore.get(score2));
      playerScores.set(score2, tempScore);
      playerNames.set(score2, tempName);
      newestScore.set(score2, tempNew);
   }
   
   //Code found on https://www.youtube.com/watch?v=TErboGLHZGA, by Max O'Didily
   public void playSound(String audioFile, boolean playYN)
   {
      if(playYN)
      {
         try
         {
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(new File("memoryGame/Assets/Sounds/"+audioFile));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
         }
         catch(Exception e)
         {
            System.out.println("Audio Error: " + e.getMessage());
         }
      }
   }
}