package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	public Piece(Board board) { // as pe�as iniciam nulas- n�o est� no tabuleiro
		this.board = board;
		position = null;
	}
	protected Board getBoard() {
		return board;
	}
}
