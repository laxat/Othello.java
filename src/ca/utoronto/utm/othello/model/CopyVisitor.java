package ca.utoronto.utm.othello.model;

public class CopyVisitor implements Visitor {

	public Othello visit(Othello othello) {
		Othello o = new Othello();
		o.board = othello.board.copy();
		return o;
	}

	@Override
	public OthelloBoard visit(OthelloBoard board) {
		OthelloBoard ob = new OthelloBoard(board.dim);
		for (int row = 0; row < board.dim; row++) {
			for (int col = 0; col < board.dim; col++) {
				ob.board[row][col] = board.board[row][col];
			}
		}
		return ob;
	}
}
