package ca.utoronto.utm.othello.model;

/**
 * An interface to be implemented by all concrete Vistors
 *
 * @author TheNerds
 *
 */
public interface Visitor {

	public Object visit(Othello othello); 
	
	public Object visit(OthelloBoard board); 
	
 }

