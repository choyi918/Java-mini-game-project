package com.young.game.objects.button;

import com.young.game.ui.CanvasMain;

import java.awt.*;

public class ButtonRankingShowing extends Button{
    public ButtonRankingShowing() {
        super("button_ranking.png", "button_ranking_pointed.png");
    }

    @Override
    public void draw(Graphics g) {
        CanvasMain observer = CanvasMain.getInstance();

        int dw = CanvasMain.DW;
        int dh = CanvasMain.DH;

        int x = 0 + 7 * dw;
        int y = 0 + 17 * dh;

        int w = 8 * dw;
        int h = 1 * dh;

        if (bPointed) {
            g.setColor(new Color(0xFF, 0xFF, 0xFF, 100));
            g.fillRect(x, y, w, h);
            g.drawImage(imagePointed, x, y, w, h, observer);
            g.setColor(Color.BLACK);
        }
        else {
            g.setColor(new Color(0xFF, 0xFF, 0xFF, 100));
            g.fillRect(x, y, w, h);
            g.drawImage(imageDefault, x, y, w, h, observer);
            g.setColor(Color.BLACK);
        }
    }
}
