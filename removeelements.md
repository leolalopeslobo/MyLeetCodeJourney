# What We Learned About `splice()` and Slicing

---

### 1. `splice()` Modifies the Original Array

- `array.splice(index, count)` removes `count` elements starting from `index`.
- It **mutates** the array **in place** — meaning the original array is changed.

---

### 2. Edge Case: Splicing While Iterating

- When you `splice()` inside a `for` loop that moves forward, the array shrinks, and elements shift left.
- If you don't adjust the loop (`i--`), the **next element gets skipped**.

#### Example (Incorrect):
```js
let nums = [2, 2, 3];
for (let i = 0; i < nums.length; i++) {
    if (nums[i] === 2) {
        nums.splice(i, 1); // removes nums[i], array shifts
        // i should be decreased, else 2nd '2' is skipped
    }
}
```

- Result (wrong): [2, 3]
- Expected: [3]


### 3. Safe Alternatives to Avoid splice() Side Effects

Option 1: Iterate Backwards
```js
for (let i = nums.length - 1; i >= 0; i--) {
    if (nums[i] === val) nums.splice(i, 1);
}
```
Option 2: Decrement i After Splicing
```js
for (let i = 0; i < nums.length; i++) {
    if (nums[i] === val) {
        nums.splice(i, 1);
        i--; // step back
    }
}
```
