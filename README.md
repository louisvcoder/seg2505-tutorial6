# SEG2505 — Lab 5: RecyclerView

The Android Studio project is in `recyclerview/`.

## Observed behavior

- A Java RecyclerView first displayed four supplied names.
- The current version creates a 40-element String array. A for loop assigns Person 1 through Person 40.
- The adapter displays each stored string in an Android built-in text row.
- The app ran in Android Studio's Medium Phone emulator and was scrolled to Person 40. Original-resolution screenshots of the beginning and end of the list are in `evidence/Lab5_list_top.png` and `evidence/Lab5_list_bottom.png`. Earlier screenshots are retained in `evidence/`.

## Open and run

1. Open `recyclerview/` as a project in Android Studio.
2. Install the project's requested Android SDK components if prompted, and let Gradle sync. The checked-in configuration uses compile/target SDK 37, minimum SDK 30, Android Gradle Plugin 9.4.1, and Gradle wrapper 9.6.0.
3. Select a compatible emulator or device and run the app module.

## Main files

- `FirstFragment.java`: initializes the data, layout manager and adapter.
- `ItemsAdapter.java`: creates a row, binds one array element to its text, and reports the array length.
- `fragment_first.xml`: declares the RecyclerView.

## Sources and assistance

- Android Studio generated the original application template.
- Required Android reference: https://developer.android.com/develop/ui/views/layout/recyclerview
- AI tutoring supplied the adapter scaffold, layout/connection examples and numbered test-data loop, and helped explain and debug the changes. The student entered the changes, ran the application and supplied the runtime screenshots.

