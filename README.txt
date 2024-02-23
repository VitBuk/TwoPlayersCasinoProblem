This is my simulation for two players casino problem.

Problem was formulated by my friend, and look like that:

On two sheets of paper, the casino randomly writes heads and tails in an infinite number with a probability of 0.5 for each value.
For example, an entry on one of the sheets might look like this:
1. Tail
2. Head
3. Tail
4. Tail
5. Head
6. Tail
etc.

The casino then distributes these sheets to java.Player A and java.Player B (one sheet for each player).

java.Player A sees only his own sheet and can choose any row number in java.Player B's sheet.
java.Player B sees only his own sheet and can choose any row number in java.Player A's sheet.
The players do not know each other's choices and cannot make signs or otherwise communicate, but they can agree on their java.strategies before the sheets are dealt.
If the values in the lines specified by the players match (for example, O and O or P and P), they both win 1 euro.
If they do not match (O and P or P and O), they lose 1 euro.

Is there a strategy that will allow players to win more than half the time?