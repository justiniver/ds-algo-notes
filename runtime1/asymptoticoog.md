## What is Asymptotic Order of Growth?

- Runtime depends on size of input
- Runtime may depend on input itself

**We care about how algorithms scale**, not small inputs

## Big-Oh Notation

![Big-Oh Rules](/Users/justiniverson/Desktop/codingstuff/CS3000/ds-algo-notes/resources/bigohrules.png)

- We look at the behavior of the graph at large inputs
- Regular 'Big-Oh' refers to the worst case complexity

**Given functions f and g, how to tell if f = O(g)?**

- Plot both functions
  - Gives good intuition but is not a formal proof
- Finding limit of the ratio
  - A semiformal proof that is good enough for our purposes
  - Not always easy to compute
- Proving from first principles
  - Will get back to this

## Proving From First-Principles
Formally, **f(n) = O(g(n))** if constant **c > 0** exists and natural number **n0** 
exists such that **f(n) <= c*g(n)** for all **n >= n0**

![First-Principles Example](/Users/justiniverson/Desktop/codingstuff/CS3000/ds-algo-notes/resources/fisrtprinciples.png)

## Limits Are Easier
![Limits Example](/Users/justiniverson/Desktop/codingstuff/CS3000/ds-algo-notes/resources/limits1.png)

- Just always use limits
- Know your log properties (e.g., bring exponent to front)

## Big-Omega and Big-Theta
![Omega and Theta](/Users/justiniverson/Desktop/codingstuff/CS3000/ds-algo-notes/resources/omegatheta.png)

## Little-Oh and Little-Omega Notation

- Exactly the same of Big-Oh notation but means for:
  - f(n) = o(g(n)), f(n) needs to grow at a strictly **slower** rate (not =)
- Exactly the same of Big-Omega notation but means for:
  - f(n) = o(g(n)), f(n) needs to grow at a strictly **faster** rate (not =)