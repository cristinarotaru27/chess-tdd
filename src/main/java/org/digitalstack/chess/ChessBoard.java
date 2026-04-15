package org.digitalstack.chess;

public class ChessBoard {

    public static int BOARD_WIDTH = 7;
    public static int BOARD_HEIGHT = 7;

    private final Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[BOARD_WIDTH][BOARD_HEIGHT];
    }

    public void add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
       // throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
        if (!idLegalBoardPosition(xCoordinate, yCoordinate)){
            return;
        }
        pawn.setXCoordinate(xCoordinate);
        pawn.setYCoordinate(yCoordinate);
        pawn.setChessBoard(this);
        pieces[xCoordinate][yCoordinate] = pawn;
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
       // throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
        return xCoordinate >= 0 && xCoordinate < BOARD_WIDTH && yCoordinate >= 0 && yCoordinate < BOARD_HEIGHT;
    }
}
