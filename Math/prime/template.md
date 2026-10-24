# Sieve of Eratosthenes

HandTyped by Sai Charan Gottipalli

Use the Sieve of Eratosthenes to find all prime numbers up to `n`, then locate the *n*th prime (increase the limit if needed).

```java
boolean[] prime = new boolean[n + 1];
Arrays.fill(prime, true); // Initially, all numbers are marked prime
prime[0] = false; // 0 is not prime
prime[1] = false; // 1 is not prime

for (int i = 2; i * i <= n; i++) {
    if (prime[i]) {
        for (int j = i * i; j <= n; j += i) {
            prime[j] = false; // Mark all multiples of i as not prime
        }
    }
}
```

After the sieve, `prime[i] == true` means `i` is prime.

## Complexity

- Time: `O(n log(log(n)))`
- Space: `O(n)`
