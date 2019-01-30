/**
 * 
 */
package com.home.design.pattern.observer;

/**
 * @author Dinesh
 *
 */
public interface Subject {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver();

}
