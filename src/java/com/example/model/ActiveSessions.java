/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.model;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;
/**
 *
 * @author user
 */
public class ActiveSessions implements HttpSessionListener {

  private static int activeSessions = 0;

  public void sessionCreated(HttpSessionEvent se) {
    activeSessions++;
  }

  public void sessionDestroyed(HttpSessionEvent se) {
    if(activeSessions > 0)
      activeSessions--;
  }

  public static int getActiveSessions() {
    return activeSessions;
  }

}


