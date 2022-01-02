package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	public Piece(Board board) { // as peças iniciam nulas- não está no tabuleiro
		this.board = board;
		position = null;
	}
	protected Board getBoard() {
		return board;
	}
}
