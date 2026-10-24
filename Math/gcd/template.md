# GCD and LCM Template

HandTyped by Sai Charan Gottipalli

## GCD

For two numbers `a` and `b`, assume `a > b`; otherwise, swap them.

```java
while (b != 0) {
    int rem = a % b;
    a = b;
    b = rem;
}
return a; // a is the GCD of the two numbers
```

## LCM

```java
lcm = (a * b) / gcd(a, b);
```

## Complexity

- Time: `O(log(min(a, b)))`
- Space: `O(1)`
