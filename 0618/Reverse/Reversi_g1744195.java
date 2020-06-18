package Reverse;

import java.awt.Color;

public class Reversi_g1744195{
  final Integer flame;

  protected Reversi_g1744195() {
    this.flame = 420;
    EZ.initialize(this.flame, this.flame);
  }
  void run(){
    EZRectangle Rectangle = EZ.addRectangle(
      this.flame/2, this.flame/2, this.flame, this.flame, Color.GREEN, true
      );
    this.createLine();
    this.createCircle();
  }

  /**
   * Create line
   */
  void createLine(){
    for(Integer x = 10; x <= this.flame; x += 50){
      EZLine Line1 = EZ.addLine(x, 10, x, this.flame-10, Color.BLACK);
    }
    for(Integer y = 10; y <= this.flame; y += 50){
      EZLine Line2 = EZ.addLine(10, y, this.flame-10, y, Color.BLACK);
    }
  }

  /* 
   * 
   */
  void createCircle(){
    EZCircle Circle1 = EZ.addCircle(185, 185, 40, 40, Color.WHITE, true);
    EZCircle Circle2 = EZ.addCircle(185, 235, 40, 40, Color.BLACK, true);
    EZCircle Circle3 = EZ.addCircle(235, 185, 40, 40, Color.BLACK, true);
    EZCircle Circle4 = EZ.addCircle(235, 235, 40, 40, Color.WHITE, true);
  }

}
