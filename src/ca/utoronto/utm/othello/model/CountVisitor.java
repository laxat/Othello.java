package ca.utoronto.utm.othello.model;

public class CountVisitor implements Visitor {

	private char player;

	public CountVisitor(char p) {
		this.player = p;
	}

	public Integer visit(Othello othello) {
		return othello.board.getCount(this.player);

	}

	public Integer visit(OthelloBoard board) {

		int count = 0;
		for (int row = 0; row < board.dim; row++) {
			for (int col = 0; col < board.dim; col++) {
				if (board.board[row][col] == player)
					count++;
			}
		}
		return count;
	}

//	public int visit(OthelloBoard board) {
//		int count = 0;
//		for (int row = 0; row < board.dim; row++) {
//			for (int col = 0; col < board.dim; col++) {
//				if (board.board[row][col] == player)
//					count++;
//			}
//		}
//		return count;
//		
//	}	

}
