# Katas

This is a repository where I will attempt some katas in many lanquages using TDD.

## Organization

The katas will be seperated by years and languages.

For example:

- `2025/java`
- `2025/ts`
- `2025/kotlin`

## Branches

I will be using gitflow for managing branches.
For each year, kata and language, I will create a feature branch named like so:

`year/language/kata`

## Commits

I will try to set the following commit messages for the following objectifs:

- start a project: `feat(lang/kata): init project`
- cut the kata's problem into tiny problems: `feat(lang/kata): problem disovery`

Then for each problem defined, follow these commits till all of them are solved:

- writing tests for each problem: `test(lang/kata): failing test for problem`
- making the tests pass: `feat(lang/kata): solving problem`
- refactoring the code: `refactor(lang/kata): refactoring problem`
