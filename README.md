# Binary-Search-5

## Problem1: Find Function Arguments 

Given a number z ∈ N and a function f(x, y) ∈ N, where x ∈ N and y ∈ N.

Function f(x, y) is black box and unknown but we can pass any x and y to function and get f(x, y) value. f(x, y) is strictly increasing:
f(x, y) < f(x + 1, y)
f(x, y) < f(x, y + 1)

Find all pairs of x and y, where f(x, y) = z.

Example 1:

Input:

f(x, y) = x + y

z = 5


Output:

[[1, 4], [2, 3], [3, 2], [4, 1]]
Example 2:

Input:

f(x, y) = x^2 + y

z = 50


Output:

[[1, 49], [2, 46], [3, 41], [4, 34], [5, 25], [6, 14], [7, 1]]

## Problem2: Find object in a grid

Given a char grid (o represents an empty cell and x represents a target object) and an API getResponse which would give you a response w.r.t. to your previous position. Write a program to find the object. You can move to any position.

enum Response {
	HOTTER,  // Moving closer to target
	COLDER,  // Moving farther from target
	SAME,    // Same distance from the target as your previous guess
	EXACT;   // Reached destination
}

// Throws an error if 'row' or 'col' is out of bounds
public Response getResponse(int row, int col) {
	// black box
}
Example 1:

Input:
[['o', 'o', 'o'],
 ['o', 'o', 'o'],
 ['x', 'o', 'o']]

Output: [2, 0]
Example 2:

Input:
[['o', 'o', 'o', 'o', 'o'],
 ['o', 'o', 'o', 'o', 'o'],
 ['o', 'o', 'o', 'o', 'o'],
 ['o', 'o', 'o', 'o', 'o'],
 ['o', 'o', 'o', 'x', 'o'],
 ['o', 'o', 'o', 'o', 'o']]

Output: [4, 3]
Assumptions:

There is always one and only one object.
If it's not the target object the 1st call would always give HOTTER as result, ortherwise EXACT.
