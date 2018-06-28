package org.nangang.controller;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TextListener
 *
 */
@WebListener
public class TextListener implements ServletRequestListener {

//	Log
	
    /**
     * Default constructor. 
     */
    public TextListener() {
        // TODO Auto-generated constructor stub
    	System.out.println("get 1");
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("get 2");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("get 3");
    }
	
}
