# Comparator Sorting

HandTyped by Sai Charan Gottipalli

Unlike `Arrays.sort` on primitive values, comparator sorting lets you define custom ordering rules.

For example, sort people by ascending height, then by descending weight when heights are equal. Sort an index array so the corresponding values in both arrays stay paired:

```java
int[] a = {1, 2, 3, 3, 5}; // Heights
int[] b = {10, 20, 30, 40, 50}; // Weights
int n = a.length;

Integer[] idx = new Integer[n];
for (int i = 0; i < n; i++) {
    idx[i] = i;
}

Arrays.sort(idx, (i, j) -> {
    if (a[i] != a[j]) {
        return a[i] - a[j]; // Height ascending
    }
    return b[j] - b[i]; // Weight descending
});

int[] c = new int[n]; // Sorted heights
int[] d = new int[n]; // Corresponding sorted weights
for (int i = 0; i < n; i++) {
    c[i] = a[idx[i]];
    d[i] = b[idx[i]];
}
```

- Sorting: `O(n log n)`
- Building the sorted arrays: `O(n)`

## Avoiding Integer Overflow

Subtracting values in a comparator can overflow when the integers are very large. Use `Integer.compare` instead:

```java
Arrays.sort(idx, (i, j) -> {
    if (a[i] != a[j]) {
        return Integer.compare(a[i], a[j]); // Height ascending
    }
    return Integer.compare(b[j], b[i]); // Weight descending
});
```
