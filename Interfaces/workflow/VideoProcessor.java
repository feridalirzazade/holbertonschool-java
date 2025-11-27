import java.util.ArrayList;
import java.util.List;

public class VideoProcessor {

    // 1️⃣ Bütün notification kanalları burda saxlanır
    private List<NotificationChannel> channels = new ArrayList<>();

    // 2️⃣ Constructor (opsional)
    public VideoProcessor() {
        // channels artıq default olaraq yaradılıb, burda boş da qala bilər
    }

    // 3️⃣ Kanal əlavə etmək üçün metod
    public void registerChannel(NotificationChannel channel) {
        channels.add(channel);
    }

    // 4️⃣ Video işlənəndə bütün kanallara mesaj göndərir
    public void process(Video video) {
        // Mesajı yarat: "<video adı> - <format>"
        Message message = new Message(video.getFile() + " - " + video.getFormat(), MessageType.LOG);

        // Bütün kanallara notify çağır
        for (NotificationChannel channel : channels) {
            channel.notify(message);
        }
    }
}
