# Events Calendar - Assignment 3 (Phase 2)

## Project Overview
This project implements an Events Calendar for Ashesi University, developed through multiple phases. 
In **Assignment 3**, the focus is on establishing **"IS-A" relationships** using **Interfaces** to create contracts for different event types. The system uses a Composition-based design pattern to manage complex events like "Mega Wellness Day."

## Structure
- **src/**: Contains all source code files.
  - `Event.java`: Core event class. Implements **`infoEvent`** and **`timelinesEvent`**.
  - `Games.java`: Represents competitive events. Implements **`infoEvent`** and **`timelinesEvent`**.
  - `WellnessActivity.java`: Represents health sessions. Now implements **`infoEvent`**.
  - `MegaWellnessActivityEvent.java`: Composite class aggregating the main Event plus lists of Games and Activities.
  - `infoEvent.java`: Interface defining the contract for basic event information.
  - `timelinesEvent.java`: Interface defining the contract for scheduling activities.

- **test/**: Contains JUnit tests to verify functionality and relationships.
  - `TestRelationships.java`: **(New for Assign 3)** Verifies that classes correctly implement interfaces using `instanceof`.
  - `EventTest.java`: Unit tests for the Event class.
  - `GamesTest.java`: Unit tests for the Games class.
  - `WellnessActivityTest.java`: Unit tests for Wellness Activities.
  - `MegaWellnessEventTest.java`: Tests the composite functionality.

- **bin/**: Compiled class files.

## Key Changes in Assignment 3
1. **Interfaces:**
   - **`infoEvent`**: Now implemented by `WellnessActivity` in addition to `Event` and `Games`. This unifies all event components under a single type for information retrieval.
   - **`timelinesEvent`**: Continues to enforce scheduling capabilities for `Event` and `Games`.

2. **Design (UML):**
   - The design now strictly follows **Realization** relationships (dashed arrows in UML).
   - **`WellnessActivity` IS-A `infoEvent`**.
   - **`Event` IS-A `infoEvent` & `timelinesEvent`**.
   - **`Games` IS-A `infoEvent` & `timelinesEvent`**.

## How to Run
As this assignment focuses on unit testing and class structure, there is no main driver program.

**To verify the code:**
1. Open the **Testing** tab in your IDE (VS Code).
2. Run **`TestRelationships.java`**.
   - Passing this test confirms that the "IS-A" relationships and interfaces are correctly implemented.
3. Run all other tests to ensure no previous functionality was broken.