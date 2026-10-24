# Prefix Sum Templates

HandTyped by Sai Charan Gottipalli

> These templates are for immutable input. Use a segment tree when the input is mutable.

## Template 1: 1D Prefix Sum

Build a prefix sum where `pre[i]` is the sum of the first `i` elements.

```java
int[] pre = new int[n + 1];
for (int i = 1; i <= n; i++) {
    pre[i] = pre[i - 1] + a[i - 1];
}
```

For an inclusive range query `[l, h]` using 1-based indices:

```java
int sum = pre[h] - pre[l - 1];
```

- Precomputation time: `O(n)`
- Query time: `O(1)`
- Space: `O(n)`

## Template 2: 2D Prefix Sum

Build a prefix sum where `pre[i][j]` is the sum of the first `i` rows and `j` columns.

```java
int[][] pre = new int[n + 1][m + 1];
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= m; j++) {
        pre[i][j] = pre[i - 1][j] + pre[i][j - 1]
                  - pre[i - 1][j - 1] + a[i - 1][j - 1];
    }
}
```

For an inclusive rectangle from row `r1` to `r2` and column `c1` to `c2`, using 1-based indices:

```java
int sum = pre[r2][c2] - pre[r1 - 1][c2]
        - pre[r2][c1 - 1] + pre[r1 - 1][c1 - 1];
```

- Precomputation time: `O(n * m)`
- Query time: `O(1)`
- Space: `O(n * m)`
