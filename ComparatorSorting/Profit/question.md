Problem Statement
You are given **two integer arrays** `a` and `b` of equal length `n`.
- Each index `i` represents a **paired record** `(a[i], b[i])`
- You must **sort the pairs** based on the following rules:
- 
### Sorting Rules
1. Sort by `a[i]` in **ascending order**
2. If there is a tie in `a[i]`, sort by `b[i]` in **descending order**
3. The relative connection between `a[i]` and `b[i]` must be preserved

Return the sorted versions of arrays `a` and `b`.

## Input Format
- `a`: integer array of length `n`
- `b`: integer array of length `n`
## Output Format
- Two arrays:
  - Sorted `a`
  - Sorted `b`
- After sorting, `(a[i], b[i])` must represent the same pair as before
## Constraints
- `1 ≤ n ≤ 10⁵`
- `-10⁹ ≤ a[i], b[i] ≤ 10⁹`
- `a.length == b.length`

## 🧪 Examples
**Input**
### Example 1

**Input**
a = [3, 1, 2]
b = [30, 10, 20]
**Output**
a = [1, 2, 3]
b = [10, 20, 30]


### Example 2 (Tie Case)
**Input**
a = [2, 1, 2, 1]
b = [10, 40, 30, 20]
**Output**
a = [1, 1, 2, 2]
b = [40, 20, 30, 10]

