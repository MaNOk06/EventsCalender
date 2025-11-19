# Ashesi Events Calendar - Assignment 2

## Project Overview
This project is a Java-based application designed to manage and schedule events for the Ashesi University Events Calendar. It uses a Composition-based design pattern to manage a `MegaWellnessActivityEvent`, which is composed of a main `Event`, various `Games`, and `WellnessActivity` sessions.

## Structure
- **src/**: Contains all source code files.
  - `Event.java`: Core event class implementing `infoEvent` and `timelinesEvent`.
  - `Games.java`: Represents game events, implements `infoEvent` and `timelinesEvent`.
  - `WellnessActivity.java`: Represents wellness sessions.
  - `MegaWellnessActivityEvent.java`: Composite class aggregating Event, Games, and Activities.
  - `infoEvent.java`: Interface for basic event information.
  - `timelinesEvent.java`: Interface for timeline management.
  - `DriverTest.java`: Main driver to demonstrate functionality.
- **test/**: Contains JUnit tests.
- **bin/**: Compiled class files.

## Interfaces (Assignment 2 Requirement)
1. **infoEvent**: Enforces standard getters for event details (Name, Type, Location, etc.).
2. **timelinesEvent**: Enforces methods for managing event schedules (`addActivity`, `getTimeline`).

## Design Choice (UML)
The design follows the "Composition over Inheritance" principle:
- `MegaWellnessActivityEvent` **HAS-A** `Event`.
- `MegaWellnessActivityEvent` **HAS-MANY** `Games`.
- `Event` and `Games` both **IMPLEMENT** `infoEvent` and `timelinesEvent`.

## Running the Driver
Open `src/DriverTest.java` and run the `main` method. It will create a Mega Wellness Day event, add massage sessions and foosball games, and display the full details in the console.