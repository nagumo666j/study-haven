# THE INVESTIGATOR

**Every Lesson Hides a Clue.**

An Arabic-first, offline Android study companion presented as a retro 16-bit detective game. Each subject is an independent case file: add units and lessons, collect evidence, test your understanding, and build your detective rank through real study progress.

## Product identity
- Pixel Mystery / 16-bit detective atmosphere
- Midnight blue and charcoal surfaces, deep violet panels, amber evidence accents, emerald success states, and muted red errors
- Arabic-first interface with English case titles
- Android application ID: `com.theinvestigator.app`

## Current implementation
- Native Android Activity hosting the local app interface in a WebView
- Main menu, case board, case details, lesson workspace, evidence archive, and detective profile
- Starter cases for Mathematics, Physics, Chemistry, Arabic, and English
- User-created cases and lessons, locally saved notes, evidence collection, quiz prompts, progress, and XP
- Local browser storage; no account or advertising SDK is included
- Generated Web Audio sound effects for taps, clues, answers, cutscenes, and focus completion, with an in-app mute control
- Backup import validation and escaped user-provided case icons

## Build
The GitHub Actions workflow builds a debug APK on pushes to `main` and manual workflow dispatches.

Artifact name: `the-investigator-debug-apk`

## Development roadmap
1. Visual foundation and reusable design system
2. Main menu, case board, and case details
3. Investigation workspace, focus timer, question types, and final verdict
4. Persistent local data layer, ranks, rewards, statistics, and customization
5. Room database migration, statistics/customization, accessibility and device testing, and release APK

## Important implementation note
This repository is being migrated in stages. The current interface is an offline-first prototype; features in the roadmap are not represented as complete until implemented and tested on Android. The current data layer uses WebView local storage and will need a migration to a structured Room database before the full modular Kotlin architecture is considered complete.
