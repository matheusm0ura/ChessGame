package application;

import boardgame.Board;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ChessMatch chessMatch = new ChessMatch();
        while (true){
            UI.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Inicio: ");
            ChessPosition source = UI.addChessPosition(sc);

            System.out.print("Destino: ");
            ChessPosition target = UI.addChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.peformChessMove(source, target);
        }
    }
}
