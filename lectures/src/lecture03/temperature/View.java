package lecture03.temperature;

import javax.swing.JOptionPane;

public class View {
    // 사용자가 섭씨 온도를 입력받는 메소드
    double getTemperature() {
        String input = JOptionPane.showInputDialog(null, "섭씨 온도를 입력하세요:");
        int c = Integer.parseInt(input);
        return c;
    }

    // 섭씨 온도와 화씨 온도를 표시하는 메소드
    void showTemperature(double c, double f) {
        JOptionPane.showMessageDialog(null, "섭씨 온도: " + c + "\n화씨 온도: " + f);
    }
}
