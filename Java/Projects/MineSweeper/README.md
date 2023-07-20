We are waiting for you to make a Minesweeper game in Java.

# Game rules :
- The game is text based.
- It should be played on two-dimensional arrays and designed within the MineSweeper class.
- The matrix size, that is, the number of rows and columns, should be determined by the user.
- A quarter of the number of elements of the array (number of elements / 4) should be randomly placed. For example, if the array is 4x3 in size, the number of elements should be calculated with the formula (Number of Rows * Number of Columns) and its size should be 12. In this case, the number of mines should be 12 / 4 = 3 pieces. (hint: you can create a second array to hold the positions of these mines.)
- The user must select a point on the matrix. For point selection, row and column values must be entered.
- It should be checked whether the selected point is within the boundaries of the array and if the condition is not met, the point should be requested again.
- If there is a mine at the point where the user enters, he must lose the game.
- If there are no mines, all positions that touch the relevant point should be looked at (right, left, up, down, upper left diagonal, upper right diagonal, lower right diagonal, lower left diagonal) and the sum of the number of mines around should be written on the relevant point. If there is no mine touching the point, the value "0" should be assigned.
- If the user can select all the points without pressing any mines, he should win the game.
## Losing Scenario
```
Location of Mines
* - -
- - *
- - - ===========================
Mayın Tarlası Oyuna Hoşgeldiniz !
- - - 
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 1 ===========================
- 2 -
- - - 
- - - 
Satır Giriniz : 2
Sütun Giriniz : 0 ===========================
- 2 -
- - - 
0 - -
Satır Giriniz : 0
Sütun Giriniz : 2 ===========================
- 2 1
- - - 
0 - -
Satır Giriniz : 1
Sütun Giriniz : 0 ===========================
- 2 1
1 - -
0 - -
Satır Giriniz : 2
Sütun Giriniz : 1 ===========================
- 2 1
1 - -
0 1 -
Satır Giriniz : 2
Sütun Giriniz : 2 ===========================
- 2 1
1 - -
0 1 1
Satır Giriniz : 1
Sütun Giriniz : 2
Game Over!! ===========================
```

### Winning Scenario
```
Mayınların Konumu
- - - 
- * -
- * - ===========================
Mayın Tarlası Oyuna Hoşgeldiniz !
- - - 
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 0 ===========================
1 - -
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 1 ===========================
1 1 -
- - - 
- - - 
Satır Giriniz : 0
Sütun Giriniz : 2 ===========================
1 1 1
- - - 
- - - 
Satır Giriniz : 1
Sütun Giriniz : 0 ===========================
1 1 1
2 - -
- - - 
Satır Giriniz : 2
Sütun Giriniz : 0 ===========================
1 1 1
2 - -
2 - -
Satır Giriniz : 1
Sütun Giriniz : 2 ===========================
1 1 1
2 - 2
2 - -
Satır Giriniz : 2
Sütun Giriniz : 2
Oyunu Kazandınız !
1 1 1
2 - 2
2 - 2 ===========================
```