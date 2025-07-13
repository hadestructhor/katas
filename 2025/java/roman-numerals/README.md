# Kata

The kata can be found here:
https://codingdojo.org/kata/RomanNumerals/

## Problems

For more information on how roman numbers are fomulated, check:
http://www.novaroma.org/via_romana/numbers.html

From the looks of it, romans liked to write numbers based on dictionary of letters representing numbers, and how multiple instances of that letter forms a number.
It looks like each letter can be used three times before upgrading to another letter.
It also looks like an upgraded letter that represent a higher number.
This upgraded letter can be used up to three times before needing to upgrade to a new letter.
And it looks like an upgrade can be preceeded by a previous letter to represent numbers in between.

So the first case is I, representing 1, and we can use it three times to represent 2 and 3.
After that we have 5 which is represented as V, and to make 4, we use IV.
We can represent numbers after 5 using three times the previous letter, so VI for 6, and VII for 8.
After the three marks, we need the next letter which is X for 10.

All the higher numbers can be represented using previous letters.

Here's the list of letters
- I for 1
- V for 5
- X for 10
- L for 50
- C for 100
- D for 500
- M for 1000

And it looks like numbers are only represented from 0 to 3000 max.

### Decimal to Roman

So the way I'm going to solve this problem is to represent numbers based on the amount of digits:
- 1 digit (1 to 9)
- 2 digits (10 to 99)
- 3 digits (100 to 999)
- 4 digits (1000 to 3000)

Then I would just need to check how many decimals there are in a number, and represent each decimal part.

If a number isn't in the range, an error will be thrown.

### Roman to Decimal

I think I will use the same logic, with how to represent each possible digit.
If a number isn't valid, like IIII, I will throw an error.

I can think of two ways of solving this, reading from the left of a string, or right.
In both cases, I'm thinking of reading letters until I encounter a next range.
If I encounter a next letter range, I add the current formed number, and continue reading with the new range.
If I finished reading, evaluate the number and add it if valid.

For example, if I have XIII:
Reading from right to left, letter by letter would give me 1, 2, 3, 13.
Reading from left to right, letter by letter would give me 10, 11, 12, 13.

I would need to define how to read each range, so smaller problems I can think of is:
- Reading in a valid range
- Detecting a next range
- Accumulating values in between a range change