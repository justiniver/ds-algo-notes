# Dynamic Programming

### Nth Fibonacci Number
**Take 1**
````
Fibi(n):
    if (n = 1): return 0
    ElseIf (n = 2): return 1
    Else: return Fibi(n-1) + Fibi(n-2)
````

Runtime is ~ 1.618^n which is exponential which is not good

**Take 2**
````
M <- empty array, M[1] <- 0, M[2] <- 1
FibII(n):
    If (M[n] is not empty): return M[n]
    ElseIf (M[n] is empty):
        M[n] <- FibII(n-1) + FibII(n-2)
        return M[n]
````
Runtime is ~ 2n which is linear

## Approach
- Identify a set of **sub-problems**
- relate the sub-problems via a **recurrence**
- find an **efficient algorithm** to solve the recurrence (top down or bottom up)

