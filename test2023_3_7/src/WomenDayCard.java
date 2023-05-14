/**
 * @Author: 冰激凌
 * @Date: 2023-03-07 22:35
 **/



import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 * @Author libin9iOak
 *
 *
 */
public class WomenDayCard extends Application {

    private static final int WIDTH = 999;
    private static final int HEIGHT = 666;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // 创建画布
        Canvas canvas = new Canvas(WIDTH, HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // 绘制背景
        gc.setFill(Color.PINK);
        gc.fillRect(0, 0, WIDTH, HEIGHT);

        // 绘制文字
        gc.setFill(Color.WHITE);
        gc.setFont(Font.font("Verdana", 50));
        gc.fillText("2023 Happy Women's Day!", 200, 200);

        // 绘制图形
        gc.setFill(Color.RED);
        gc.fillOval(500, 300, 100, 100);
        gc.setFill(Color.GREEN);
        gc.fillOval(550, 350, 100, 100);
        gc.setFill(Color.BLUE);
        gc.fillOval(600, 400, 100, 100);

        // 将画布添加到场景中
        Group root = new Group();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);


        // 显示场景
        primaryStage.setTitle("2023 Women's Day Card");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



