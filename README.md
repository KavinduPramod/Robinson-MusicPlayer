# Robinson Music Player

![Robinson Music Player Logo](music/mylogo.png)

The Robinson Music Player is a Java application developed using Java SDK 18 and built with Maven. It provides a simple interface to play music files from the "music" folder located in the application directory.

## Features

- Plays music files from the "music" folder in the application directory.
- Supports common music file formats like MP3, WAV, and FLAC.
- Play, pause, reset, and navigate between songs.
- Adjustable playback speed and volume controls.

## Getting Started

1. Clone the project repository.
2. Ensure you have Java SDK 18 and Maven installed.
3. Add your music files in the "music" folder within the application directory.
4. Build the project using Maven: `mvn clean install`.
5. Run the application: `mvn javafx:run`.

## Usage

1. Upon launching the application, it will automatically search for music files in the "music" folder.
2. The player interface will be displayed, showing the first song from the "music" folder.
3. Use the play, pause, reset, previous, and next buttons to control playback.
4. Adjust the playback speed and volume using the respective controls.

Note: To play music, ensure you have added your music files to the "music" folder within the application directory.

## Dependencies

The project utilizes the following dependencies:

- JavaFX (javafx-controls, javafx-fxml)
- JUnit Jupiter (junit-jupiter-api, junit-jupiter-engine)
- Compose Media (com.github.fengdai.compose:media)
- AirCore Media (io.aircore.media:aircore-media)
- Other dependencies as specified in the `pom.xml` file.

## License

This project is licensed under the [MIT License](LICENSE).
