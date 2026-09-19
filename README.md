# Low Level Design (LLD)

An evolving collection of low-level design notes: software design principles, OOP patterns, and applied examples. Written for my own reference and for anyone learning system design.

## How to Navigate This Repo

- Each top-level topic is a numbered folder (e.g. `01-software-design-principles`).
- Each topic folder has a `README.md` index that links to its sub-topics.
- Each sub-topic has its own `README.md` containing:
  - a short explanation of the concept,
  - code snippets **embedded directly in the markdown** for quick reading on GitHub,
  - links to the same code as standalone files (`BadExample.java` / `GoodExample.java`).
- The `bad` examples show the anti-pattern; the `good` examples show the fix.

> Note on embedded code: inline snippets intentionally mirror the standalone `.java` files so readers can either scan the page or open/compile a real file. Keep the two in sync when you update an example.

## Table of Contents

| # | Section | Covers |
|---|---|---|
| 01 | [Software Design Principles](01-software-design-principles/README.md) | DRY, KISS, YAGNI |
| 02 | [SOLID Principles](02-solid-principles/README.md) | SRP (OCP, LSP, ISP, DIP) |
| 03 | [UML](03-unified-modelling-language/README.md) | UML, Class Diagrams |
