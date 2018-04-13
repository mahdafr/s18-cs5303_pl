# CS5303 Programming Project (Option 2: Predicate Logic)

## General Description
For the CS5303 course, I will be doing the Predicate Logic Programming Assignment (Option 2). The program will prompt the user for a predicate logic expression (see accepted input below). The program will prompt the user to choose from the following:
* Transform it into prenex form.
* Skolemize the prenex form.
* Transform the Skolemized form into Conjunctive Normal Form (CNF).
* Transform the Skolemized form into Disjunctive Normal Form (DNF).

### Design
The project follows a Model-View Controller (MVC) design with a GUI/Frontend, Backend, and a Controller to handle communications between the two.

## To Run
### Current Release
V1.1 contains a functional GUI AND stubs for each classes.
V1.0 contains a functional GUI.

### Accepted Forms of Input
The syntax we will use for propositional formulas is the following: i.e., here are rules that should be used when putting together propositional formulas.
1. All letter from our roman alphabet _A = {a, ..., z}_ can be used as variables.
2. Skolem constants are denoted by alphabet letters from _A_ with a subscripted integer value (e.g., _x3_).
3. Skolem functions are denoted by _fn(.)_ where _n_ is a given integer.
4. The existential quantifier (there exists) is represented by TE.
5. The universal quantifier (for all) is represented by FA.
6. Predicate names start with a capital letter.
7. Given any predicate logic formula _P_, _not (P)_ will be represented as _!P_.
8. Given any two propositional formulas _P_ and _Q_:
	* the conjunction of _P_ and _Q_ will be represented as _(P & Q)_.
	* the disjunction of _P_ and _Q_ will be represented as _(P | Q)_.
	* the implication of _P_ and _Q_ will be represented as _(P -> Q)_.
	* _note that the parentheses are important, and part of the syntax to be used._

## Progress
### Apr13 Flow-Chart / Stubs / Readme
* Contains a Flow-Chart presented as a Word document.
* Contains a functional GUI.
* Contains a stubbed-Backend.
* Contains a Readme up to V1.1.