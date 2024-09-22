Classes: There are three main classes:

    1. TicTacToe: Manages the game board and game logic.<br>
    2.Player: Represents a player, holding their name and symbol (either 'X' or 'O').<br>
    3. Game: Contains the main method, which runs the game.<br>
*Game Board:
The board is a 3x3 grid (2D array) initialized with spaces (' ').
The initBoard method fills the grid with spaces.<br>
*Display:
The displayBoard method prints the current state of the board, showing rows and columns.<br>
*Player Moves:
The Player class has a method called move that prompts the player to enter a row and column for their symbol. It checks if the move is valid (within bounds and on an empty spot).<br>
*Win Conditions:
The game checks for wins in three ways:
    ->colWin: Checks if any column has all the same symbols.
   -> rowWin: Checks if any row has all the same symbols.
   -> diagonalWin: Checks both diagonals for the same symbols.<br>
*Draw Condition:

The draw method checks if the board is full without any winner.<br>
Game Loop:
In the main method, a loop alternates turns between two players (p1 and p2).
After each move, it checks for a winner or if the game is a draw.
The game continues until there’s a winner or the board is full.<br>
User Interaction:
The game prompts players to input their moves and informs them of the current state of the game.


                    -----------------------
                    |   X   |       |       |
                    ------------------------
                    |       |   O   |       |
                    ------------------------
                    |       |       |   X   |
                    -------------------------


                      -----------------------
                    |   X   |       |    O  |
                    ------------------------
                    |       |   O   |   X   |      =====THE CANDIDATE HOLDING "O" WON THE GAME=====
                    ------------------------
                    |  O    |       |   X   |
                    -------------------------


                      -----------------------
                    |   X   |    X  |    x  |
                    ------------------------
                    |       |   O   |  O    |       ========THE CANDIDATE HOLDING "X" WON THE GAME======
                    ------------------------
                    |   O   |       |   X   |
                    -------------------------

                      -----------------------
                    |   X   |   O   |   X   |
                    ------------------------
                    |   X   |   x   |  O    |      ==================IT'S A DRAW=====================
                    ------------------------
                    |    O  |   O   |   X   |
                    -------------------------
