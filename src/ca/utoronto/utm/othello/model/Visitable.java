package ca.utoronto.utm.othello.model;

/**
 * An interface to be implemented by all concrete Visitable
 * 
 * @author TheNerds
 *
 */
public interface Visitable {

	public Object accept(Visitor visit);

}
