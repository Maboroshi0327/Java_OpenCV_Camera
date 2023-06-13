import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.videoio.VideoCapture;
import org.opencv.highgui.HighGui;

public class Main {
    // Compulsory
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) {
        VideoCapture camera = new VideoCapture(0);
        Mat frame = new Mat();

        while (true) {
            if (camera.read(frame)) {
                HighGui.imshow("Camera", frame);
                HighGui.waitKey(10);
                if (HighGui.n_closed_windows != 0) {
                    break;
                }
            }
        }
        System.exit(0);
    }
}