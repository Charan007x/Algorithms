# Sliding Window Templates

HandTyped by Sai Charan Gottipalli

## Template 1: Basic Template for Sliding Window

<details open>
<summary>Java</summary>

```java
while (h < n) {
    // Include the high value, e.g. sum + a[h]
    while (conditionFailing) {
        // Exclude the low value, e.g. sum - a[l]
        l++;
    }
    // Calculate the result, e.g. max(sum, result)
    h++;
}
```

</details>
<details>
<summary>Python</summary>

```python
while h < n:
    # Include the high value, e.g. sum + a[h]
    while condition_failing:
        # Exclude the low value, e.g. sum - a[l]
        l += 1
    # Calculate the result, e.g. max(sum, result)
    h += 1
```

</details>
<details>
<summary>C++</summary>

```cpp
while (h < n) {
    // Include the high value, e.g. sum + a[h]
    while (conditionFailing) {
        // Exclude the low value, e.g. sum - a[l]
        l++;
    }
    // Calculate the result, e.g. max(sum, result)
    h++;
}
```

</details>

> Works only for positive numbers. Use prefix sum to handle non-positive numbers, including zero.

## Template 2: Find Length

<details open>
<summary>Java</summary>

```java
while (h < n) {
    // Include the high value, e.g. sum + a[h]
    while (conditionFailing) {
        // Exclude the low value, e.g. sum - a[l]
        l++;
    }
    max = Math.max(max, h - l + 1); // h - l + 1 is the window size
    h++;
}
```

</details>
<details>
<summary>Python</summary>

```python
while h < n:
    # Include the high value, e.g. sum + a[h]
    while condition_failing:
        # Exclude the low value, e.g. sum - a[l]
        l += 1
    max_length = max(max_length, h - l + 1)  # h - l + 1 is the window size
    h += 1
```

</details>
<details>
<summary>C++</summary>

```cpp
while (h < n) {
    // Include the high value, e.g. sum + a[h]
    while (conditionFailing) {
        // Exclude the low value, e.g. sum - a[l]
        l++;
    }
    maxLength = std::max(maxLength, h - l + 1); // h - l + 1 is the window size
    h++;
}
```

</details>

## Template 3: Count Subarrays

<details open>
<summary>Java</summary>

```java
while (h < n) {
    // Include the high value, e.g. sum + a[h]
    while (conditionFailing) {
        // Exclude the low value, e.g. sum - a[l]
        l++;
    }
    count += h - l + 1; // Number of valid subarrays ending at h
    h++;
}
```

</details>
<details>
<summary>Python</summary>

```python
while h < n:
    # Include the high value, e.g. sum + a[h]
    while condition_failing:
        # Exclude the low value, e.g. sum - a[l]
        l += 1
    count += h - l + 1  # Number of valid subarrays ending at h
    h += 1
```

</details>
<details>
<summary>C++</summary>

```cpp
while (h < n) {
    // Include the high value, e.g. sum + a[h]
    while (conditionFailing) {
        // Exclude the low value, e.g. sum - a[l]
        l++;
    }
    count += h - l + 1; // Number of valid subarrays ending at h
    h++;
}
```

</details>

## Template 4: Fixed Size Window

Say `k` is the size of the fixed window.

<details open>
<summary>Java</summary>

```java
for (int i = 0; i < k; i++) {
    // Include the first k elements, e.g. sum += a[i]
}

while (h < n) {
    // Include the high value, e.g. sum += a[h]
    // Exclude the low value, e.g. sum -= a[l]
    // Calculate the result, e.g. max(sum, result)
    l++;
    h++;
}
```

</details>
<details>
<summary>Python</summary>

```python
for i in range(k):
    # Include the first k elements, e.g. sum += a[i]
    pass

while h < n:
    # Include the high value, e.g. sum += a[h]
    # Exclude the low value, e.g. sum -= a[l]
    # Calculate the result, e.g. max(sum, result)
    l += 1
    h += 1
```

</details>
<details>
<summary>C++</summary>

```cpp
for (int i = 0; i < k; i++) {
    // Include the first k elements, e.g. sum += a[i]
}

while (h < n) {
    // Include the high value, e.g. sum += a[h]
    // Exclude the low value, e.g. sum -= a[l]
    // Calculate the result, e.g. max(sum, result)
    l++;
    h++;
}
```

</details>
