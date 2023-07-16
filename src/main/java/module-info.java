module com.example.robinson_music_player {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.robinson_music_player to javafx.fxml;
    exports com.example.robinson_music_player;
}