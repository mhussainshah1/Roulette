## Week One Level Two Challenge - Roulette

You will write a Java program to simulate Roulette, a casino game.

Players will be able to enter in the amount of money they want to bet and the type of bet they will be placing.

The types of bets include:

<p> Red:You are betting that the next roll will come up red.
<p> Black: You are betting that the next roll will come up black.
<p> Even:This is wagering that the ball will land on an even number between 1-36.
<p> Odd: This is wagering that the ball will land on an odd number between 1-36.
<p>Low: This is a bet that the next number will be between 1 and 18.
<p>High: This is a bet that the next number will be between 19 and 36.

The program will then randomly generate a number between 1-36 and a color (red or black). You will then double the player's amount if they won, or deduct their money if they lost.

Allow the user to play as many games as they want until they want to quit.

At the end of the program, print out the net amount of money they've earned, whether that's positive or negative. In addition, also print out the number of games they have won and lost.

Sample Output:

```
WELCOME! Let's play some Roulette!

Enter the type of bet you would like to place (red|black|even|odd|high|low): red
Enter in your bet amount: 35
The ball landed on 27 black.
Sorry, you've lost this bet.

You currently have: $-35.0

Would you like to play again (true|false)? true
Enter the type of bet you would like to place (red|black|even|odd|high|low): low
Enter in your bet amount: 40
The ball landed on 17 black.
Congratulations, you've won.

You currently have: $45.0

Would you like to play again (true|false)? true
Enter the type of bet you would like to place (red|black|even|odd|high|low): even
Enter in your bet amount: 100
The ball landed on 29 black.
Sorry, you've lost this bet.

You currently have: $-55.0

Would you like to play again (true|false)? false

Thank you for playing!
This is how much money you have remaining: $-55.00
You've won 1 game(s) and lost 2 game(s).
```
