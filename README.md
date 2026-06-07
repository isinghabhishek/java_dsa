<div align="center">

# ☕ Java Programming DSA — Basic to Advanced

**A structured, hands-on roadmap for Java fundamentals, classical algorithms, and competitive-level data structures.**

[![Java](https://img.shields.io/badge/Java-17%2B-orange?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![DSA](https://img.shields.io/badge/Focus-Data%20Structures%20%26%20Algorithms-blue?style=for-the-badge)](./29%20Dynamic%20Programming)
[![Topics](https://img.shields.io/badge/Modules-29%20%2B%20Practice-green?style=for-the-badge)](./Practices)
[![License](https://img.shields.io/badge/License-MIT-lightgrey?style=for-the-badge)](./LICENSE)

[Quick Start](#-quick-start) · [Learning Roadmap](#-learning-roadmap) · [Topic Index](#-complete-topic-index) · [Best Practices](#-best-practices)

</div>

---

## 📖 About This Repository

This repository is a **complete learning archive** for the Java programming language and Data Structures & Algorithms (DSA). It progresses from first principles—flowcharts, variables, and control flow—through classical interview problems and advanced optimization techniques including **graphs**, **tries**, and **dynamic programming**.

Each numbered folder maps to a curriculum module. Every `.java` file is a self-contained program you can compile and run independently. The collection includes implementations of widely recognized problems such as:

| Classical Problem | Module | File |
|---|---|---|
| **Catalan Numbers** | [29 Dynamic Programming](./29%20Dynamic%20Programming) | `CatalansNumber.java` |
| **Indian Coin Change** | [22 Greedy Algorithms](./22%20Greedy%20Algorithms) | `IndianCoins.java` |
| **Chocola Problem** | [22 Greedy Algorithms](./22%20Greedy%20Algorithms) | `ChocolaProblem.java` |
| **Dijkstra's Algorithm** | [28 Graphs](./28%20Graphs) | `DijkstrasAlg.java` |
| **0/1 & Unbounded Knapsack** | [29 Dynamic Programming](./29%20Dynamic%20Programming) | `KnapSack.java` |
| **N-Queens / Sudoku** | [16 BackTracking](./16%20BackTracking) | `NQueens.java`, `SudokuSolver.java` |
| **Kadane's Algorithm** | [08 Arrays](./08%20Arrays) | `Kadans.java` |
| **Merge & Quick Sort** | [15 Divide&Conquer](./15%20Divide%26Conquer) | `MergeSort.java`, `QuickSort.java` |

> **Note:** Folder `17` (Time & Space Complexity) and **Segment Trees** are referenced in the curriculum but do not have dedicated directories in this repository yet.

---

## 🚀 Quick Start

### Prerequisites

- **JDK 8+** installed ([OpenJDK](https://openjdk.org/) or Oracle JDK)
- A terminal (PowerShell, CMD, Bash, or Zsh)
- Optional: VS Code / IntelliJ IDEA with Java extensions

Verify your installation:

```bash
java -version
javac -version
```

### Compile & Run Any Program

Navigate to the folder containing the `.java` file, then compile and execute:

```bash
# Example: run Kadane's algorithm from the Arrays module
cd "08 Arrays"
javac Kadans.java
java Kadans
```

**Windows (PowerShell):**

```powershell
cd "08 Arrays"
javac Kadans.java
java Kadans
```

**Run from repository root** (without changing directory):

```bash
javac "08 Arrays/Kadans.java"
java -cp "08 Arrays" Kadans
```

### Multi-Class Files

If a file references other classes in the same directory, compile all related sources together:

```bash
javac "19 LinkedLists/LinkedList.java"
java -cp "19 LinkedLists" LinkedList
```

For files using Java Collections Framework (JCF), no external dependencies are required—everything uses the standard library.

---

## 🗺️ Learning Roadmap

The curriculum is organized into **8 progressive stages**. Follow them in order if you are learning from scratch, or jump directly to any stage that matches your current level.

---

### Stage 1 — Foundations & Java Syntax
> *Goal: Understand how Java programs are structured and how data flows through basic constructs.*

| Module | Summary |
|---|---|
| [01 Flowcharts](./01%20Flowcharts) | Visual program design using flowchart notation before writing code. |
| [02 Variables & Data Types](./02%20Variables%20&%20Data%20Types) | Variables, primitives, I/O, arithmetic—`CircleArea`, `GST`, `swapTwo`, type casting. |
| [03 Operators](./03%20Operators) | Arithmetic, relational, logical, and bitwise operator reference notes. |
| [04 If Else Stmt](./04%20If%20Else%20Stmt) | Conditional branching—leap year, tax calculator, greatest-of-numbers, temperature conversion. |

**Key skills:** Reading flowcharts, declaring variables, writing decision logic.

---

### Stage 2 — Control Flow & Abstraction
> *Goal: Master iteration, pattern logic, and reusable functions.*

| Module | Summary |
|---|---|
| [05 Flow Control(Loops)](./05%20Flow%20Control(Loops)) | `for`, `while`, `do-while`, `break`/`continue`—factorial, primes, number reversal, multiplication tables. |
| [06 Patterns](./06%20Patterns) | Nested-loop pattern printing—pyramids, diamonds, Floyd's triangle, butterfly, hollow rhombus ([Patterns Advances](./06%20Patterns/Patterns%20Advances)). |
| [07 Function&Methods](./07%20Function%26Methods) | Methods, overloading, palindrome check, binary ↔ decimal conversion, optimized prime testing. |

**Key skills:** Loop invariants, nested iteration, modular function design.

---

### Stage 3 — Arrays, Sorting & Matrices
> *Goal: Work efficiently with contiguous memory and matrix problems.*

| Module | Summary |
|---|---|
| [08 Arrays](./08%20Arrays) | Linear/binary search, **Kadane's algorithm**, trapped rain water, buy/sell stock, triplet sum, subarray problems. |
| [09 Sorting Algorithms](./09%20Sorting%20Algorithms) | Bubble, selection, insertion, counting sort; comparison with built-in `Arrays.sort`. |
| [10 2D-Arrays](./10%202D-Arrays) | Spiral matrix, diagonal sum, transpose, search in row-column sorted matrix. |

**Key skills:** Two-pointer technique, prefix/suffix thinking, O(n log n) sorting trade-offs.

---

### Stage 4 — Strings, Bit Manipulation & OOP
> *Goal: Handle text processing, low-level bitwise tricks, and object-oriented design.*

| Module | Summary |
|---|---|
| [11 Strings](./11%20Strings) | Palindrome, anagrams, compression, substring search, StringBuilder, lexicographical order. |
| [12 Bit Manipulation](./12%20Bit%20Manipulation) | AND/OR/XOR, even/odd via bits, set-bit counting, fast exponentiation, XOR swap. |
| [13 Oops](./13%20Oops) | Classes, constructors, inheritance, polymorphism, abstract classes, interfaces, `static`/`super`. |

**Key skills:** Character-level string algorithms, bitmask patterns, encapsulation and inheritance hierarchies.

---

### Stage 5 — Recursion & Algorithmic Paradigms
> *Goal: Think recursively and apply divide-and-conquer and backtracking strategies.*

| Module | Summary |
|---|---|
| [14 Recursion](./14%20Recursion) | Base cases, factorial, Fibonacci, tiling problem, friend pairing, keypad combinations, all unique subsequences. |
| [15 Divide&Conquer](./15%20Divide%26Conquer) | **Merge sort**, **quick sort**, inversion count, rotated sorted array search, majority element. |
| [16 BackTracking](./16%20BackTracking) | **N-Queens**, N-Knights, rat in a maze, **Sudoku solver**, permutations, grid path counting. |

**Key skills:** Recurrence relations, pruning search trees, state-space exploration.

---

### Stage 6 — Linear Data Structures
> *Goal: Implement and apply fundamental ADTs—lists, stacks, and queues.*

| Module | Summary |
|---|---|
| [18 ArrayLists](./18%20ArrayLists) | Dynamic arrays, pair sum, container with most water, monotonic arrays, Java Collections sort ([collections/](./18%20ArrayLists/collections)). |
| [19 LinkedLists](./19%20LinkedLists) | Singly & doubly linked list from scratch, JCF `LinkedList` usage. |
| [20 Stacks](./20%20Stacks) | Stack via ArrayList/LinkedList/JCF, valid parentheses, next greater element, stock span, max rectangle in histogram. |
| [21 Queues](./21%20Queues) | Array/circular/linked-list queues, queue-from-two-stacks, stack-from-two-queues, Deque, first non-repeating character. |

**Key skills:** Pointer manipulation, amortized analysis, monotonic stack/queue patterns.

---

### Stage 7 — Greedy, Trees, Heaps & Hashing
> *Goal: Solve optimization and hierarchical data problems with the right structure.*

| Module | Summary |
|---|---|
| [22 Greedy Algorithms](./22%20Greedy%20Algorithms) | Activity selection, job sequencing, fractional knapsack, **Indian coins**, **Chocola problem**, max chain of pairs. |
| [23 Binary Trees](./23%20Binary%20Trees) | Tree construction, traversals, lowest common ancestor, min distance, top view. |
| [24 Binary Search Trees](./24%20Binary%20Search%20Trees) | BST operations, **AVL trees**, mirror/merge BST, largest BST subtree, sorted array → balanced BST. |
| [25 Heaps](./25%20Heaps) | Min/max heap, heap sort, connect N ropes, sliding window maximum, k-weakest rows ([PriorityQueues/](./25%20Heaps/PriorityQueues)). |
| [26 Hashing](./26%20Hashing) | Custom HashMap, HashSet/TreeMap operations, anagrams, subarray sum equals K, union/intersection, ticket itinerary. |

**Key skills:** Greedy proof intuition, tree traversals (BFS/DFS), heapify operations, O(1) average lookup.

---

### Stage 8 — Graphs, Tries & Dynamic Programming
> *Goal: Tackle the most advanced interview and competitive programming topics.*

| Module | Summary |
|---|---|
| [27 Tries](./27%20Tries) | Prefix tree construction, prefix search, longest word in dictionary, unique prefix problem. |
| [28 Graphs](./28%20Graphs) | BFS, DFS, topological sort, cycle detection, bipartite check, **Dijkstra**, Bellman-Ford, **Prim's/Kruskal's MST**, cheapest flight with K stops. |
| [29 Dynamic Programming](./29%20Dynamic%20Programming) | Fibonacci, climbing stairs, **Catalan numbers**, rod cutting, coin change, **Knapsack**, LCS/LIS, edit distance, matrix chain multiplication, wildcard matching. |

**Key skills:** Graph modeling, shortest-path algorithms, memoization vs tabulation, state compression.

---

## 📚 Complete Topic Index

<details>
<summary><strong>Click to expand the full module directory</strong></summary>

| # | Module | Highlights |
|---|---|---|
| 01 | [Flowcharts](./01%20Flowcharts) | Program flow visualization |
| 02 | [Variables & Data Types](./02%20Variables%20&%20Data%20Types) | Java basics, I/O, arithmetic |
| 03 | [Operators](./03%20Operators) | Operator reference |
| 04 | [If Else Stmt](./04%20If%20Else%20Stmt) | Conditional logic |
| 05 | [Flow Control(Loops)](./05%20Flow%20Control(Loops)) | Iteration, factorial, primes |
| 06 | [Patterns](./06%20Patterns) | Nested-loop patterns |
| 07 | [Function&Methods](./07%20Function%26Methods) | Methods, overloading, conversions |
| 08 | [Arrays](./08%20Arrays) | Search, Kadane's, rain water, stock |
| 09 | [Sorting Algorithms](./09%20Sorting%20Algorithms) | Bubble → counting sort |
| 10 | [2D-Arrays](./10%202D-Arrays) | Spiral matrix, transpose |
| 11 | [Strings](./11%20Strings) | Palindrome, anagrams, compression |
| 12 | [Bit Manipulation](./12%20Bit%20Manipulation) | Bitwise ops, fast power |
| 13 | [Oops](./13%20Oops) | OOP pillars in Java |
| 14 | [Recursion](./14%20Recursion) | Subsequences, tiling, pairing |
| 15 | [Divide&Conquer](./15%20Divide%26Conquer) | Merge/quick sort, inversions |
| 16 | [BackTracking](./16%20BackTracking) | N-Queens, Sudoku, maze |
| 18 | [ArrayLists](./18%20ArrayLists) | Dynamic lists, two-pointer |
| 19 | [LinkedLists](./19%20LinkedLists) | LL implementation |
| 20 | [Stacks](./20%20Stacks) | Stack ADT, histogram, NGE |
| 21 | [Queues](./21%20Queues) | Queue ADT, Deque |
| 22 | [Greedy Algorithms](./22%20Greedy%20Algorithms) | Activity selection, Indian coins |
| 23 | [Binary Trees](./23%20Binary%20Trees) | Traversals, LCA, top view |
| 24 | [Binary Search Trees](./24%20Binary%20Search%20Trees) | BST, AVL, balancing |
| 25 | [Heaps](./25%20Heaps) | Heap sort, sliding window max |
| 26 | [Hashing](./26%20Hashing) | HashMap/Set, subarray sum K |
| 27 | [Tries](./27%20Tries) | Prefix tree, word search |
| 28 | [Graphs](./28%20Graphs) | Dijkstra, MST, topological sort |
| 29 | [Dynamic Programming](./29%20Dynamic%20Programming) | Catalan, Knapsack, LCS, MCM |
| — | [Practices](./Practices) | Miscellaneous warm-up problems |

</details>

---

## 🧠 Best Practices

### Complexity Analysis

Before optimizing, always state the **time** and **space** complexity of your approach:

| Notation | Meaning | Example in This Repo |
|---|---|---|
| O(1) | Constant | HashMap lookup — [26 Hashing](./26%20Hashing) |
| O(log n) | Logarithmic | Binary search — [08 Arrays](./08%20Arrays) |
| O(n) | Linear | Kadane's algorithm — `Kadans.java` |
| O(n log n) | Linearithmic | Merge sort — [15 Divide&Conquer](./15%20Divide%26Conquer) |
| O(n²) | Quadratic | Naive nested loops — [06 Patterns](./06%20Patterns) |
| O(2ⁿ) | Exponential | Naive recursion — [14 Recursion](./14%20Recursion) |

**Tip:** Draw the recursion tree or loop nesting depth on paper before coding. Ask: *What grows with input size n?*

### Clean Code Guidelines

1. **One responsibility per method** — separate input, computation, and output logic.
2. **Meaningful names** — prefer `maxSubarraySum` over `mss`; the repo uses abbreviated names for brevity, but your production code should be descriptive.
3. **Avoid magic numbers** — extract constants (`final int MOD = 1_000_000_007`).
4. **Handle edge cases first** — empty arrays, single elements, negative numbers.
5. **Prefer `StringBuilder`** over string concatenation in loops ([11 Strings](./11%20Strings)).

### Recursive Stack Tracing

When debugging recursion ([14 Recursion](./14%20Recursion), [16 BackTracking](./16%20BackTracking)):

```
1. Identify the BASE CASE  → when does recursion stop?
2. Identify the RECURSIVE CASE → what smaller subproblem is solved?
3. Trace a small input by hand (e.g., n = 3)
4. Watch the call stack: each call pushes a frame; base case pops back up
```

Add temporary print statements at entry and exit of recursive calls to visualize the call stack:

```java
static int factorial(int n) {
    System.out.println("  → enter factorial(" + n + ")");
    if (n == 0) return 1;
    int result = n * factorial(n - 1);
    System.out.println("  ← exit  factorial(" + n + ") = " + result);
    return result;
}
```

### Suggested Study Workflow

```
Read concept → Trace example by hand → Read .java file → Modify & re-run → Solve variant
```

1. Pick a module from the [Learning Roadmap](#-learning-roadmap).
2. Read the code without running it; predict the output.
3. Compile and run; compare with your prediction.
4. Change one input or constraint and re-run.
5. Attempt the problem again from scratch without looking at the solution.

---

## 📁 Repository Structure

```
java_dsa/
├── 01 Flowcharts/              … 29 Dynamic Programming/
├── Practices/                  … Warm-up exercises
├── CODE_OF_CONDUCT.md
├── LICENSE
└── README.md                   ← You are here
```

Each module folder contains standalone `.java` files named after the problem or algorithm they implement. Subfolders exist in:

- `06 Patterns/Patterns Advances/`
- `18 ArrayLists/collections/`
- `25 Heaps/PriorityQueues/`

---

## 🤝 Contributing

Contributions are welcome! If you find a bug, want to add a new problem, or improve an existing solution:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/new-problem`)
3. Commit your changes
4. Open a Pull Request

Please follow the existing naming conventions and keep each file self-contained and compilable.

---

## 📄 License

This project is licensed under the [MIT License](./LICENSE).

---

<div align="center">

**Built with ☕ and persistence.**

If this repository helped your DSA journey, consider giving it a ⭐ on [GitHub](https://github.com/isinghabhishek/java_dsa).

</div>
