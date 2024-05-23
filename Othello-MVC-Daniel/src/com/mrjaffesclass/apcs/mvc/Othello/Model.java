package com.mrjaffesclass.apcs.mvc.Othello;

import com.mrjaffesclass.apcs.messenger.*;


/**
 * The model represents the data that the app uses.
 * @author Roger Jaffe
 * @version 1.0
 */
public class Model implements MessageHandler {

  // Messaging system for the MVC
  private final Messenger mvcMessaging;

  // Model's data variables
   private int[][] board;
   private boolean whoseMove;
   

  /**
   * Model constructor: Create the data representation of the program
   * @param messages Messaging class instantiated by the Controller for 
   *   local messages between Model, View, and controller
   */
  public Model(Messenger messages) {
    mvcMessaging = messages;
    
    
    
  }
  
  /**
   * Initialize the model here and subscribe to any required messages
   */
  public void init() {
      this.board = new int[8][8];
      
    
  }
  
  private void newGame(){
      for (int row = 0; row < this board.length; row++) {
        for (int col = 0; col < this.board[0].length; col++) {
            
        }
  }
  }
  
  @Override
  public void messageHandler(String messageName, Object messagePayload) {
    if (messagePayload != null) {
      System.out.println("MSG: received by model: "+messageName+" | "+messagePayload.toString());
    } else {
      System.out.println("MSG: received by model: "+messageName+" | No data sent");
    }
    
  }

 
 

}
