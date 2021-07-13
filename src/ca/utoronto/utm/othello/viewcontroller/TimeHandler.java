package ca.utoronto.utm.othello.viewcontroller;

import ca.utoronto.utm.othello.model.OthelloModel;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TimeHandler implements EventHandler<ActionEvent>{
	
	OthelloModel m; 
	public TimeHandler(OthelloModel model) {
		this.m = model; 
	}
	@Override
	public void handle(ActionEvent action) {
		m.decrement();
	}

}
