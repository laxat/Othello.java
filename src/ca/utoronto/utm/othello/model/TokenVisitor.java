package ca.utoronto.utm.othello.model;

public class TokenVisitor implements Visitor {

	private int row;
	private int col;

	public TokenVisitor(int r, int c) {
		this.row = r;
		this.col = c;
	}

	@Override
	public Character visit(Othello othello) {
		// TODO Auto-generated method stub
		return Character.valueOf(othello.board.get(this.row, this.col));
	}

	@Override
	public Object visit(OthelloBoard board) {
		if (0 <= row && row < board.dim && 0 <= col && col < board.dim) {
			return board.board[row][col];
		} else
			return OthelloBoard.EMPTY;
	}

}
